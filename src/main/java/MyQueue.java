import java.util.LinkedList;

public class MyQueue {

	private LinkedList<String> queue;

	/**
	 * Initializes the Queue
	 */
	public MyQueue() {
		queue = new LinkedList<>();
	}

	/**
	 * adds the argument string to the back of the queue..
	 * @param str: string to add to back of queue
	 */
	public void enqueue(String str) {
		queue.offer(str);
	}

	/**
	 * returns and removes the next element in the queue.
	 * @return string at front of queue
	 */
	public String dequeue() {
		return queue.remove();
	}

	/**
	 * returns the next element in the queue.
	 * @return string at front of queue
	 */
	public String peek() {
		return queue.peek();
	}
}
