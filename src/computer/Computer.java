package computer;

import command.Command;

public class Computer {

    private Memory memory;
    private Program program;

    public Computer (Memory memory) {
        this.memory = memory;
    }

    public void load(Program program) {
        this.program = program;
    }

    public void run() {
        ProgramCounter counter = new ProgramCounter();
        while (counter.isPositive()){
            program.getCommand(counter.getIndex()).operation(memory, counter);
            }
    }
}