package command;

import computer.Memory;
import computer.ProgramCounter;
import computer.Value;

public class JumpEq extends JumpInstruction {


	private Value equals1;
	private Value equals2;

	public JumpEq(int jumpTo, Value equals1, Value equals2) {
		super(jumpTo);
		this.equals1 = equals1;
		this.equals2 = equals2;
	}
	
	public void operation(Memory memory, ProgramCounter counter) {

	}

	public String toString() {
		return "Jump to " + index + " if " + equals1.toString() + " == " + equals2.toString();
	}
}
