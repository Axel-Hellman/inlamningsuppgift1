package computer;

public class ByteWordFactory implements WordFactory {

	private byte wordOut;
	
	public ByteWordFactory() {
		
	}
	
	@Override
	public computer.Word Word(String createWord) {
		wordOut = (byte)Byte.parseByte(createWord);
		
		
		return new ByteWord(wordOut);
	}
}
