package com.ravi.datastructures.nonprimitive.linear.stack;

import java.util.LinkedList;
import java.util.List;

public class StackImpl<T> implements Stack<T> {

    List<T> stack = new LinkedList<>();

    public T push(T element) {
        stack.add(element);
        return element;
    }

    public T pop() {

        return stack.remove(stack.size() - 1);
    }

    public T peek() {
        return stack.get(stack.size() - 1);
    }

    public int size() {
        return stack.size();
    }
}
