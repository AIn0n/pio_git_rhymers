package edu.kis.vh.nursery.Containers;

public class IntArrayStack implements IntContainer {
    public static final int CAPACITY = 12;
    public static final int EMPTY = -1;

    private final int[] numbers = new int[CAPACITY];

    private int total = EMPTY;

    public int getTotal() { return total; }

    @Override
    public void push(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    @Override
    public boolean isEmpty() {
        return total == EMPTY;
    }

    @Override
    public boolean isFull() {
        return total == CAPACITY - 1;
    }

    @Override
    public int top() {
        if (isEmpty())
            return IF_EMPTY;
        return numbers[total];
    }

    @Override
    public int pop() {
        if (isEmpty())
            return IF_EMPTY;
        return numbers[total--];
    }
}
