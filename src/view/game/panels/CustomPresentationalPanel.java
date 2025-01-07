package view.game.panels;

import java.awt.Color;
import java.util.List;

import javax.swing.JLabel;

import common.CustomUIelement;
import view.game.panelBuilder.PresentationalPanelInterface;
import view.game.strategyInterfaces.CreateLabelInt;

public class CustomPresentationalPanel extends BasePanel implements PresentationalPanelInterface{
	
	CreateLabelInt customLabel;

	public CustomPresentationalPanel(int xCoordenadePosition, int yCoordenadePosition, int panelWidth, int panelHeigth, List<CustomUIelement>referenceLabelValues, Color backgroundColor) {
		super(xCoordenadePosition, yCoordenadePosition, panelWidth, panelHeigth, referenceLabelValues, backgroundColor);
	}

	@Override
	public JLabel createLabel(CustomUIelement uiElementData) {
		return customLabel.createLabel(uiElementData);
	}
	

	@Override
	public void setUIelementsOnPanel() {
		for(CustomUIelement UIelementMetadata : referenceLabelValues) {
			setComponent(createLabel(UIelementMetadata));
		}
	}

	@Override
	public void createPanel() {
		drawPanel();	
		setUIelementsOnPanel();
	}
	
	public void setUICustomization(CreateLabelInt selectedWayToCreateLabel) {
		customLabel = selectedWayToCreateLabel;
	}

}
