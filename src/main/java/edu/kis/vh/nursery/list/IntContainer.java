package edu.kis.vh.nursery.list;

public interface IntContainer {
    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();
}
