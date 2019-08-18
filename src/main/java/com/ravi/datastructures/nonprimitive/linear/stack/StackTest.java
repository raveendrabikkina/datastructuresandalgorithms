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


        StackImpl<String> stackImpl2 = new StackImpl();
        stackImpl2.push("Ram");
        stackImpl2.push("Raheem");
        stackImpl2.push("Rob");
        stackImpl2.push("Ravi");
        System.out.println(stackImpl2.size());
        String pop2 = stackImpl2.pop();
        System.out.println(pop2);
        System.out.println(stackImpl2.size());
        pop2 = stackImpl2.pop();
        System.out.println(pop2);
        System.out.println(stackImpl2.size());
    }
}
