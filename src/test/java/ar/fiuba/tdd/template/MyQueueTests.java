package ar.fiuba.tdd.template;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MyQueueTests {

    @Test
    public void queueNewIsEmpty() {
        assertTrue((new MyQueue<String>().isEmpty()));
    }

    @Test
    public void queueNewHaveZeroElements() {
        assertEquals((new MyQueue<String>().size()),0);
    }

    private MyQueue<String> setQueueOneItem() {
        MyQueue<String> queue = new MyQueue<>();
        String word = "elemento1";
        queue.add(word);
        return queue;
    }

    @Test
    public void queueAddElementOneElement() {
        MyQueue<String> queue = this.setQueueOneItem();
        assertEquals(queue.size(),1);
    }

    @Test
    public void queueAddElementSameElement() {
        MyQueue<String> queue = this.setQueueOneItem();
        assertEquals(queue.top(),"elemento1");
    }

    @Test
    public void queueAddAnElementAndRemoveQueueEmpty() {
        MyQueue<String> queue = this.setQueueOneItem();
        queue.remove();
        assertTrue(queue.isEmpty());
    }
}
