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
		return  new ByteWord(((ByteWord)w1).value * ((ByteWord)w2).value);
	}

	@Override
	public boolean equals(Word w1) {
		if (this.value == ((ByteWord)w1).value){
			return true;
		}
		return false;
	}

	@Override
	public Word copy() {
		return new ByteWord(value);
	}

	@Override
	public String toString() {
		return Byte.toString(this.value);
	}
	
	

}
