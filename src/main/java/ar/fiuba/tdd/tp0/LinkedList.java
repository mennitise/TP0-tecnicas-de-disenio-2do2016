package ar.fiuba.tdd.tp0;

public class LinkedList<T>
{
    private int sizeList;
    private Node<T> first;

    private static class Node<R> {
        private Node<R> next;
        private R item;

        Node(R data, Node<R> nextNode) {
            this.item = data;
            this.next = nextNode;
        }
    }

    public LinkedList()
    {
        this.first = null;
        this.sizeList = 0;
    }

    public boolean isEmpty()
    {
        return this.sizeList==0;
    }

    public int size()
    {
        return this.sizeList;
    }

    public void addFirst(T item)
    {
        this.first = new Node<>(item, this.first);
        this.sizeList++;
    }

    public T getFirst()
    {
        return this.first.item;
    }

    public void removeFirst()
    {
        this.first = this.first.next;
        this.sizeList--;
    }
}
