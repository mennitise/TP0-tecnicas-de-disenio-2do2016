package ar.fiuba.tdd.template;

class MyQueue<T> {

    private MyLinkedList<T> list;

    MyQueue() {
        this.list = new MyLinkedList<>();
    }

    boolean isEmpty() {
        return this.list.isEmpty();
    }

    int size() {
        return this.list.size();
    }

    void add(T item) {
        this.list.addFirst(item);
    } // agregar un item

    T top() throws AssertionError {
        return this.list.getFirst();
    } // retornar el primer item, lanzar exception si esta vacío.

    void remove() throws AssertionError {
        this.list.removeFirst();
    } // remover el primer item lanzar exception si esta vacío.

}
