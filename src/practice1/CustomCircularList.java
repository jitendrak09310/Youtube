package practice1;

import java.util.Arrays;

public class CustomCircularList<T> {

	private final Object[] data; // internal variable to store values.
	private final int capacity; // max limit allowed.
	private int size; // Current number of elements in the list not greator than capacity.
	private int head; // index of oldest element
	private int tail; // points to next insertion position.

	public CustomCircularList(int capacity) {
		this.capacity = capacity;// sets maximum size..
		this.data = new Object[capacity]; // create fix size array
	}

	public void add(T element) {
		data[tail] = element;
		if (size == capacity) {
			head = (head + 1) % capacity; // overwrite → move head forward
		} else {
			size++;
		}

		tail = (tail + 1) % capacity;
	}

	public T get(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}

		int realIndex = (head + index) % capacity;
		return (T) data[realIndex];
	}

	public int size() {
		return size;
	}

	public boolean isFull() {
		return size == capacity;
	}

	@Override
	public String toString() {

		Object[] result = new Object[size];
		for (int i = 0; i < size; i++) {
			result[i] = data[(head + i) % capacity];
		}

		return Arrays.toString(result);

	}
}
