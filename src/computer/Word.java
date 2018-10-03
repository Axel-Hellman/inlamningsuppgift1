package computer;

public abstract class Word implements Value {

	// OBS! Konstinga signaturer i Equals och Copy?

	public abstract Word getValue(Memory memory);

	public abstract Word Add(Word w1, Word w2);

	public abstract Word Mul(Word w1, Word w2);

	public abstract Word Copy(Address fromAddress, Address toAddress);

	public abstract boolean Equals(Word w1, Word w2);

	public abstract String toString();

}
