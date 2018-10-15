package computer;

public class ByteWordFactory implements WordFactory {

    public Word word(String createWord) {
        byte wordOut = (byte) Byte.parseByte(createWord);
        return new ByteWord(wordOut);
    }
}