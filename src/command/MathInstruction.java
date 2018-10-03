package command;

import computer.Address;
import computer.Memory;
import computer.ProgramCounter;
import computer.Value;

public abstract class MathInstruction implements Command {

	private Value word1;
	private Value word2;
	private Address address;

	public void operation(Memory memory, ProgramCounter counter) {

	}

	public String ToString() {
		return null;
	}

}
