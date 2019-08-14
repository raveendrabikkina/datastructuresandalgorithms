package com.ravi.datastructures.nonprimitive.linear.array;

import java.util.List;
import java.util.LinkedList;

public class ArrayImpl<T> implements IArray<T>{

    List<T> array = new LinkedList<>();

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
}
