package command;

import computer.Memory;
import computer.ProgramCounter;

public interface Command {

	public void operation(Memory memory, ProgramCounter counter);

	public String toString();

}