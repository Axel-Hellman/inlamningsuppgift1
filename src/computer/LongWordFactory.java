package computer;

public class LongWordFactory implements WordFactory {

	public Word word(String createWord) {
		long wordOut = (long) Long.parseLong(createWord);
		return new LongWord(wordOut);
	}
}