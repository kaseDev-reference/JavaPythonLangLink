import java.util.LinkedList;

public class MyStack {

	private LinkedList<String> stack;

	/**
	 * Initializes the Stack
	 */
	public MyStack() {
		stack = new LinkedList<>();
	}

	/**
	 * adds the argument string to the top of the stack.
	 * @param str: string to push onto top of stack
	 */
	public void push(String str) {
		stack.push(str);
	}

	/**
	 * returns and removes the first string on the stack.
	 * @return string on top of stack
	 */
	public String pop() {
		return stack.pop();
	}

	/**
	 * returns the first string on the stack.
	 * @return string on top of stack
	 */
	public String peek() {
		return stack.peek();
	}

	/**
	 * returns true if empty and false otherwise
	 * @return true if empty and false otherwise
	 */
	public boolean isEmpty() {
		return stack.isEmpty();
	}
}
