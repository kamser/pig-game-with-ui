package common;

import java.awt.EventQueue;
import java.util.ArrayList;

import player.AutomaticPlayer;
import player.Player;

public class PigGame {
	
	private Player currentPlayer;
	private int currentPlayerIdx;
	private int maxScoreEarned;
	private ArrayList<Player> playerList;
	private boolean throwDiceAgain;
	private boolean keepPlaying;
	private int playerAmount;
	private String[] auxPlayerNames = {"keylor", "Putito", "lokensio", "Pirulencio"};
	private ArrayList<Player> auxPlayerList = new ArrayList<Player>();
	private int INITIAL_SCORE = 0;
	private int MAX_DICE_RANGE = 6;
	private int GOAL_SCORE = 0;
	private int NONE_POINTS_EARNED = 0;
	
	private boolean exitGame = false;
	private int tempAccumulatedPlayerScore = 0;
	
	public PigGame() {
		this.currentPlayerIdx = 0;
		this.maxScoreEarned = 0;
		this.playerList = new ArrayList<Player>();
		this.throwDiceAgain = false;
		this.keepPlaying = true;
		this.playerAmount = 4;
		this.GOAL_SCORE = 10;
	}
	
	public void createPlayers() {
		int initialBaseId = 0;
		for(String playerName: auxPlayerNames) {
			AutomaticPlayer newPlayer = new AutomaticPlayer(playerName, initialBaseId, INITIAL_SCORE);
			this.playerList.add(newPlayer);
		}
	}
	
	public void updateMaxScoredEraned(int newMaxScoredEarned) {
		this.maxScoreEarned = newMaxScoredEarned;
	}
	
	public void starGame() {
		setGameConfiguration();
		
		startGeneralGameLoop();
		
		exit();
		
	}
	
	private void exit() {
		// TODO Auto-generated method stub
		
	}

	public void startGeneralGameLoop() {
		Dice gameDice = new Dice(this.MAX_DICE_RANGE);
		currentPlayer = playerList.get(currentPlayerIdx);
		while(!exitGame) {
			
			do {
				if(doDiceRoll(((AutomaticPlayer) currentPlayer).doBasicDecision())) {
					Pair currentDiceResults = gameDice.getDiceResultForTwoDice();
					System.out.println("the results were: " + currentDiceResults.getFirstElement() + currentDiceResults.getSecondElement());
					if(isTheThrowAFailureCase(currentDiceResults)) {
						updateCurrentPlayerScoreAccordingFailureType(currentDiceResults);
						updateCurrentPlayer();
					} else {
						int newPointsEarned = currentDiceResults.getFirstElement() + currentDiceResults.getSecondElement();
						updateTempCurrentPlayerScore(newPointsEarned);
						updateMaxScoreEarned();
					}
					System.out.println("111111 Player name : " + this.currentPlayer.getName() + " Player score: " + this.currentPlayer.getScore());
				} else {
					updateGlobalCurrentPlayerScore();
					System.out.println("222222 Player name : " + this.currentPlayer.getName() + " Player score: " + this.currentPlayer.getScore());
					updateCurrentPlayer();
				}
				System.out.println("33333 Player name : " + this.currentPlayer.getName() + " Player score: " + this.currentPlayer.getScore());
				
			} while(!wasTheGoalScoreHitted());
			this.exitGame = true;
		}
	}
	
	public void updateMaxScoreEarned() {
		if(this.currentPlayer.getScore() > this.maxScoreEarned)
			this.maxScoreEarned = this.currentPlayer.getScore();
	}
	
	public boolean doDiceRoll(boolean decision) {
		return decision;
	}
	
	public void setGameConfiguration() {
		createPlayers();
		showPlayerList();
		mixedUpPlayersShift();
		showPlayerList();
	}
	
	public boolean wasTheGoalScoreHitted() {
		return this.maxScoreEarned >= this.GOAL_SCORE
					? true
					: false;
	}
	
	public Player getCurrentPlayer() {
		return this.playerList.get(this.currentPlayerIdx);
	}
	
	public void updateCurrentPlayer() {
		this.currentPlayerIdx++;
		this.currentPlayerIdx = (this.currentPlayerIdx % this.playerAmount);
		this.currentPlayer = this.playerList.get(this.currentPlayerIdx);
	}
	
	public boolean isTheThrowAFailureCase(Pair gameDiceResults) {
		if(endTurnAndLoseCurrentEarnedPoints(gameDiceResults.getFirstElement(), gameDiceResults.getSecondElement())) {
			return true;
		} else if(endTurnAndLoseAllEarnedPoints(gameDiceResults.getFirstElement(), gameDiceResults.getSecondElement())) {
			return true;
		}
		return false;
	}
	
	public void updateCurrentPlayerScoreAccordingFailureType(Pair gameDiceResults) {
		if(endTurnAndLoseCurrentEarnedPoints(gameDiceResults.getFirstElement(), gameDiceResults.getSecondElement())) {
			//do nothing
		} else if(endTurnAndLoseAllEarnedPoints(gameDiceResults.getFirstElement(), gameDiceResults.getSecondElement())) {
			this.currentPlayer.setScore(this.INITIAL_SCORE);
			updateGlobalCurrentPlayerScore();
		}
	}
	
	public void updateTempCurrentPlayerScore(int newPointsEarned) {
		int currentPlayerScore = this.currentPlayer.getScore();
		this.currentPlayer.setScore(currentPlayerScore + newPointsEarned);
		this.playerList.set(this.currentPlayerIdx, currentPlayer);
	}
	
	public void updateGlobalCurrentPlayerScore() {
		this.playerList.set(this.currentPlayerIdx, currentPlayer);
	}
	
	public boolean endTurnAndLoseCurrentEarnedPoints(int valueDiceOne, int valueDiceTwo) {
		return (valueDiceOne == 1 && valueDiceTwo != 1) || (valueDiceOne != 1 && valueDiceTwo == 1)
					? true
					: false;
	}
	
	public boolean endTurnAndLoseAllEarnedPoints(int valueDiceOne, int valueDiceTwo) {
		return (valueDiceOne == 1 && valueDiceTwo == 1)
					? true
					: false;
	}
	
	public void mixedUpPlayersShift() {
		int mixedUpTimes = 5;
		Pair switchIndexPair = getSwitchTupleIndexPair();
		
		for(int i = 0; i < mixedUpTimes; i++) {
			Player auxPlayerOne = this.playerList.get(switchIndexPair.getSecondElement());
			Player auxPlayertwo = this.playerList.get(switchIndexPair.getFirstElement());
			this.playerList.set(switchIndexPair.getSecondElement(), auxPlayertwo);
			this.playerList.set(switchIndexPair.getFirstElement(), auxPlayerOne);
			switchIndexPair = getSwitchTupleIndexPair();
		}
	}
	
	public Pair getSwitchTupleIndexPair(){
		boolean differentValuesSetted = false;
		Dice dice = new Dice(this.playerAmount - 1);
		Pair switchIndexPair = new Pair();
		switchIndexPair.updateValuePair(dice.throwDice(), dice.throwDice());
		
		while(!differentValuesSetted) {
			if(switchIndexPair.getFirstElement() != switchIndexPair.getSecondElement()) {
				break;
			}
			switchIndexPair.updateValuePair(switchIndexPair.getFirstElement(), dice.throwDice());
		}
		return switchIndexPair;
	}
	
	public void showPlayerList() {
		for(int i = 0; i < this.playerList.size(); i++) {
			System.out.print(this.playerList.get(i).getName() + "-->");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		PigGame pigGame = new PigGame();
		pigGame.starGame();
	}

}
