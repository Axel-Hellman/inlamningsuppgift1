package command;

import computer.Memory;
import computer.ProgramCounter;
import computer.Value;

public class JumpEq extends JumpInstruction {

    private Value value1;
    private Value value2;

    public JumpEq(int index, Value value1, Value value2) {
        super(index);
        this.value1 = value1;
        this.value2 = value2;
    }

    public void operation(Memory memory, ProgramCounter counter) {
        if (value1.getValue(memory).equals(value2.getValue(memory))){
            counter.setIndex(index);
        } else {
            counter.increase();
        }
    }

    public String toString() {
        return "Jump to " + index + " if " + value1.toString() + " == " + value2.toString();
    }
}