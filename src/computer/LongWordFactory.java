package computer;

public class LongWordFactory implements WordFactory {

	private long wordOut;
	
	public LongWordFactory() {	
	}
	
	@Override
	public computer.Word Word(String createWord) {
		wordOut = (long)Long.parseLong(createWord);
		

		return new LongWord(wordOut);
	}

}
