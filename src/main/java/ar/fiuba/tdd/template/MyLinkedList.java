package ar.fiuba.tdd.template;

class MyLinkedList<T> {
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

    MyLinkedList() {
        this.first = null;
        this.sizeList = 0;
    }

    boolean isEmpty() {
        return this.sizeList == 0;
    }

    int size() {
        return this.sizeList;
    }

    void addFirst(T item) {
        this.first = new Node<>(item, this.first);
        this.sizeList++;
    }

    T getFirst() {
        return this.first.item;
    }

    void removeFirst() {
        this.first = this.first.next;
        this.sizeList--;
    }
}
