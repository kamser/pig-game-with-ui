package player;

import common.Dice;

public class AutomaticPlayer extends Player{

	public AutomaticPlayer(String name, int id, int initialScore) {
		super(name, id, initialScore);
		// TODO Auto-generated constructor stub
	}
	
	public boolean doBasicDecision() {
		Dice d = new Dice(2);
		return d.throwDice() == 1
				? true
				: false;
	}

}
