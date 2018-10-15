package computer;

public class Memory {

    protected Word[] memory;

    public Memory(int length, WordFactory wf){
        memory = new Word[length];
        for(int i=0; i<length; i++){
            memory[i] = wf.word("0");
        }
    }

    public Word read(int index) {
        return memory[index];
    }

    public void write(Word word, int index){
        memory[index] = (Word) word;
    }
}