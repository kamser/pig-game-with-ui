package common;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

public class ConfigurationScreenReferenceValues {
	
	public static List<CustomUIelement> getUpperPanelReferenceValues(){
		
		List<CustomUIelement> upperPanelReferenceLabels = new ArrayList<CustomUIelement>();
		
		upperPanelReferenceLabels.add(new CustomUIelement(ConfigurationPanelVars.TITLE_PANEL_LBL, new Rectangle(GlobalGameVars.secundaryLabelleftPadding, GlobalGameVars.secundaryLabelTopPadding, 300, GlobalGameVars.labelHeight), UIelementIdentifier.LABEL));
		
		return upperPanelReferenceLabels;
		
	}
	
	public static List<CustomUIelement> getGameConfigurationFormPanelReferenceValues(){
		
		List<CustomUIelement> gameConfigurationFormPanelReferenceLabels = new ArrayList<CustomUIelement>();
		
		int nextYcoordenadeFrLabel = GlobalGameVars.defaulInitialMarginTopFrFistUIElement;
		int nextYcoordenadeFrUIelements = nextYcoordenadeFrLabel + GlobalGameVars.pixelDistanceAlignerBetweenCoorelatedUIelements;
		
		gameConfigurationFormPanelReferenceLabels.add(new CustomUIelement(ConfigurationPanelVars.QUICK_MATCH_LBL, 
														new Rectangle(GlobalGameVars.secundaryLabelleftPadding, 
																	nextYcoordenadeFrLabel, 
																	GlobalGameVars.labelWidth, 
																	GlobalGameVars.labelHeight),
														UIelementIdentifier.LABEL));
		
		gameConfigurationFormPanelReferenceLabels.add(new CustomUIelement(ConfigurationPanelVars.EMPTY_TXT_CONTENT,
														new Rectangle(GlobalGameVars.leftPaddingFrSecondUIinlineItem, 
																nextYcoordenadeFrUIelements, 
																GlobalGameVars.shortTextfieldWidth, 
																GlobalGameVars.TextfieldHeight),
														UIelementIdentifier.CHECKBOX));
		
		nextYcoordenadeFrLabel += GlobalGameVars.defaultDistanceBetweenUIelements;
		nextYcoordenadeFrUIelements = nextYcoordenadeFrLabel + GlobalGameVars.pixelDistanceAlignerBetweenCoorelatedUIelements;
		
		gameConfigurationFormPanelReferenceLabels.add(new CustomUIelement(ConfigurationPanelVars.PLAYERS_AMOUNT_LBL,
														new Rectangle(GlobalGameVars.secundaryLabelleftPadding, 
																nextYcoordenadeFrLabel, 
																GlobalGameVars.labelWidth, 
																GlobalGameVars.labelHeight),
														UIelementIdentifier.LABEL));
		
		gameConfigurationFormPanelReferenceLabels.add(new CustomUIelement(ConfigurationPanelVars.EMPTY_TXT_CONTENT, 
														new Rectangle(GlobalGameVars.leftPaddingFrSecondUIinlineItem,
																nextYcoordenadeFrUIelements,
																GlobalGameVars.shortTextfieldWidth,
																GlobalGameVars.TextfieldHeight),
														UIelementIdentifier.TEXTFIELD));
		
		nextYcoordenadeFrLabel += GlobalGameVars.defaultDistanceBetweenUIelements;
		nextYcoordenadeFrUIelements = nextYcoordenadeFrLabel + GlobalGameVars.pixelDistanceAlignerBetweenCoorelatedUIelements;
		
		gameConfigurationFormPanelReferenceLabels.add(new CustomUIelement(ConfigurationPanelVars.DICES_AMOUNT_LBL,
														new Rectangle(GlobalGameVars.secundaryLabelleftPadding,
																nextYcoordenadeFrLabel,
																GlobalGameVars.labelWidth,
																GlobalGameVars.labelHeight),
														UIelementIdentifier.LABEL));
		
		gameConfigurationFormPanelReferenceLabels.add(new CustomUIelement(ConfigurationPanelVars.EMPTY_TXT_CONTENT,
														new Rectangle(GlobalGameVars.leftPaddingFrSecondUIinlineItem,
																nextYcoordenadeFrUIelements, 
																GlobalGameVars.shortTextfieldWidth, 
																GlobalGameVars.TextfieldHeight), 
														UIelementIdentifier.TEXTFIELD));
		
		nextYcoordenadeFrLabel += GlobalGameVars.defaultDistanceBetweenUIelements;
		nextYcoordenadeFrUIelements = nextYcoordenadeFrLabel + GlobalGameVars.pixelDistanceAlignerBetweenCoorelatedUIelements;
		
		gameConfigurationFormPanelReferenceLabels.add(new CustomUIelement(ConfigurationPanelVars.MATCH_GOAL_SCORE_LBL,
														new Rectangle(GlobalGameVars.secundaryLabelleftPadding,
																nextYcoordenadeFrLabel,
																GlobalGameVars.labelWidth,
																GlobalGameVars.labelHeight),
														UIelementIdentifier.LABEL));
		
		gameConfigurationFormPanelReferenceLabels.add(new CustomUIelement(ConfigurationPanelVars.EMPTY_TXT_CONTENT,
														new Rectangle(GlobalGameVars.leftPaddingFrSecondUIinlineItem,
																nextYcoordenadeFrUIelements,
																GlobalGameVars.shortTextfieldWidth,
																GlobalGameVars.TextfieldHeight),
														UIelementIdentifier.TEXTFIELD));
		
		
		return gameConfigurationFormPanelReferenceLabels;
		
	}
	
