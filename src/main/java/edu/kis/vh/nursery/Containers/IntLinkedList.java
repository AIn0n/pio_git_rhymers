package edu.kis.vh.nursery.Containers;

/**
 * class contains simple linked list implementation working with integers values
 */
public class IntLinkedList implements IntContainer {

	private Node last;

	/**
	 * add element into list as last one.
	 * @param i value of new element
	 */
	@Override
	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	/**
	 * @return Does list contain any element?
	 */
	@Override
	public boolean isEmpty() {
		return last == null;
	}

	/**
	 * @return return true if list is full
	 * TODO: implement functionality
	 */
	@Override
	public boolean isFull() {
		return false;
	}

	/**
	 * @return return last element value
	 */
	@Override
	public int top() {
		if (isEmpty())
			return IF_EMPTY;
		return last.getValue();
	}

	/**
	 * @return return value and remove last element
	 */
	@Override
	public int pop() {
		if (isEmpty())
			return IF_EMPTY;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

}
