package computer;

import command.*;

public class Sum extends Program {
	
	public Sum  (String value, WordFactory wf) {
        Address n = new Address(0),
                sum = new Address(1);
        
        /**
        Add(new Copy(wf.word(value), n));
        Add(new Copy(wf.word("1"), sum));
        Add(new JumpEq(6, n, wf.word("1")));
        Add(new Add(sum, n, sum));
        Add(new Add(n, wf.word("-1"), n));
        Add(new Jump(2));
        Add(new Print(sum));
        Add(new Halt());
        */
    }
}
