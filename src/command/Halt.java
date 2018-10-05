package command;

import computer.Memory;
import computer.ProgramCounter;

public class Halt extends JumpInstruction {
	
	public Halt() {
	}

	public void operation(Memory memory, ProgramCounter counter) {

	}

	public String toString() {
		return "Halt";
	}
}
