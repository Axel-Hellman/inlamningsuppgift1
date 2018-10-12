package computer;

public class ByteWord extends Word {

	private byte value;
	
	public ByteWord(byte value) {
		this.value = value;
	}

	public Word add(Word w1, Word w2) {
		return new ByteWord((byte)(((ByteWord)w1).value + ((ByteWord)w2).value));
	}

	public Word mul(Word w1, Word w2) {
		return  new ByteWord((byte)(((ByteWord)w1).value * ((ByteWord)w2).value));
	}

	public boolean equals(Word w1) {
		return this.value == ((ByteWord)w1).value;
	}

	public Word copy() {
		return new ByteWord(value);
	}

	public String toString() {
		return Byte.toString(this.value);
	}
}