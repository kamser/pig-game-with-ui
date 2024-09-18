package common;

public class Pair {
	private int firstElement;
	private int secondElement;
	
	public Pair() {
		this.firstElement = -1;
		this.secondElement = -1;
	}
	
	public Pair(int firstElement, int secondElement) {
		this.firstElement = firstElement;
		this.secondElement = secondElement;
	}
	
	public void updateValuePair(int newFirstValue, int newSecondValue) {
		this.firstElement = newFirstValue;
		this.secondElement = newSecondValue;
	}
	
	public int getFirstElement() {
		return this.firstElement;
	}
	
	public int getSecondElement() {
		return this.secondElement;
	}

}
