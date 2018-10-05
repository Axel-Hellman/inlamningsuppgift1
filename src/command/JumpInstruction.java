package command;

import computer.Memory;
import computer.ProgramCounter;

public abstract class JumpInstruction implements Command {

	public JumpInstruction() {
	}

	public void callMemCounter(Memory memory, ProgramCounter counter) {
		
	}

	public void operation(Memory memory, ProgramCounter counter) {
		
	}

	@Override
	public abstract String toString();
	
}
