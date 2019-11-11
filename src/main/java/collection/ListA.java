package collection;

public class ListA {

	private static final int STORE_SIZE_INCREMENT = 10;              
	public Object[] elements = new Object[10];
	public boolean readOnly;
	public int size = 0;
 
	public void add(Object element) {               
		if (readOnly) {
			//
		} else {
			int newSize = size + 1;

			if (isElmentStoreFull(newSize)) {
				increaseElementStore();
			}

			addElmentAtEnd(element);
		}
	}

	private void addElmentAtEnd(Object element) {
		elements[size] = element;
		size++;
	}

	private void increaseElementStore() {
		Object[] newElements = new Object[elements.length + STORE_SIZE_INCREMENT];
		for (int i = 0; i < size; i++) {
			newElements[i] = elements[i];
		}

		elements = newElements;
	}

	private boolean isElmentStoreFull(int newSize) {
		return newSize > elements.length;
	}

	public void setReadOnly(boolean b) {

	}
}
