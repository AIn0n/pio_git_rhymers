package edu.kis.vh.nursery.list;

/**
 * class contains simple linked list implementation working with integers values
 */
public class IntLinkedList {

    /**
     * Default return value if list is empty
     */
    public static final int IF_EMPTY = -1;
    Node last;

    /**
     * add element into list as last one.
     * @param i value of new element
     */
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
    }

    /**
     * @return Does list contain any element?
     */
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * @return return true if list is full
     * TODO: implement functionality
     */
    public boolean isFull() {
        return false;
    }

    /**
     * @return return last element value
     */
    public int top() {
        if (isEmpty())
            return IF_EMPTY;
        return last.value;
    }

    /**
     * @return return value and remove last element
     */
    public int pop() {
        if (isEmpty())
            return IF_EMPTY;
        int ret = last.value;
        last = last.prev;
        return ret;
    }

}