	public static List<CustomUIelement> getGamePlayerFormPanelReferenceValues(){
		
		List<CustomUIelement> gamePlayerFormPanelReferenceLabels = new ArrayList<CustomUIelement>();
		
		int nextYcoordenadeFrLabel = GlobalGameVars.defaulInitialMarginTopFrFistUIElement;
		int nextYcoordenadeFrUIelements = nextYcoordenadeFrLabel + GlobalGameVars.pixelDistanceAlignerBetweenCoorelatedUIelements;
		
		gamePlayerFormPanelReferenceLabels.add(new CustomUIelement(ConfigurationPanelVars.PLAYER_CREATOR_TITLE_LBL,
												new Rectangle(GlobalGameVars.secundaryLabelleftPadding,
														nextYcoordenadeFrLabel,
														GlobalGameVars.labelWidth,
														GlobalGameVars.labelHeight),
												UIelementIdentifier.LABEL));
		
		nextYcoordenadeFrLabel += GlobalGameVars.defaultDistanceBetweenUIelements;
		nextYcoordenadeFrUIelements = nextYcoordenadeFrLabel + GlobalGameVars.defaulInitialMarginTopFrFistUIElement;
		
		gamePlayerFormPanelReferenceLabels.add(new CustomUIelement(ConfigurationPanelVars.PLAYER_ONE_NAME_LBL,
												new Rectangle(GlobalGameVars.secundaryLabelleftPadding,
														nextYcoordenadeFrLabel, GlobalGameVars.labelWidth,
														GlobalGameVars.labelHeight),
												UIelementIdentifier.LABEL));
		
		gamePlayerFormPanelReferenceLabels.add(new CustomUIelement(ConfigurationPanelVars.EMPTY_TXT_CONTENT,
												new Rectangle(GlobalGameVars.leftPaddingFrSecondUIinlineItem,
														nextYcoordenadeFrUIelements,
														GlobalGameVars.largeTextfieldWidth,
														GlobalGameVars.TextfieldHeight),
												UIelementIdentifier.TEXTFIELD));
		
		nextYcoordenadeFrLabel += GlobalGameVars.defaultDistanceBetweenUIelements;
		nextYcoordenadeFrUIelements = nextYcoordenadeFrLabel + GlobalGameVars.defaulInitialMarginTopFrFistUIElement;
		
		gamePlayerFormPanelReferenceLabels.add(new CustomUIelement(ConfigurationPanelVars.PLAYER_TWO_NAME_LBL,
												new Rectangle(GlobalGameVars.secundaryLabelleftPadding,
														nextYcoordenadeFrLabel,
														GlobalGameVars.labelWidth,
														GlobalGameVars.labelHeight),
												UIelementIdentifier.LABEL));
		
		gamePlayerFormPanelReferenceLabels.add(new CustomUIelement(ConfigurationPanelVars.EMPTY_TXT_CONTENT,
												new Rectangle(GlobalGameVars.leftPaddingFrSecondUIinlineItem,
														nextYcoordenadeFrUIelements,
														GlobalGameVars.largeTextfieldWidth,
														GlobalGameVars.TextfieldHeight),
												UIelementIdentifier.TEXTFIELD));
		
		nextYcoordenadeFrLabel += GlobalGameVars.defaultDistanceBetweenUIelements;
		nextYcoordenadeFrUIelements = nextYcoordenadeFrLabel + GlobalGameVars.defaulInitialMarginTopFrFistUIElement;
		
		gamePlayerFormPanelReferenceLabels.add(new CustomUIelement(ConfigurationPanelVars.PLAYER_THREE_NAME_LBL,
											new Rectangle(GlobalGameVars.secundaryLabelleftPadding,
													nextYcoordenadeFrLabel,
													GlobalGameVars.labelWidth,
													GlobalGameVars.labelHeight),
											UIelementIdentifier.LABEL));
		
		gamePlayerFormPanelReferenceLabels.add(new CustomUIelement(ConfigurationPanelVars.EMPTY_TXT_CONTENT,
												new Rectangle(GlobalGameVars.leftPaddingFrSecondUIinlineItem,
														nextYcoordenadeFrUIelements,
														GlobalGameVars.largeTextfieldWidth,
														GlobalGameVars.TextfieldHeight),
												UIelementIdentifier.TEXTFIELD));
		
		return gamePlayerFormPanelReferenceLabels;
		
	}

	public static List<CustomUIelement> getBottomPanelReferenceValues(){
		
		List<CustomUIelement> bottomPanelReferenceLabels = new ArrayList<CustomUIelement>();
		
		bottomPanelReferenceLabels.add(new CustomUIelement(ConfigurationPanelVars.START_GAME_LBL,
										new Rectangle(GlobalGameVars.config_leftPaddingFrStartButton,
												GlobalGameVars.defaulInitialMarginTopFrFistUIElement,
												GlobalGameVars.buttonWidth,
												GlobalGameVars.buttonHeight),
										UIelementIdentifier.BUTTON));
		
		bottomPanelReferenceLabels.add(new CustomUIelement(ConfigurationPanelVars.EXIT_GAME_LBL,
										new Rectangle(GlobalGameVars.config_leftPaddingFrExitButton,
												GlobalGameVars.defaulInitialMarginTopFrFistUIElement,
												GlobalGameVars.buttonWidth,
												GlobalGameVars.buttonHeight), 
										UIelementIdentifier.BUTTON));

		
		return bottomPanelReferenceLabels;
		
	}

}
