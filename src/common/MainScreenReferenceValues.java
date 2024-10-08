package common;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

public class MainScreenReferenceValues {
	
	public static List<CustomUIelement> getCurrentShiftInfoPanelLabelReferenceValues(){
		
		List<CustomUIelement> screenReferenceLabels = new ArrayList<CustomUIelement>();
		
		screenReferenceLabels.add(new CustomUIelement("Game Information", new Rectangle(10, 11, 150, 20), UIelementIdentifier.LABEL));
		
		screenReferenceLabels.add(new CustomUIelement("Goal Score", new Rectangle(10, 69, 150, 20), UIelementIdentifier.LABEL));
		
		screenReferenceLabels.add(new CustomUIelement("Max Points Earned:", new Rectangle(10, 130, 150, 20), UIelementIdentifier.LABEL));
		
		screenReferenceLabels.add(new CustomUIelement("Current Winner Name:", new Rectangle(10, 187, 170, 20), UIelementIdentifier.LABEL));
		
		screenReferenceLabels.add(new CustomUIelement("Current Dice Result", new Rectangle(279, 11, 150, 20), UIelementIdentifier.LABEL));
		
		screenReferenceLabels.add(new CustomUIelement("Dice Image", new Rectangle(298, 116, 150, 20), UIelementIdentifier.LABEL));
		
		screenReferenceLabels.add(new CustomUIelement("GAME_SCORE", new Rectangle(45, 99, 150, 20), UIelementIdentifier.LABEL));
		
		screenReferenceLabels.add(new CustomUIelement("MAX_SCORE", new Rectangle(45, 156, 150, 20), UIelementIdentifier.LABEL));
		
		screenReferenceLabels.add(new CustomUIelement("CRRNT_PLYR_NAME", new Rectangle(45, 211, 150, 20), UIelementIdentifier.LABEL));
		
		return screenReferenceLabels;
		
	}
	
	public static List<CustomUIelement> getCurrentPlayerInfoPanelLabelReferenceValues(){
		
		List<CustomUIelement> panelReferenceLabels = new ArrayList<CustomUIelement>();
		
		panelReferenceLabels.add(new CustomUIelement("Current Player Data:", new Rectangle(10, 11, 150, 20), UIelementIdentifier.LABEL));
		
		panelReferenceLabels.add(new CustomUIelement("Throw Dice", new Rectangle(141, 219, 89, 23), UIelementIdentifier.BUTTON));
		
		panelReferenceLabels.add(new CustomUIelement("End Shift", new Rectangle(44, 219, 89, 23), UIelementIdentifier.BUTTON));
		
		panelReferenceLabels.add(new CustomUIelement("Player Name:", new Rectangle(10, 42, 150, 20), UIelementIdentifier.LABEL));
		
		panelReferenceLabels.add(new CustomUIelement("Current Earned Points:", new Rectangle(10, 101, 170, 20), UIelementIdentifier.LABEL));
		
		panelReferenceLabels.add(new CustomUIelement("Global Earned Points:", new Rectangle(10, 159, 150, 20), UIelementIdentifier.LABEL));
		
		panelReferenceLabels.add(new CustomUIelement("Name", new Rectangle(80, 70, 150, 20), UIelementIdentifier.LABEL));
		
		panelReferenceLabels.add(new CustomUIelement("Points", new Rectangle(80, 132, 170, 20), UIelementIdentifier.LABEL));
		
		panelReferenceLabels.add(new CustomUIelement("Points", new Rectangle(80, 190, 170, 20), UIelementIdentifier.LABEL));
		
		return panelReferenceLabels;
		
	}
	
	public static List<CustomUIelement> getPlayerInfoPanelLabelReferenceValues(){
		
		List<CustomUIelement> panelReferenceLabels = new ArrayList<CustomUIelement>();
		
		panelReferenceLabels.add(new CustomUIelement("Player Data:", new Rectangle(10, 11, 150, 20), UIelementIdentifier.LABEL));
		
		panelReferenceLabels.add(new CustomUIelement("Player Name:", new Rectangle(10, 55, 150, 20), UIelementIdentifier.LABEL));
		
		panelReferenceLabels.add(new CustomUIelement("Global Earned Points:", new Rectangle(10, 114, 150, 20), UIelementIdentifier.LABEL));
		
		panelReferenceLabels.add(new CustomUIelement("PLAYER_NAME", new Rectangle(42, 86, 120, 20), UIelementIdentifier.LABEL));
		
		panelReferenceLabels.add(new CustomUIelement("EARNED_POINTS", new Rectangle(42, 141, 120, 20), UIelementIdentifier.LABEL));
		
		return panelReferenceLabels;
		
	}

}
