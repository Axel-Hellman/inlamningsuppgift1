package computer;

public class Address implements Value {

	private int index;

	public Address(int index) {
		this.index = index;
	}

	public Word getValue(Memory memory) {
		return memory.read(index);
	}

	public int getIndex() {
		return index;
	}

	public String toString() {
		return null;
	}

}
