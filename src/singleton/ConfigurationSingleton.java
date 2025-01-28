package singleton;

import java.util.ArrayList;
import java.util.List;

import common.GlobalGameVars;

public final class ConfigurationSingleton {

	private boolean isQuickMatch;
	private int playerAmount;
	private int diceAmount;
	private int goalScore;
	private List<String> playerNames;
	private static ConfigurationSingleton singletonInstance;
	
	private ConfigurationSingleton() {
		isQuickMatch = false;
		playerAmount = GlobalGameVars.DEFAULT_INITIAL_VALUE_FR_INT;
		diceAmount = GlobalGameVars.DEFAULT_INITIAL_VALUE_FR_INT;
		goalScore = GlobalGameVars.DEFAULT_INITIAL_VALUE_FR_INT;
		playerNames = new ArrayList<String>();
	}
	
	public static ConfigurationSingleton getInstance() {
        if(singletonInstance == null) {
        	singletonInstance = new ConfigurationSingleton();
        }
        
        return singletonInstance;
    }
	
	public boolean isQuickMatch() {
		return isQuickMatch;
	}
	public int getPlayerAmount() {
		return playerAmount;
	}
	public int getDiceAmount() {
		return diceAmount;
	}
	public int getGoalScore() {
		return goalScore;
	}
	public List<String> getPlayerNames() {
		return playerNames;
	}
	public void setQuickMatch(boolean isQuickMatch) {
		this.isQuickMatch = isQuickMatch;
	}
	public void setPlayerAmount(int playerAmount) {
		this.playerAmount = playerAmount;
	}
	public void setDiceAmount(int diceAmount) {
		this.diceAmount = diceAmount;
	}
	public void setGoalScore(int goalScore) {
		this.goalScore = goalScore;
	}
	public void setPlayerNames(List<String> playerNames) {
		this.playerNames = playerNames;
	}
	
}
