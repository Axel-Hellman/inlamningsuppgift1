package computer;

public class ByteWord extends Word {

	private byte value;
	
	public ByteWord(byte value) {
		this.value = value;
	}

	public Word add(Word w1, Word w2) {
		this.value = (byte)(((ByteWord)w1).value + ((ByteWord)w2).value);
		return this;
	}

	public Word mul(Word w1, Word w2) {
		this.value = (byte)(((ByteWord)w1).value * ((ByteWord)w2).value);
		return this;
	}

	public boolean equals(Word w1) {
		return this.value == ((ByteWord)w1).value;
	}

	public Word copy() {
		return this;
	}

	public String toString() {
		return Byte.toString(this.value);
	}
}
