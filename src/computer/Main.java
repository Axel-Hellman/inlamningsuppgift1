package computer;

public class Main {
	
	public static void main(String[] args) {
        LongWordFactory lwf = new LongWordFactory();
        ByteWordFactory bwf = new ByteWordFactory();
        run("factorial(5) med LongWord", new Factorial("5", lwf), lwf);
        run("factorial(5) med ByteWord", new Factorial("5", bwf), bwf);
        run("factorial(16) med LongWord", new Factorial("16", lwf), lwf);
        run("factorial(16) med ByteWord", new Factorial("16", bwf), bwf);
        run("sum(5) med LongWord", new Sum("5", lwf), lwf);
        run("sum(5) med ByteWord", new Sum("5", bwf), bwf);
        run("sum(16) med LongWord", new Sum("16", lwf), lwf);
        run("sum(16) med ByteWord", new Sum("16", bwf), bwf);
    }

    static void run(String message, Program program, WordFactory wf) {
        System.out.println("================================");
        System.out.println(message);
        System.out.println(program);
        /**
        var computer = new Computer(new Memory(1024, wf));
        computer.load(program);
        computer.run();
        */
    }

}
