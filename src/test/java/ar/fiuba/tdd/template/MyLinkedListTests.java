package ar.fiuba.tdd.template;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MyLinkedListTests {

    @Test
    public void linkedListNewIsEmpty() {
        assertTrue((new MyLinkedList<String>().isEmpty()));
    }

    @Test
    public void linkedListNewHaveZeroElements() {
        assertEquals((new MyLinkedList<String>().size()),0);
    }

    private MyLinkedList<String> setListOneItem() {
        MyLinkedList<String> list = new MyLinkedList<>();
        String words = "hello world";
        list.addFirst(words);
        return list;
    }

    @Test
    public void linkedListAddElementOneElement() {
        MyLinkedList<String> list = this.setListOneItem();
        assertEquals(list.size(),1);
    }

    @Test
    public void linkedListAddElementSameElement() {
        MyLinkedList<String> list = this.setListOneItem();
        assertEquals(list.getFirst(),"hello world");
    }

    @Test
    public void linkedListEmptyThrowsErrorAtGetFirst() {
        MyLinkedList<String> list = new MyLinkedList<>();
        try {
            list.getFirst();
            assert false;
        } catch (AssertionError e) {
            assert true;
        }
    }

    @Test
    public void linkedListEmptyThrowsErrorAtRemoveFirst() {
        MyLinkedList<String> list = new MyLinkedList<>();
        try {
            list.removeFirst();
            assert false;
        } catch (AssertionError e) {
            assert true;
        }
    }
}
