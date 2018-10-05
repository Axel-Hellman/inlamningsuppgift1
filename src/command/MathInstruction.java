package command;

import computer.Address;
import computer.Memory;
import computer.ProgramCounter;
import computer.Value;

public abstract class MathInstruction implements Command {

	protected Value word1;
	protected Value word2;
	protected Address address;
	
	public MathInstruction(Value word1, Value word2, Address address) {
		this.word1 = word1;
		this.word2 = word2;
		this.address = address;
	}

	public abstract void operation(Memory memory, ProgramCounter counter);

	@Override
	public abstract String toString();

}
