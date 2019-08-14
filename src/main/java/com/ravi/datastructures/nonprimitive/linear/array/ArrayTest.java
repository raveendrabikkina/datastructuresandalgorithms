package com.ravi.datastructures.nonprimitive.linear.array;

public class ArrayTest {

    public static void main(String[] args) {
        ArrayImpl<Integer> arrayImpl = new ArrayImpl<>();
        arrayImpl.add(5);
        arrayImpl.add(2);
        arrayImpl.add(3);
        arrayImpl.add(4);
        arrayImpl.add(1);
        System.out.println(arrayImpl.size());
        arrayImpl.remove(4);
        System.out.println(arrayImpl.size());
    }
}