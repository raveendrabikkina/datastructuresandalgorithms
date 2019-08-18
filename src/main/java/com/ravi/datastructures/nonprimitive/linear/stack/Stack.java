package com.ravi.datastructures.nonprimitive.linear.stack;

public interface Stack<T> {
    T push(T element);

    T pop();

    T peek();

    int size();
}
