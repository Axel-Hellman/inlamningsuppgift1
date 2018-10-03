package command;

import computer.Memory;
import computer.ProgramCounter;
import computer.Value;

public class JumpEq extends JumpInstruction {

	private int jumpTo;
	private Value equals1;
	private Value equals2;

	public JumpEq(int jumpTo, Value equals1, Value equals2) {
		this.jumpTo = jumpTo;
		this.equals1 = equals1;
		this.equals2 = equals2;
	}
	
	public void operation(Memory memory, ProgramCounter counter) {

	}

	public String ToString() {
		return null;
	}
}
