package edu.kis.vh.nursery;

import edu.kis.vh.nursery.Containers.IntArrayStack;
import edu.kis.vh.nursery.Containers.IntContainer;

public class DefaultCountingOutRhymer {

	public void countIn(int in) {
		stack.push(in);
	}

	public boolean callCheck() {
		return stack.isEmpty();
	}

	public boolean isFull() {
		return stack.isFull();
	}

	public int peekaboo() {
		return stack.top();
	}

	public int countOut() {
		return stack.pop();
	}

	IntContainer stack;

	public DefaultCountingOutRhymer() {
		stack = new IntArrayStack();
	}
	public DefaultCountingOutRhymer(IntContainer stack) {
		this.stack = stack;
	}
}
