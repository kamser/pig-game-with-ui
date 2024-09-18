package common;

import javax.swing.JOptionPane;

public class Dice {
	
	private int MIN_RANGE = 0;
	private int maxRange = 0;
	
	public Dice(int maxRange) {
		this.maxRange = maxRange;
	}
	
	public int throwDice() {
		return this.MIN_RANGE + (int)(Math.random() * ((this.maxRange - this.MIN_RANGE) + 1));
	}
	
	public Pair getDiceResultForTwoDice() {
		int firstResult = throwDice();
		int secondResult = throwDice();
		return new Pair(firstResult, secondResult);
	}
}
