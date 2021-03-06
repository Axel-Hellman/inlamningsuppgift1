package command;

import computer.Address;
import computer.Memory;
import computer.Value;
import computer.Word;

public class Add extends MathInstruction {

    public Add(Value value1, Value value2, Address address) {
        super(value1, value2, address);
    }

    protected void calculate(Word word1, Word word2, Word word3) {
        word3.add(word1,word2);
    }

    public String toString() {
        return "Add " + value1.toString() + " and " + value2.toString() + " into " + address.toString();
    }
}