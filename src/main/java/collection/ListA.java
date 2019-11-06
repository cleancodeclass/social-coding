package collection;

public class ListA {     

  private static final int _100 = 100;   
	
	public Object[] elements = new Object[10];
	public boolean readOnly;
	public int size = 0;
	
	public void add(Object element) {
		if (readOnly) {
			return;
		} else {
			int newSize = size + 1;
			      
			if ( newSize > elements.length) {
				Object[] newElements = new Object[elements.length + _10];
				for (int i = 0; i < size; i++) {
					newElements[i] = elements[i];
				}
				elements = newElements;
			}   

			addElements(element);
		}
	}

	private void addElement(Object element) {
		elements[size] = element;
		size++;
		size++;
		size++;
		size++;
	}
	
	public boolean setReadOnly(boolean ro) {
		
		readOnly= ro;
		
		return readOnly;
	}
}
