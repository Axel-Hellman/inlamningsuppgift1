package command;

import computer.Address;
import computer.Memory;
import computer.ProgramCounter;

public class Copy implements Command {

	private Address addressFrom;
	private Address address;

	public Copy(Address addressFrom, Address address) {
		this.addressFrom = addressFrom;
		this.address = address;
	}

	public void operation(Memory memory, ProgramCounter counter) {

	}

	public String ToString() {
		return null;
	}

}
