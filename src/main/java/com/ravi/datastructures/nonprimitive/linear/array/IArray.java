package com.ravi.datastructures.nonprimitive.linear.array;

public interface IArray<T>{

    void add(T element);
    
    void remove(int index);
    
    T get(int index);

    int size();

    boolean isEmpty();
}