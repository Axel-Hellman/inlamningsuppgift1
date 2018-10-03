package command;

import computer.Address;
import computer.Memory;
import computer.ProgramCounter;

public class Print implements Command {

	private Address address;

	public Print(Address address) {
		this.address = address;
	}

	public void operation(Memory memory, ProgramCounter counter) {

	}

	public String ToString() {
		return null;
	}

}
