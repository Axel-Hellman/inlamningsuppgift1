package computer;

public class LongWord extends Word {

	private long value;

	public LongWord(long value) {
		this.value = value;
	}

	public Word add(Word w1, Word w2) {
		return new LongWord(((LongWord) w1).value + ((LongWord) w2).value);
	}

	public Word mul(Word w1, Word w2) {
		return new LongWord(((LongWord) w1).value * ((LongWord) w2).value);
	}

	public boolean equals(Word w1) {
		return this.value == ((LongWord) w1).value;
	}

	public Word copy() {
		return new LongWord(value);
	}

	public String toString() {
		return Long.toString(this.value);
	}
}