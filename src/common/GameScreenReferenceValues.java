package common;

import java.awt.Font;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;

public class GameScreenReferenceValues {
	
	public static List<CustomLabel> getCurrentShiftInfoPanelLabelReferenceValues(){
		
		List<CustomLabel> screenReferenceLabels = new ArrayList<CustomLabel>();
		
		screenReferenceLabels.add(new CustomLabel("Game Information", new Rectangle(10, 11, 150, 20)));
		
		screenReferenceLabels.add(new CustomLabel("Goal Score", new Rectangle(10, 69, 150, 20)));
		
		screenReferenceLabels.add(new CustomLabel("Max Points Earned:", new Rectangle(10, 130, 150, 20)));
		
		screenReferenceLabels.add(new CustomLabel("Current Winner Name:", new Rectangle(10, 187, 170, 20)));
		
		screenReferenceLabels.add(new CustomLabel("Current Dice Result", new Rectangle(279, 11, 150, 20)));
		
		screenReferenceLabels.add(new CustomLabel("Dice Image", new Rectangle(298, 116, 150, 20)));
		
		screenReferenceLabels.add(new CustomLabel("GAME_SCORE", new Rectangle(45, 99, 150, 20)));
		
		screenReferenceLabels.add(new CustomLabel("MAX_SCORE", new Rectangle(45, 156, 150, 20)));
		
		screenReferenceLabels.add(new CustomLabel("CRRNT_PLYR_NAME", new Rectangle(45, 211, 150, 20)));
		
		return screenReferenceLabels;
		
	}
	
	public static List<CustomLabel> getCurrentPlayerInfoPanelLabelReferenceValues(){
		
		List<CustomLabel> panelReferenceLabels = new ArrayList<CustomLabel>();
		
		panelReferenceLabels.add(new CustomLabel("Current Player Data:", new Rectangle(10, 11, 150, 20)));
		
		panelReferenceLabels.add(new CustomLabel("Throw Dice", new Rectangle(141, 219, 89, 23)));
		
		panelReferenceLabels.add(new CustomLabel("End Shift", new Rectangle(44, 219, 89, 23)));
		
		panelReferenceLabels.add(new CustomLabel("Player Name:", new Rectangle(10, 42, 150, 20)));
		
		panelReferenceLabels.add(new CustomLabel("Current Earned Points:", new Rectangle(10, 101, 170, 20)));
		
		panelReferenceLabels.add(new CustomLabel("Global Earned Points:", new Rectangle(10, 159, 150, 20)));
		
		panelReferenceLabels.add(new CustomLabel("Name", new Rectangle(80, 70, 150, 20)));
		
		panelReferenceLabels.add(new CustomLabel("Points", new Rectangle(80, 132, 170, 20)));
		
		panelReferenceLabels.add(new CustomLabel("Points", new Rectangle(80, 190, 170, 20)));
		
		return panelReferenceLabels;
		
	}
	
	public static List<CustomLabel> getPlayerInfoPanelLabelReferenceValues(){
		
		List<CustomLabel> panelReferenceLabels = new ArrayList<CustomLabel>();
		
		panelReferenceLabels.add(new CustomLabel("Player Data:", new Rectangle(10, 11, 150, 20)));
		
		panelReferenceLabels.add(new CustomLabel("Player Name:", new Rectangle(10, 55, 150, 20)));
		
		panelReferenceLabels.add(new CustomLabel("Global Earned Points:", new Rectangle(10, 114, 150, 20)));
		
		panelReferenceLabels.add(new CustomLabel("PLAYER_NAME", new Rectangle(42, 86, 120, 20)));
		
		panelReferenceLabels.add(new CustomLabel("EARNED_POINTS", new Rectangle(42, 141, 120, 20)));
		
		return panelReferenceLabels;
		
	}

}
