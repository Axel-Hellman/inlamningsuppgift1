package computer;

												// DETTA KÄNNS FEL, RÄTTA PLS

public class ByteWord extends Word {

	private byte value;
	
	public ByteWord(int length) {
	}

	@Override
	public Word add(Word w1, Word w2) {
		// TODO Auto-generated method stub
		return new ByteWord(((ByteWord)w1).value + ((ByteWord)w2).value);
	}

	@Override
	public Word mul(Word w1, Word w2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean equals(Word w1) {
		// TODO Auto-generated method stub
		return false;
	}

}
