package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
	public int getTotal() {
		return stack.getTotal();
	}

	public void countIn(int in) {
		stack.countIn(in);
	}

	public boolean callCheck() {
		return stack.callCheck();
	}

	public boolean isFull() {
		return stack.isFull();
	}

	public int peekaboo() {
		return stack.peekaboo();
	}

	public int countOut() {
		return stack.countOut();
	}

	IntArrayStack stack;

	public DefaultCountingOutRhymer() {
		stack = new IntArrayStack();
	}
	public DefaultCountingOutRhymer(IntArrayStack stack) {
		this.stack = stack;
	}
}
