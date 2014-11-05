package net.deludobellico.commandops.estabeditor.util;

import java.util.*;

/**
 * Really (REALLY) crappy LinkedList trying to behave like a map.
 * Created by Heine on 10/29/2014.
 */
public class LimitedLinkedList<T> implements List<T> {
    int maxSize;
    LinkedList<T> buffer = new LinkedList<>();

    public LimitedLinkedList(Integer maxSize) {
        this.maxSize = maxSize;
    }

    @Override
    public int size() {
        return buffer.size();
    }

    @Override
    public boolean isEmpty() {
        return buffer.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return buffer.contains(o);
    }

    @Override
    public Iterator<T> iterator() {
        return buffer.iterator();
    }

    @Override
    public Object[] toArray() {
        return buffer.toArray();
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return buffer.toArray(a);
    }

    @Override
    public boolean add(T t) {
        boolean success = true;
        int index = buffer.indexOf(t);
        if (index != -1) {
            // found it, bring it forward
            buffer.addFirst(buffer.remove(index));
        } else {
            // add and trim
            buffer.addFirst(t);
            while (size() > maxSize)
                buffer.removeLast();
        }
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return buffer.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return buffer.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {

        Iterator<? extends T> it = c.iterator();
        while (it.hasNext()) {
            if (!add(it.next())) {
                //return false;
            }
        }

        return true;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        // I'm not gonna waste mah time, use a proper linked list
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return buffer.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return buffer.retainAll(c);
    }

    @Override
    public void clear() {
        buffer.clear();
    }

    @Override
    public T get(int index) {
        return buffer.get(index);
    }

    @Override
    public T set(int index, T element) {
        return buffer.set(index, element);
    }

    @Override
    public void add(int index, T element) {
        add(element);
    }

    @Override
    public T remove(int index) {
        return buffer.remove(index);
    }

    @Override
    public int indexOf(Object o) {
        return buffer.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return buffer.lastIndexOf(o);
    }

    @Override
    public ListIterator<T> listIterator() {
        return buffer.listIterator();
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return buffer.listIterator(index);
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return buffer.subList(fromIndex, toIndex);
    }

    @Override
    public String toString() {
        return buffer.toString();
    }
}
