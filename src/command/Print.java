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
		System.out.println(address.getValue(memory).toString());
		counter.increase();
	}

	public String toString() {
		return "Print " + address.toString();
	}
}