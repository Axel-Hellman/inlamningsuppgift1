package computer;

import command.*;

public class Factorial extends Program {
	
	public Factorial  (String value, WordFactory wf) {
        Address n = new Address(0),
                fac = new Address(1);
        /**
        Add(new Copy(wf.word(value), n));
        Add(new Copy(wf.word("1"), fac));
        Add(new JumpEq(6, n, wf.word("1")));
        Add(new Mul(fac, n, fac));
        Add(new Add(n, wf.word("-1"), n));
        Add(new Jump(2));
        Add(new Print(fac));
        Add(new Halt());
        */
    }

}
