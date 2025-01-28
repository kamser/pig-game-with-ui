package view.game.panels;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import behavior.game.MainGameActionListener;
import common.MainScreenReferenceValues;
import view.game.panelBuilder.ActionablePanelBuilder;
import view.game.panelBuilder.PresentationalPanelBuilder;
import view.game.strategyConcrete.SetUIelementsFrPresentationalPanels;
import view.game.strategyConcrete.SimpleButton;
import view.game.strategyConcrete.SimpleLabel;
import common.GlobalGameVars;

public class MainGameParentPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private final int playerCounter = 2;
	
	public MainGameParentPanel() {
		setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setCurrentPlayerInfoPanel();
		
		setCurrentShiftInfoPanel();
		
		setSecundaryPlayerInfoPanel();
	}
	
	public void setSecundaryPlayerInfoPanel() {
		int nextPanelXCoordenade = GlobalGameVars.xStartCoordenadePoint;
		PresentationalPanelBuilder panelBuilder = new PresentationalPanelBuilder();
		for(int i = 0; i < playerCounter; i++) {
			CustomPresentationalPanel playerPanelInfo = panelBuilder
											.setxCoordenadePosition(nextPanelXCoordenade)
											.setyCoordenadePosition(275)
											.setPanelHeigth(GlobalGameVars.secundaryPanelHeight)
											.setPanelWidth(GlobalGameVars.secundaryPanelWeigth)
											.setReferenceLabelValues(MainScreenReferenceValues.getPlayerInfoPanelLabelReferenceValues())
											.setBackgroundColor(GlobalGameVars.brigthLightBlueColor)
											.build();
			playerPanelInfo.setUICustomization(new SimpleLabel(), new SetUIelementsFrPresentationalPanels());
			playerPanelInfo.createPanel();
			add(playerPanelInfo.getPanel());
			playerPanelInfo.getPanel().setLayout(null);
			nextPanelXCoordenade = nextPanelXCoordenade + GlobalGameVars.secundaryPanelLeftPadding + GlobalGameVars.secundaryPanelWeigth;
		}
	}
	
	public void setCurrentPlayerInfoPanel() {
		ActionablePanelBuilder panelBuilder = new ActionablePanelBuilder();
		CustomActionablePanel currentPlayerInfoPanel  = panelBuilder
												.setxCoordenadePosition(10)
												.setyCoordenadePosition(11)
												.setPanelHeigth(253)
												.setPanelWidth(240)
												.setReferenceLabelValues(MainScreenReferenceValues.getCurrentPlayerInfoPanelLabelReferenceValues())
												.setBackgroundColor(GlobalGameVars.brigthLightBlueColor)
												.build();
		currentPlayerInfoPanel.setUICustomization(new SimpleButton(), new SimpleLabel());
		currentPlayerInfoPanel.setPanelBehavior(new MainGameActionListener());
		currentPlayerInfoPanel.createPanel();
		add(currentPlayerInfoPanel.getPanel());
		currentPlayerInfoPanel.getPanel().setLayout(null);
		
	}
	
	public void setCurrentShiftInfoPanel() {
		
		PresentationalPanelBuilder panelBuilder = new PresentationalPanelBuilder();
		CustomPresentationalPanel currentShiftInfoPanel  = panelBuilder
												.setxCoordenadePosition(259)
												.setyCoordenadePosition(11)
												.setPanelHeigth(253)
												.setPanelWidth(477)
												.setReferenceLabelValues(MainScreenReferenceValues.getCurrentShiftInfoPanelLabelReferenceValues())
												.setBackgroundColor(GlobalGameVars.brigthOrangeColor)
												.build();
		currentShiftInfoPanel.setUICustomization(new SimpleLabel(), new SetUIelementsFrPresentationalPanels());
		currentShiftInfoPanel.createPanel();
		add(currentShiftInfoPanel.getPanel());
		currentShiftInfoPanel.getPanel().setLayout(null);
		
	}

}
