package computer;

public abstract class Word implements Value {

	// OBS! Konstinga signaturer i Equals och Copy?


	public abstract Word add(Word w1, Word w2);

	public abstract Word mul(Word w1, Word w2);
 
	public abstract boolean equals(Word w1);
	
	public abstract Word copy();
	
	public Word getValue(Memory memory) {
		return this;
	}

	public abstract String toString();
}
