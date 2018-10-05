package computer;

												// DETTA KÄNNS FEL, RÄTTA PLS

public class LongWord extends Word{
	
	private long value;
	
	public LongWord(long length) {  
	}

	@Override
	public Word add(Word w1, Word w2) {
		return new LongWord(((LongWord)w1).value + ((LongWord)w2).value);
	}

	@Override
	public Word mul(Word w1, Word w2) {
		return new LongWord(((LongWord)w1).value * ((LongWord)w2).value);
	}

	@Override
	public boolean equals(Word w1) {
		if (this.value == ((LongWord)w1).value){
			return true;
		}
		return false;
	}

	@Override
	public Word copy() {
		// TODO Auto-generated method stub
		return new LongWord(value);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Long.toString(this.value);
	}

}
