package command;

import computer.Memory;
import computer.ProgramCounter;

public abstract class JumpInstruction implements Command {

	public void callMemCounter(Memory memory, ProgramCounter counter) {

	}

	public void operation(Memory memory, ProgramCounter counter) {

	}

	public String ToString() {
		return null;
	}
}
