package com.apica.assignment.assignment2_queue;

import com.apica.assignment.assignment3_singleton.MySingleton;
import com.apica.assignment.assignment4_stream.StreamAssignment;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MyQueueTest {

    @Test
    void testRemove() throws QueueEmptyException {

        MyQueue<Integer> myQueue = new MyQueue<>();

        myQueue.add(1);
        myQueue.add(2);
        assertEquals(1,myQueue.remove());

    }

    @Test
    void testRemoveEx() throws QueueEmptyException {

        MyQueue<Integer> myQueue = new MyQueue<>();
        QueueEmptyException ex = assertThrows(QueueEmptyException.class, () -> myQueue.remove());
        //assertEquals("",ex.g);
        //TODO assert message
    }

    //TODO we can write negative testcases
}
