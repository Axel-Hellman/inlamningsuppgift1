package command;

import computer.Address;
import computer.Memory;
import computer.ProgramCounter;
import computer.Value;

public class Add extends MathInstruction {

	public Add(Value word1, Value word2, Address address) {
		super(word1, word2, address);
	}

	public void operation(Memory memory, ProgramCounter counter) {

	}

	public String toString() {
		return null;
	}

}
