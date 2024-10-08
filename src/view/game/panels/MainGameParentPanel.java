package view.game.panels;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import common.MainScreenReferenceValues;
import common.GlobalGameVars;

public class MainGameParentPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private final int playerCounter = 4;
	
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
			playerPanelInfo.createPanel();
			add(playerPanelInfo);
			playerPanelInfo.setLayout(null);
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
		currentPlayerInfoPanel.createPanel();
		add(currentPlayerInfoPanel);
		currentPlayerInfoPanel.setLayout(null);
		
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
		currentShiftInfoPanel.createPanel();
		add(currentShiftInfoPanel);
		currentShiftInfoPanel.setLayout(null);
		
	}

}
