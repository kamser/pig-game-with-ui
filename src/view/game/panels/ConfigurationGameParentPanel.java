package view.game.panels;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import behavior.game.ConfigurationActionListener;
import common.ConfigurationScreenReferenceValues;
import common.GlobalGameVars;
import view.game.panelBuilder.ActionablePanelBuilder;
import view.game.panelBuilder.FormPanelBuilder;
import view.game.panelBuilder.PresentationalPanelBuilder;
import view.game.strategyConcrete.SetUIelementsFrPresentationalPanels;
import view.game.strategyConcrete.SimpleButton;
import view.game.strategyConcrete.SimpleCheckbox;
import view.game.strategyConcrete.SimpleLabel;
import view.game.strategyConcrete.SimpleTextfield;
import view.game.strategyConcrete.TitleLabel;

public class ConfigurationGameParentPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CustomFormPanel matchConfigPanel;
	private CustomFormPanel playerConfigPanel;
	private JFrame mainProgramFrame;

	public ConfigurationGameParentPanel(JFrame mainProgramFrame) {
		this.mainProgramFrame = mainProgramFrame;
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setTopTitlePanel();
		matchConfigPanel = setMatchConfigurationPanel();
		playerConfigPanel = setPlayersCreatorPanel();
		setBottomActionPanel();
		
	}
	
	public void setTopTitlePanel() {
		PresentationalPanelBuilder panelBuilder = new PresentationalPanelBuilder();
		CustomPresentationalPanel playerPanelInfo = panelBuilder
										.setxCoordenadePosition(GlobalGameVars.initialMainFrameCoordenade)
										.setyCoordenadePosition(GlobalGameVars.initialMainFrameCoordenade)
										.setPanelHeigth(GlobalGameVars.config_topPanelHeight)
										.setPanelWidth(GlobalGameVars.mainFrameWidth)
										.setReferenceLabelValues(ConfigurationScreenReferenceValues.getUpperPanelReferenceValues())
										.setBackgroundColor(GlobalGameVars.basicLightGreyColor)
										.build();
		playerPanelInfo.setUICustomization(new TitleLabel(), new SetUIelementsFrPresentationalPanels());
		playerPanelInfo.createPanel();
		add(playerPanelInfo.getPanel());
		playerPanelInfo.getPanel().setLayout(null);
	}
	
	public CustomFormPanel setMatchConfigurationPanel() {
		int initialPanelCoordenade_Y = GlobalGameVars.config_topPanelHeight;
		FormPanelBuilder panelBuilder = new FormPanelBuilder();
		CustomFormPanel matchConfigPanel = panelBuilder
										.setxCoordenadePosition(GlobalGameVars.initialMainFrameCoordenade)
										.setyCoordenadePosition(initialPanelCoordenade_Y)
										.setPanelHeigth(GlobalGameVars.config_optionsContentPanelHeight)
										.setPanelWidth(GlobalGameVars.config_optionsContentPanelWeigth)
										.setReferenceLabelValues(ConfigurationScreenReferenceValues.getGameConfigurationFormPanelReferenceValues())
										.setBackgroundColor(GlobalGameVars.brigthLightBlueColor)
										.build();
		matchConfigPanel.setUICustomization(new SimpleButton(), new SimpleLabel(), new SimpleCheckbox(), new SimpleTextfield());
		matchConfigPanel.createPanel();
		add(matchConfigPanel.getPanel());
		matchConfigPanel.getPanel().setLayout(null);
		return matchConfigPanel;
	}
	
	public CustomFormPanel setPlayersCreatorPanel() {
		int initialPanelCoordenade_Y = GlobalGameVars.config_topPanelHeight;
		FormPanelBuilder panelBuilder = new FormPanelBuilder();
		CustomFormPanel playerConfigPanel = panelBuilder
										.setxCoordenadePosition(GlobalGameVars.config_optionsContentPanelWeigth)
										.setyCoordenadePosition(initialPanelCoordenade_Y)
										.setPanelHeigth(GlobalGameVars.config_optionsContentPanelHeight)
										.setPanelWidth(GlobalGameVars.config_optionsContentPanelWeigth)
										.setReferenceLabelValues(ConfigurationScreenReferenceValues.getGamePlayerFormPanelReferenceValues())
										.setBackgroundColor(GlobalGameVars.brigthOrangeColor)
										.build();
		playerConfigPanel.setUICustomization(new SimpleButton(), new SimpleLabel(), new SimpleCheckbox(), new SimpleTextfield());
		playerConfigPanel.createPanel();
		add(playerConfigPanel.getPanel());
		playerConfigPanel.getPanel().setLayout(null);
		return playerConfigPanel;
		
	}
	
	public void setBottomActionPanel() {
		int initialPanelCoordenade_Y = GlobalGameVars.config_topPanelHeight + GlobalGameVars.config_optionsContentPanelHeight;
		ActionablePanelBuilder panelBuilder = new ActionablePanelBuilder();
		CustomActionablePanel bottomButtomConfigPanel  = panelBuilder
												.setxCoordenadePosition(GlobalGameVars.initialMainFrameCoordenade)
												.setyCoordenadePosition(initialPanelCoordenade_Y)
												.setPanelHeigth(GlobalGameVars.buttonHeight*3)
												.setPanelWidth(GlobalGameVars.mainFrameWidth)
												.setReferenceLabelValues(ConfigurationScreenReferenceValues.getBottomPanelReferenceValues())
												.setBackgroundColor(GlobalGameVars.basicLightGreyColor)
												.build();
		bottomButtomConfigPanel.setUICustomization(new SimpleButton(), new SimpleLabel());
		ConfigurationActionListener customConfigurationBehavior = new ConfigurationActionListener(this, matchConfigPanel.getCheckboxComponents(), matchConfigPanel.getTextfieldComponents());
		customConfigurationBehavior.setMainFrameReference(mainProgramFrame);
		bottomButtomConfigPanel.setPanelBehavior(customConfigurationBehavior);
		bottomButtomConfigPanel.createPanel();
		add(bottomButtomConfigPanel.getPanel());
		bottomButtomConfigPanel.getPanel().setLayout(null);
		
	}
	
	public void setMainProgramFrame(JFrame mainProgramFrame) {
		this.mainProgramFrame = mainProgramFrame;
	}
}
