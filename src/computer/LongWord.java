package computer;

public class LongWord extends Word {

	private long value;

	public LongWord(long value) {
		this.value = value;
	}

	public Word add(Word w1, Word w2) {
		this.value = ((LongWord)w1).value + ((LongWord)w2).value;
		return this;
	}

	public Word mul(Word w1, Word w2) {
		this.value = ((LongWord)w1).value * ((LongWord)w2).value;
		return this;
	}

	public boolean equals(Word w1) {
		return this.value == ((LongWord) w1).value;
	}

	public Word copy() {
		return this;
	}

	public String toString() {
		return Long.toString(this.value);
	}
}
