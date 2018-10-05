package command;

import computer.Memory;
import computer.ProgramCounter;

public abstract class JumpInstruction implements Command {

	protected int index;
	
	public JumpInstruction(int index) {
		this.index = index;
	}

	public void callMemCounter(Memory memory, ProgramCounter counter) {
		
	}

	public void operation(Memory memory, ProgramCounter counter) {
		
	}

	@Override
	public abstract String ToString();
	
}
