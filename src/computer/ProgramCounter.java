package computer;

public class ProgramCounter {

	private int index;

	public ProgramCounter() {
		index = 0;
	}

	public int getIndex() {
		return 0;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public void increase() {
		index++;
	}

	public boolean isPositive() {
		if (index >= 0) {
			return true;
		}

		return false;

	}

}
