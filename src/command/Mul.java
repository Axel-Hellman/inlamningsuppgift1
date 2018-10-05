package command;

import computer.Address;
import computer.Memory;
import computer.ProgramCounter;
import computer.Value;

public class Mul extends MathInstruction {

	public Mul(Value word1, Value word2, Address address) {
		super(word1, word2, address);
	}

	public void operation(Memory memory, ProgramCounter counter) {

	}

	public String ToString() {
		return "Multiply" + word1.toString() + "and" + word2.toString() + "into" + address.toString();
	}
}
