package command;

import computer.Address;
import computer.Memory;
import computer.ProgramCounter;
import computer.Value;
import computer.Word;

public abstract class MathInstruction implements Command {

	protected Value value1;
	protected Value value2;
	protected Address address;

	public MathInstruction(Value value1, Value value2, Address address) {
		this.value1 = value1;
		this.value2 = value2;
		this.address = address; 
	}

	public abstract void operation(Memory memory, ProgramCounter counter);

	@Override
	public abstract String toString();

}
