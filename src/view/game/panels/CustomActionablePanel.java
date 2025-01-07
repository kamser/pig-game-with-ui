package view.game.panels;

import java.awt.Color;
import java.awt.Font;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import common.CustomUIelement;
import view.game.panelBuilder.ActionablePanelInterface;
import view.game.strategyInterfaces.CreateButtonInt;
import view.game.strategyInterfaces.CreateLabelInt;

public class CustomActionablePanel extends BasePanel implements ActionablePanelInterface{
	
	CreateButtonInt customButton;
	CreateLabelInt customLabel;

	public CustomActionablePanel(int xCoordenadePosition, int yCoordenadePosition, int panelWidth, int panelHeigth, List<CustomUIelement>referenceLabelValues, Color backgroundColor) {
		super(xCoordenadePosition, yCoordenadePosition, panelWidth, panelHeigth, referenceLabelValues, backgroundColor);
	}

	@Override
	public JLabel createLabel(CustomUIelement uiElementData) {
		return customLabel.createLabel(uiElementData);
	}
	
	@Override
	public JButton createButton(CustomUIelement elementData) {
		return customButton.createButton(elementData);
	}


	@Override
	public void setUIelementsOnPanel() {
		for(CustomUIelement uiElementMetadata : getReferenceLabelValues()) {
			switch(uiElementMetadata.getUiElemID()){
				case BUTTON:
					setComponent(createButton(uiElementMetadata));
					break;
				case LABEL:
					setComponent(createLabel(uiElementMetadata));
					break;
			}
		}
	}

	@Override
	public void createPanel() {
		drawPanel();
		setUIelementsOnPanel();
	}
	
	public void setUICustomization(CreateButtonInt selectedWayToCreateButton, CreateLabelInt selectedWayToCreateLabel) {
		customButton = selectedWayToCreateButton;
		customLabel = selectedWayToCreateLabel;
	}
}
