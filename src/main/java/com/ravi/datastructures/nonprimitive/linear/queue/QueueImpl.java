package com.ravi.datastructures.nonprimitive.linear.queue;

import java.util.*;

public class QueueImpl<E> implements Queue<E> {

    List<E> queue = new LinkedList<>();

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return queue.contains(o);
    }

    @Override
    public Iterator<E> iterator() {
        return queue.iterator();
    }

    @Override
    public Object[] toArray() {
        return queue.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return queue.toArray(a);
    }

    @Override
    public boolean add(E e) {
        return queue.add(e);
    }

    @Override
    public boolean remove(Object o) {
        return queue.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean offer(E e) {
        return queue.add(e);
    }

    @Override
    public E remove() {
        return queue.remove(0);
    }

    @Override
    public E poll() {
        return queue.remove(0);
    }

    @Override
    public E element() {
        if (queue.isEmpty()) {
            throw new NoSuchElementException("Empty Queue");
        }
        return queue.get(0);
    }

    @Override
    public E peek() {
        if (queue.isEmpty()) {
            return null;
        }
        return queue.get(0);
    }
}
