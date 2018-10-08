package computer;

public class ByteWordFactory implements WordFactory {

	private byte wordOut;
	
	public ByteWordFactory() {
		
	}
	
	@Override
	public Word word(String createWord) {
		wordOut = (byte)Byte.parseByte(createWord);
		
		
		return new ByteWord(wordOut);
	}
}
