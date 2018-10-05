package computer;

public abstract class Memory {
	
	protected Word[] memory;
	
	public Memory(int length, WordFactory wf){
		memory = new Word[length];
	}
	
	public Word read(int index) {
		return memory[index];
	}

	public void write(Word word, int index){
		memory[index] = (Word) word;
	}
		
}
