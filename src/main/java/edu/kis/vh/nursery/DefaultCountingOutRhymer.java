package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
	public int getTotal() {
		return stack.getTotal();
	}

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

	IntArrayStack stack;

	public DefaultCountingOutRhymer() {
		stack = new IntArrayStack();
	}
	public DefaultCountingOutRhymer(IntArrayStack stack) {
		this.stack = stack;
	}
}
