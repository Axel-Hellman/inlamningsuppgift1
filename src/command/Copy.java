package command;

import computer.Address;
import computer.Memory;
import computer.ProgramCounter;
import computer.Word;

public class Copy implements Command {

    private Word word;
    private Address address;

    public Copy(Word word, Address address) {
        this.word = word;
        this.address = address;
    }

    public void operation(Memory memory, ProgramCounter counter) {
        memory.write(word.getValue(memory).copy(), address.getIndex());
        counter.increase();
    }

    public String toString() {
        return "Copy " + word.toString() + " to " + address.toString();
    }
}