package com.ravi.datastructures.nonprimitive.linear.queue;

import com.ravi.datastructures.nonprimitive.linear.array.ArrayImpl;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class QueueTest<E> {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        QueueImpl<Integer> intQueue = new QueueImpl<>();

        ArrayList<ArrayImpl> arrays = new ArrayList<>();
        try {
            append(arrays, ArrayImpl.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        intQueue.offer(1);
        intQueue.offer(2);
        intQueue.offer(3);
        intQueue.offer(4);
        System.out.println(intQueue.peek());
        intQueue.forEach(integer -> System.out.print(integer + ", "));
        System.out.println(intQueue.poll());
        intQueue.forEach(integer -> System.out.print(integer + ", "));
        System.out.println(intQueue.element());
        intQueue.forEach(integer -> System.out.print(integer + ", "));


    }


    public static <E> void append(List<E> list, Class<E> cls) throws Exception {
        E elem = cls.newInstance();   // OK
        list.add(elem);
        System.out.println(list);
    }
}
