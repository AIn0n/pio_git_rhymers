package edu.kis.vh.nursery.Containers;

public interface IntContainer {
    int IF_EMPTY = 0;

    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();
}
