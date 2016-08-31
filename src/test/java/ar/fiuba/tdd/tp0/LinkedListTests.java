package ar.fiuba.tdd.tp0;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

public class LinkedListTests {

    @Test
    public void linkedListNewIsEmpty()
    {
        assertTrue((new LinkedList<String>().isEmpty()));
    }

    @Test
    public void linkedListNewHaveZeroElements()
    {
        assertEquals((new LinkedList<String>().size()),0);
    }

    private LinkedList<String> setListOneItem()
    {
        LinkedList<String> list = new LinkedList<>();
        String s = "hola mundo";
        list.addFirst(s);
        return list;
    }

    @Test
    public void linkedListAddElementOneElement()
    {
        LinkedList<String> list = this.setListOneItem();
        assertEquals(list.size(),1);
    }

    @Test
    public void linkedListAddElementSameElement()
    {
        LinkedList<String> list = this.setListOneItem();
        assertEquals(list.getFirst(),"hola mundo");
    }
}
