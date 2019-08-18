package com.ravi.datastructures.nonprimitive.linear.array;

import java.util.LinkedList;
import java.util.List;

public class ArrayImpl<T> implements IArray<T> {

    private List<T> array = new LinkedList<>();

    @Override
    public void remove(int index) {
        array.remove(index);
    }

    @Override
    public int size() {
        return array.size();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public void add(T element) {
        array.add(element);
    }

    @Override
    public T get(int index) {
        return array.get(index);
    }

    @Override
    public String toString() {
        return "ArrayImpl{" +
                "array=" + array +
                '}';
    }
}
