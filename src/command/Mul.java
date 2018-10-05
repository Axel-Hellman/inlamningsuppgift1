package command;

import computer.Address;
import computer.Memory;
import computer.ProgramCounter;
import computer.Value;

public class Mul extends MathInstruction {

	public Mul(Value value1, Value value2, Address address) {
		super(value1, value2, address);
	}

	public void operation(Memory memory, ProgramCounter counter) {
		memory.write(value1.getValue(memory).mul(value1.getValue(memory),(value2.getValue(memory))), address.getIndex());
		counter.increase();
	} 

	public String toString() {
		return "Multiply " + value1.toString() + " and " + value2.toString() + " into " + address.toString();
		
	}
}
