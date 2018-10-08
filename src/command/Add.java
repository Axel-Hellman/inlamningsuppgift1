package command;

import computer.Address;
import computer.Memory;
import computer.ProgramCounter;
import computer.Value;
import computer.Word;

public class Add extends MathInstruction {

	public Add(Value value1, Value value2, Address address) {
		super(value1, value2, address);
	}

	

	@Override
	public String toString() {
		return "Add " + value1.toString() + " and " + value2.toString() + " into " + address.toString();
	}


	@Override
	public void calculate(Memory memory, Word word1, Word word2) {
		// TODO Auto-generated method stub
		memory.write(word1.add(word1,word2), address.getIndex());
		
	}



	
	
}
