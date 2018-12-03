package Package;

public class StackOfIntegers {
	private int[] elements;
	private int size;
	
	public StackOfIntegers() {
		elements = new int[10];
	}
	public StackOfIntegers(int size) {
		elements = new int[size];
	}
	public boolean empty() {
		return size == 0;
	}
	public int peek() {
		if (!empty())
			return elements[size - 1];
		return -1;
		
	}

}
