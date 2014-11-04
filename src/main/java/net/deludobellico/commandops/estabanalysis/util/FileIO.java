package net.deludobellico.commandops.estabanalysis.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import net.deludobellico.commandops.estabeditor.util.Settings;
import javafx.stage.FileChooser;
import org.xml.sax.SAXParseException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Created by Mario on 24/07/2014.
 */
public class FileIO {
    /**
     * File  and folder paths
     */
    public static final String MAIN_VIEW = "./view/main.fxml";
    public static final String SETTINGS_XML_FILE = "settings.xml";
    public static final String RESOURCES_FOLDER = "/src/main/resources";
    public static final String ESTAB_DATASETS_FOLDER = RESOURCES_FOLDER + "/datasets";
    public static final String NEW_ESTAB_PATH = ESTAB_DATASETS_FOLDER + "/newestab.xml";
    /**
     * File filters
     */
    public static final FileChooser.ExtensionFilter[] FILECHOOSER_FILTERS = {
            new FileChooser.ExtensionFilter("XML (*.xml)", "*.xml"),
            new FileChooser.ExtensionFilter("All (*.*)", "*.*")
    };

    private static final Logger LOG = Logger.getLogger(net.deludobellico.commandops.estabanalysis.util.FileIO.class.getName());
    /**
     * JAXB paths
     */
    private static final String JAXB_CONTEXT_PATH = "net.deludobellico.commandops.estabeditor.data.jaxb";
    private static JAXBContext JAXB_CONTEXT;
    private static Marshaller MARSHALLER;
    private static Unmarshaller UNMARSHALLER;

