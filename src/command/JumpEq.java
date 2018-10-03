package command;

import computer.Memory;
import computer.ProgramCounter;
import computer.Value;

public class JumpEq extends JumpInstruction {

	private int jumpTo;
	private Value equals1;
	private Value equals2;

	public void operation(Memory memory, ProgramCounter counter) {

	}

	public String ToString() {
		return null;
	}
}
