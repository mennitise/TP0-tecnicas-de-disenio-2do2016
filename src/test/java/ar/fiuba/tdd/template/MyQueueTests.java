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

    @Test
    public void queueEmptyThrowsAssertionErrorAtTop() {
        MyQueue<String> queue = new MyQueue<>();
        try {
            queue.top();
            assert false;
        } catch (AssertionError e) {
            assert true;
        }
    }

    @Test
    public void queueEmptyThrowsAssertionErrorAtRemove() {
        MyQueue<String> queue = new MyQueue<>();
        try {
            queue.remove();
            assert false;
        } catch (AssertionError e) {
            assert true;
        }
    }

    private MyQueue<String> setQueueOneItem() {
        MyQueue<String> queue = new MyQueue<>();
        queue.add("element1");
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
        assertEquals(queue.top(),"element1");
    }

    @Test
    public void queueAddAnElementAndRemoveQueueEmpty() {
        MyQueue<String> queue = this.setQueueOneItem();
        queue.remove();
        assertTrue(queue.isEmpty());
    }

    private MyQueue<String> setQueueWithItems() {
        MyQueue<String> queue = new MyQueue<>();
        queue.add("element1");
        queue.add("element2");
        return queue;
    }

    private boolean evaluateQueueItems(MyQueue<String> queue) {
        boolean result = true;
        if (!queue.top().equals("element2")) {
            result = false;
        }
        queue.remove();
        if (!queue.top().equals("element1")) {
            result = false;
        }
        queue.remove();
        return result;
    }

    private void clearElementsOfQueue(MyQueue queue) {
        while (!queue.isEmpty()) {
            queue.remove();
        }
    }

    @Test
    public void queueAddTwoElementAndHaveTwo() {
        MyQueue<String> queue = this.setQueueWithItems();
        assertEquals(queue.size(),2);
    }

    @Test
    public void queueAddFiveElementAndRemoveQueueEmpty() {
        MyQueue<String> queue = this.setQueueWithItems();
        this.clearElementsOfQueue(queue);
        assertTrue(queue.isEmpty());
    }

    @Test
    public void queueAddFiveElementAndRemoveSizeZero() {
        MyQueue<String> queue = this.setQueueWithItems();
        this.clearElementsOfQueue(queue);
        assertEquals(queue.size(),0);
    }

    @Test
    public void queueAddFiveElementWithCorrectOrder() {
        MyQueue<String> queue = this.setQueueWithItems();
        assertTrue(this.evaluateQueueItems(queue));
    }

}
