package command;

import computer.Memory;
import computer.ProgramCounter;

public class Jump extends JumpInstruction {

    public Jump(int index) {
        super(index);
    }

    public void operation(Memory memory, ProgramCounter counter) {
        counter.setIndex(index);
    }

    public String toString() {
        return "Jump to " + index;
    }
}