    static {
        try {
            JAXB_CONTEXT = JAXBContext.newInstance(JAXB_CONTEXT_PATH);
            UNMARSHALLER = JAXB_CONTEXT.createUnmarshaller();
            MARSHALLER = JAXB_CONTEXT.createMarshaller();
            MARSHALLER.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    private FileIO() {
    }

    /**
     * Unmarshalls XML element from file into java object
     *
     * @param file the XML file to be unmarshalled
     * @return the object unmarshalled from the {@code file}
     */
    public static Object unmarshallXML(File file) {
        Object object = null;
        try {
            StreamSource source = new StreamSource(file);
            object = UNMARSHALLER.unmarshal(source);
        } catch (JAXBException ex) {
            LOG.log(Level.SEVERE, "Exception unmarshalling XML", ex);
        } finally {
            return object;
        }
    }

    /**
     * Marshalls Java object into XML file
     *
     * @param object object to be marshalled
     * @param file   file to save the marshalled object
     * @return the XML file
     */
    public static File marshallXML(Object object, File file) {
        try {
            try (FileOutputStream fos = new FileOutputStream(file)) {
                MARSHALLER.marshal(object, fos);
                return file;
            } catch (IOException ex) {
                LOG.log(Level.SEVERE, "Exception marshalling XML", ex);
            }
        } catch (JAXBException ex) {
            LOG.log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static StringWriter marshallXML(Object object) {
        try {
            try (StringWriter sw = new StringWriter()) {
                MARSHALLER.marshal(object, sw);
                return sw;
            } catch (IOException ex) {
                LOG.log(Level.SEVERE, "Exception marshalling XML", ex);
            }
        } catch (JAXBException ex) {
            LOG.log(Level.SEVERE, "Exception marshalling XML", ex);
        }
        return null;
    }

    /**
     * Marshalls Java object in a zipped XMl file
     *
     * @param object object to be marshalled
     * @param file   non zip file to save the marshalled object
     * @return the ZIP file
     */
    public static File marshallZipped(Object object, File file) {
        File zipFile = new File(file.getAbsolutePath() + ".zip");
        try {
            try {
                FileOutputStream fos = new FileOutputStream(zipFile);
                try (ZipOutputStream zos = new ZipOutputStream(new BufferedOutputStream(fos))) {
                    ZipEntry ze = new ZipEntry(file.getName());
                    zos.putNextEntry(ze);
                    MARSHALLER.marshal(object, zos);
                    return zipFile;
                } catch (IOException ex) {
                    LOG.log(Level.SEVERE, "Exception marshalling XML", ex);
                }
            } catch (FileNotFoundException ex) {
                LOG.log(Level.SEVERE, "Exception marshalling XML", ex);
            }

        } catch (JAXBException ex) {
            LOG.log(Level.SEVERE, "Exception marshalling XML", ex);
        }
        return null;
    }

    /**
     * Marshalls Java object in a gzipped XMl file
     *
     * @param object object to be marshalled
     * @param file   file to save the marshalled object
     * @return the Gzip file
     */
    public static File marshallGzipped(Object object, File file) {
        File gzFile = new File(file.getAbsolutePath() + ".gz");
        try {
            try {
                FileOutputStream fos = new FileOutputStream(gzFile);
                try {
                    GZIPOutputStream gz = new GZIPOutputStream(fos);
                    MARSHALLER.marshal(object, gz);
                    return gzFile;
                } catch (IOException ex) {
                    LOG.log(Level.SEVERE, "Exception marshalling XML", ex);
                }
            } catch (FileNotFoundException ex) {
                LOG.log(Level.SEVERE, "Exception marshalling XML", ex);
            }

        } catch (JAXBException ex) {
            LOG.log(Level.SEVERE, "Exception marshalling XML", ex);
        }
        return null;
    }

    public static List<File> listFiles(File directory, FilenameFilter filter, boolean recursively) {
        List<File> files = new ArrayList<>();
        File[] entries = directory.listFiles();
        for (File entry : entries) {
            if (filter == null || filter.accept(directory, entry.getName())) {
                files.add(entry);
            }
            if (recursively && entry.isDirectory()) {
                files.addAll(listFiles(entry, filter, recursively));
            }
        }

        return files;
    }

    /**
     * Unmarshalls Json element of type {@code c} from the {@code file}.
     *
     * @param c    the class of object to be unmarshalled
     * @param file the Json file containing the marshalled object
     * @return the object of type {@code T} from the {@code file}
     */
    public static <T> T unmarshallJson(File file, Class<T> c) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
        T object = null;
        try {
            object = mapper.readValue(file, c);
        } catch (IOException ex) {
            LOG.log(Level.SEVERE, "Exception unmarshalling Json", ex);
        }
        return object;
    }

    /**
     * Marshalls Java object into a Json file
     *
     * @param object object to be marshalled
     * @param file   file to save the marshalled object
     * @return
     */
    public static File marshallJson(Object object, File file) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
        ObjectWriter writer = mapper.writer().withDefaultPrettyPrinter();
        try {
            writer.writeValue(file, object);
            return file;
        } catch (IOException ex) {
            LOG.log(Level.SEVERE, "Exception marshalling Json", ex);
        }
        return null;
    }

    /*********************************************************************************/
    /*                                                                               */
    /*********************************************************************************/

    public static Settings loadProperties() {
        return null;
    }

    public static void loadSettings() {
        try {
            File file = new File(FileSystems.getDefault().getPath(System.getProperty("user.dir"), SETTINGS_XML_FILE).toString());
            if (!file.exists()) {
                file = getNewSettingsFile();
            }
            Unmarshaller um = JAXBContext.newInstance(Settings.class).createUnmarshaller();
            um.unmarshal(file);

        } catch (JAXBException e) {
            System.out.println(e);
            if (e.getLinkedException().getClass().equals(SAXParseException.class)) {
                LOG.log(Level.WARNING, "Settings file has incorrect syntax", e);
            }
        }
    }

    public static void saveSettings() {
        try {
            Marshaller m = JAXBContext.newInstance(Settings.class).createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            m.marshal(Settings.getInstance(), getFileOrCreateNew(SETTINGS_XML_FILE));

        } catch (JAXBException e) {
            LOG.log(Level.WARNING, "Couldn't save settings", e);
        }
    }

    /**
     * Tries to create a new file in @path, if it exists then returns the file
     *
     * @param path
     * @return
     */
    public static File getFileOrCreateNew(String path) {
        File f = null;

        try {
            f = new File(path);
            boolean exists = f.exists();
            if (!exists) {
                boolean createNew = f.createNewFile();
                if (!createNew) {
                    throw new IOException();
                }
            }
        } catch (IOException e) {
            LOG.log(Level.WARNING, "Error creating: " + path, new IOException());
        }
        return f;
    }

    public static File getFile(Path path) {
        return getFileOrCreateNew(path.toString());
    }

    public static File getNewEstabFile() {
        File f = null;
        try {
            f = getFileOrCreateNew(FileSystems.getDefault().getPath(System.getProperty("user.dir"), FileIO.NEW_ESTAB_PATH).toString());
            FileOutputStream fos = new FileOutputStream(f, false);
            fos.write("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><estab-data></estab-data>".getBytes());
            fos.close();
        } catch (FileNotFoundException e) {
            LOG.log(Level.SEVERE, "Error creating new estab file: " + f.getPath(), e);
        } catch (IOException e) {
            LOG.log(Level.SEVERE, "Error creating new estab file: " + f.getPath(), e);
        }
        return f;
    }

    public static File getNewSettingsFile() {
        File f = null;
        try {
            f = getFileOrCreateNew(FileSystems.getDefault().getPath(System.getProperty("user.dir"), FileIO.SETTINGS_XML_FILE).toString());
            FileOutputStream fos = new FileOutputStream(f, false);
            fos.write("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><settings><vertical-panes>true</vertical-panes><visible-source-panel>true</visible-source-panel><visible-target-panel>true</visible-target-panel><visible-toolbar>true</visible-toolbar><window-height>800.0</window-height><window-width>1280.0</window-width><expanded-source-pane>true</expanded-source-pane><expanded-target-pane>false</expanded-target-pane></settings>".getBytes());
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return f;
    }

    public static void copy(File sourceFile, File targetFile) {
        try {
            Files.copy(sourceFile.toPath(), targetFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * File.createNewFile() proxy
     *
     * @param file
     * @return
     */
    public static File createNewFile(File file) {
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }

    public static Path getNewEstabPath() {
        return FileSystems.getDefault().getPath(System.getProperty("user.dir"), FileIO.NEW_ESTAB_PATH);
    }

    public static Path getDatasetsPath() {
        return FileSystems.getDefault().getPath(System.getProperty("user.dir"), FileIO.ESTAB_DATASETS_FOLDER);
    }
}
