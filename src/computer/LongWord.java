package computer;

												// DETTA KÄNNS FEL, RÄTTA PLS

public class LongWord extends Word{
	
	private long value;
	
	public LongWord(long length) {  
	}

	@Override
	public Word add(Word w1, Word w2) {
		// TODO Auto-generated method stub
		return new LongWord(((LongWord)w1).value + ((LongWord)w2).value);
	}

	@Override
	public Word mul(Word w1, Word w2) {
		// TODO Auto-generated method stub
		return new LongWord(((LongWord)w1).value * ((LongWord)w2).value);
	}

	@Override
	public boolean equals(Word w1) {
		// TODO Auto-generated method stub
		return false;
	}

}
