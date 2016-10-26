public class Calculator {
	private int result;

	public void add(int first, int second) {
		result = first + second;
	}

	public void sub(int first, int second) {
		result = first - second;
	}

	public void mult(int first, int second) {
		result = first * second;
	}

	public void div(int first, int second) {
		result = first / second;
	}

	public int getResult() {
		return this.result;
	}

	public void clearResult() {
		this.result = 0;
	}
}