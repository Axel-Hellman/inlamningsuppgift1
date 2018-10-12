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

	public void operation(Memory memory, ProgramCounter counter) {
		Word word1 = value1.getValue(memory);
		Word word2 = value2.getValue(memory);
		calculate(memory, word1, word2);
		counter.increase();
	}

	protected abstract void calculate(Memory memory, Word word1, Word word2);

	@Override
	public abstract String toString();
}