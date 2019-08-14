package com.ravi.datastructures.nonprimitive.linear.stack;

import java.util.LinkedList;
import java.util.List;

public class StackImpl<Integer> {

    List<Integer> stack = new LinkedList<>();


    public Integer push(Integer element) {
        stack.add(element);
        return element;
    }

    public Integer pop() {

        return stack.remove(stack.size() - 1);
    }

    public Integer peek() {
        return stack.get(stack.size() - 1);
    }

    public int size() {
        return stack.size();
    }
}
