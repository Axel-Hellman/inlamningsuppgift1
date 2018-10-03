package computer;

public abstract class Word implements Value {

	// OBS! Konstinga signaturer i Equals och Copy?


	public abstract Word Add(Word w1, Word w2);

	public abstract Word Mul(Word w1, Word w2);

	public abstract boolean Equals(Word w1, Word w2);
	
	public Word Copy(Address fromAddress, Address toAddress) {
		return null;
	}
	
	public Word getWord(Memory memory) {
		return null;
	}

	public String toString() {
		return null;
	}

}
