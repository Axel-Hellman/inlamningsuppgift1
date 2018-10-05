package command;

import computer.Memory;
import computer.ProgramCounter;

public class Jump extends JumpInstruction {

	public Jump(int jumpTo) {
		super(jumpTo);
	}

	public void operation(Memory memory, ProgramCounter counter) {

	}

	public String toString() {
		return "Jump to " + index;
	}
}
