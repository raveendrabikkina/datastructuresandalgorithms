package com.ravi.datastructures.nonprimitive.linear.stack;

public class StackTest {
    public static void main(String[] args) {
        StackImpl<Integer> stackImpl = new StackImpl();
        stackImpl.push(12);
        stackImpl.push(11);
        stackImpl.push(10);
        System.out.println(stackImpl.size());
        Integer pop = stackImpl.pop();
        System.out.println(pop);
        System.out.println(stackImpl.size());
        pop = stackImpl.pop();
        System.out.println(pop);
        System.out.println(stackImpl.size());
    }
}
