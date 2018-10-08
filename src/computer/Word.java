package computer;

public abstract class Word implements Value {
	
	public Word getValue(Memory memory) {
		return this;
	}

	public abstract String toString();
	
	public abstract Word add(Word w1, Word w2);

	public abstract Word mul(Word w1, Word w2);
 
	public abstract boolean equals(Word w1);
	
	public abstract Word copy();
}
