package command;

import computer.Memory;
import computer.ProgramCounter;

public class Jump extends JumpInstruction {

	private int jumpTo;

	public Jump(int jumpTo) {
		this.jumpTo = jumpTo;
	}

	public void operation(Memory memory, ProgramCounter counter) {

	}

	public String toString() {
		return "Jump to " + jumpTo;
	}
}
