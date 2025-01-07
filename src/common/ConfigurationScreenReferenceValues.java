package common;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

public class ConfigurationScreenReferenceValues {
	
	public static List<CustomUIelement> getUpperPanelReferenceValues(){
		
		List<CustomUIelement> upperPanelReferenceLabels = new ArrayList<CustomUIelement>();
		
		upperPanelReferenceLabels.add(new CustomUIelement("Game Configuration", new Rectangle(30, 28, 300, 50), UIelementIdentifier.LABEL));
		
		return upperPanelReferenceLabels;
		
	}
	
	public static List<CustomUIelement> getGameConfigurationFormPanelReferenceValues(){
		
		List<CustomUIelement> gameConfigurationFormPanelReferenceLabels = new ArrayList<CustomUIelement>();
		
		gameConfigurationFormPanelReferenceLabels.add(new CustomUIelement("Quick Match", new Rectangle(30, 89, 150, 50), UIelementIdentifier.LABEL));
		
		gameConfigurationFormPanelReferenceLabels.add(new CustomUIelement("", new Rectangle(230, 94, 60, 30), UIelementIdentifier.CHECKBOX));
		
		gameConfigurationFormPanelReferenceLabels.add(new CustomUIelement("Amount of Players", new Rectangle(30, 169, 190, 50), UIelementIdentifier.BUTTON));
		
		gameConfigurationFormPanelReferenceLabels.add(new CustomUIelement("", new Rectangle(230, 182, 101, 20), UIelementIdentifier.TEXTFIELD));
		
		gameConfigurationFormPanelReferenceLabels.add(new CustomUIelement("Amount of Dices", new Rectangle(30, 216, 190, 50), UIelementIdentifier.LABEL));
		
		gameConfigurationFormPanelReferenceLabels.add(new CustomUIelement("", new Rectangle(234, 229, 96, 20), UIelementIdentifier.TEXTFIELD));
		
		gameConfigurationFormPanelReferenceLabels.add(new CustomUIelement("Goal Score", new Rectangle(30, 261, 150, 50), UIelementIdentifier.LABEL));
		
		gameConfigurationFormPanelReferenceLabels.add(new CustomUIelement("", new Rectangle(234, 274, 96, 20), UIelementIdentifier.TEXTFIELD));
		
		
		return gameConfigurationFormPanelReferenceLabels;
		
	}
	
	public static List<CustomUIelement> getGamePlayerFormPanelReferenceValues(){
		
		List<CustomUIelement> gamePlayerFormPanelReferenceLabels = new ArrayList<CustomUIelement>();
		
		gamePlayerFormPanelReferenceLabels.add(new CustomUIelement("Player Creator", new Rectangle(448, 89, 190, 50), UIelementIdentifier.LABEL));
		
		gamePlayerFormPanelReferenceLabels.add(new CustomUIelement("Player one name:", new Rectangle(378, 169, 190, 50), UIelementIdentifier.LABEL));
		
		gamePlayerFormPanelReferenceLabels.add(new CustomUIelement("", new Rectangle(558, 182, 149, 20), UIelementIdentifier.TEXTFIELD));
		
		gamePlayerFormPanelReferenceLabels.add(new CustomUIelement("Player two name:", new Rectangle(378, 216, 190, 50), UIelementIdentifier.LABEL));
		
		gamePlayerFormPanelReferenceLabels.add(new CustomUIelement("", new Rectangle(558, 229, 149, 20), UIelementIdentifier.TEXTFIELD));
		
		gamePlayerFormPanelReferenceLabels.add(new CustomUIelement("Player three name:", new Rectangle(378, 261, 190, 50), UIelementIdentifier.LABEL));
		
		gamePlayerFormPanelReferenceLabels.add(new CustomUIelement("", new Rectangle(558, 274, 149, 20), UIelementIdentifier.TEXTFIELD));
		
		return gamePlayerFormPanelReferenceLabels;
		
	}

	public static List<CustomUIelement> getBottomPanelReferenceValues(){
		
		List<CustomUIelement> bottomPanelReferenceLabels = new ArrayList<CustomUIelement>();
		
		bottomPanelReferenceLabels.add(new CustomUIelement("Start", new Rectangle(618, 434, 89, 23), UIelementIdentifier.BUTTON));
		
		bottomPanelReferenceLabels.add(new CustomUIelement("Exit", new Rectangle(506, 434, 89, 23), UIelementIdentifier.BUTTON));

		
		return bottomPanelReferenceLabels;
		
	}

}
