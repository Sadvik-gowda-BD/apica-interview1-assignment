package com.apica.assignment.assignment5_lock;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.ReentrantLock;

/*
There are many benefit of using ReentrantLock over Synchronization.
Here we can lock and unlock at any point and ReentrantLock provides more flexibility. Here we can use tryLock methods
to avoid a deadlocks and improving the system responsiveness etc.
 */
public class MyLockedQueue<E> {

    private Queue<E> queue = new LinkedList<>();
    private final ReentrantLock lock = new ReentrantLock();

    public void add(E e) {
        lock.lock();
        try {
            queue.add(e);
        } finally {
            lock.unlock();
        }

    }

    public E remove() throws QueueEmptyException {
        lock.lock();
        try {
            if (queue.isEmpty()) {
                throw new QueueEmptyException("Queue is empty");
            }
            return queue.remove();
        } finally {
            lock.unlock();
        }
    }
}
