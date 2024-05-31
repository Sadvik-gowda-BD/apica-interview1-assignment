package com.apica.assignment.assignment2_queue;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue<E> {

    private Queue<E> queue = new LinkedList<>();

    public synchronized void add(E e) {
        queue.add(e);
    }

    public synchronized E remove() throws QueueEmptyException {
        if (queue.isEmpty()) {
            throw new QueueEmptyException("Queue is empty");
        }
        return queue.remove();
    }
}
