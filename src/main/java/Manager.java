public class Manager {


	/** empty constructor */
	public Manager() { }

	/**
	 * Creates a new stack and returns it
	 * @return MyStack object
	 */
	public MyStack getStack() {
		return new MyStack();
	}

	/**
	 * Creates a new Queue and returns it
	 * @return MyQueue object
	 */
	public MyQueue getQueue() {
		return new MyQueue();
	}
}
