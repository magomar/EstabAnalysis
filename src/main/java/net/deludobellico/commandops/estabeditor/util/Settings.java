package net.deludobellico.commandops.estabeditor.util;

import net.deludobellico.commandops.estabanalysis.util.FileIO;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by Heine on 10/28/2014.
 */
@XmlRootElement(name = "settings")
public class Settings {

    private static final Integer MAX_RECENT_FILES = 4;
    private static List<String> sourceRecentFiles = new LimitedLinkedList<>(MAX_RECENT_FILES);
    private static List<String> targetRecentFiles = new LimitedLinkedList<>(MAX_RECENT_FILES);
    private static Settings settings;
    private static String lastOpenedFolder;
    private static Double windowWidth;
    private static Double windowHeight;
    private static Boolean visibleToolbar;
    private static Boolean visibleSourcePanel;
    private static Boolean visibleTargetPanel;
    private static Boolean verticalPanes;
    private static Boolean expandedSourcePane;
    private static Boolean expandedTargetPane;


    private Settings() {
    }

    public static Settings getInstance() {
        if (settings == null) settings = new Settings();
        return settings;
    }

    public static void save() {
        FileIO.saveSettings();
    }

    public static void load() {
        FileIO.loadSettings();
    }

    @XmlElement(name = "source-recent-files")
    public List<String> getSourceRecentFiles() {
        return sourceRecentFiles;
    }

    public void setSourceRecentFiles(List<String> sourceRecentFiles) {
        sourceRecentFiles.addAll(sourceRecentFiles);
    }

    @XmlElement(name = "target-recent-files")
    public List<String> getTargetRecentFiles() {
        return targetRecentFiles;
    }

    public void setTargetRecentFiles(List<String> targetRecentFiles) {
        Settings.targetRecentFiles.addAll(targetRecentFiles);
    }

    @XmlElement(name = "window-width", required = true)
    public Double getWindowWidth() {
        return windowWidth;
    }

    public void setWindowWidth(Double windowWidth) {
        this.windowWidth = windowWidth;
    }

    @XmlElement(name = "window-height", required = true)
    public Double getWindowHeight() {
        return windowHeight;
    }

    public void setWindowHeight(Double windowHeight) {
        this.windowHeight = windowHeight;
    }

    @XmlElement(name = "visible-toolbar")
    public Boolean getVisibleToolbar() {
        return visibleToolbar;
    }

    public void setVisibleToolbar(Boolean visibleToolbar) {
        Settings.visibleToolbar = visibleToolbar;
    }

    @XmlElement(name = "visible-source-panel")
    public Boolean getVisibleSourcePanel() {
        return visibleSourcePanel;
    }

    public void setVisibleSourcePanel(Boolean visibleSourcePanel) {
        Settings.visibleSourcePanel = visibleSourcePanel;
    }

    @XmlElement(name = "visible-target-panel")
    public Boolean getVisibleTargetPanel() {
        return visibleTargetPanel;
    }

    public void setVisibleTargetPanel(Boolean visibleTargetPanel) {
        Settings.visibleTargetPanel = visibleTargetPanel;
    }

    @XmlElement(name = "vertical-panes")
    public Boolean getVerticalPanes() {
        return verticalPanes;
    }

    public void setVerticalPanes(Boolean verticalPanes) {
        Settings.verticalPanes = verticalPanes;
    }

    @XmlElement(name = "expanded-source-pane")
    public Boolean getExpandedSourcePane() {
        return expandedSourcePane;
    }

    public void setExpandedSourcePane(Boolean expandedSourcePane) {
        Settings.expandedSourcePane = expandedSourcePane;
    }

    @XmlElement(name = "expanded-target-pane")
    public Boolean getExpandedTargetPane() {
        return expandedTargetPane;
    }

    public void setExpandedTargetPane(Boolean expandedTargetPane) {
        Settings.expandedTargetPane = expandedTargetPane;
    }

    @XmlElement(name = "last-opened-folder")
    public String getLastOpenedFolder() {
        return lastOpenedFolder;
    }

    public void setLastOpenedFolder(String lastOpenedFolder) {
        Settings.lastOpenedFolder = lastOpenedFolder;
    }
}
