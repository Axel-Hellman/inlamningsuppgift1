package computer;

public class ProgramCounter {

    private int index;

    public ProgramCounter() {
        index = 0;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void increase() {
        index++;
    }

    public boolean isPositive() {
        return index >= 0;
    }
}