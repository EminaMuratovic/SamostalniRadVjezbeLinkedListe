import java.util.Collection;

public class ArrayList<T> {
	private T[] array;
	private int size;
	private final int DEFAULT_SIZE = 10;

	@SuppressWarnings("unchecked")
	public ArrayList() {
		size = 0;
		array = (T[]) (new Object[DEFAULT_SIZE]);
	}

	public void add(T value) {
		if (size == array.length)
			resize();
		array[size] = value;
		size++;
	}

	public void add(T value, int index) {
		if (index < 0 || index > size)
			throw new IndexOutOfBoundsException("...");
		if (size == array.length)
			resize();
		for (int i = size; i > index; i--)
			array[i] = array[i - 1];
		array[index] = value;
		size++;
	}

	public void remove(int index) {
		if (index < 0 || index >= size)
			throw new IndexOutOfBoundsException("...");
		for (int i = index; i < size - 1; i++) {
			array[i] = array[i + 1];
		}
		size--;
	}

	private void resize() {
		T[] temp = (T[]) (new Object[size * 2]);
		for (int i = 0; i < size; i++) {
			temp[i] = array[i];
		}
		array = temp;
	}

	public int getSize() {
		return size;
	}

	public String toString() {
		String str = "";
		str += "[ ";
		for (int i = 0; i < size; i++) {
			str += array[i];
			if (i != size - 1)
				str += ", ";
		}
		str += " ]";
		return str;

	}
}
