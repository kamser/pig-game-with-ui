package view.game.panels;

import java.awt.Color;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import common.CustomUIelement;
import view.game.panelBuilder.FormPanelInterface;
import view.game.strategyInterfaces.CreateButtonInt;
import view.game.strategyInterfaces.CreateCheckboxInt;
import view.game.strategyInterfaces.CreateLabelInt;
import view.game.strategyInterfaces.CreateTextfieldInt;

public class CustomFormPanel extends BasePanel implements FormPanelInterface{

	CreateButtonInt customButton;
	CreateLabelInt customLabel;
	CreateCheckboxInt customCheckbox;
	CreateTextfieldInt customTextfield;
	
	public CustomFormPanel(int xCoordenadePosition, int yCoordenadePosition, int panelWidth, int panelHeigth,
			List<CustomUIelement> referenceLabelValues, Color backgroundColor) {
		super(xCoordenadePosition, yCoordenadePosition, panelWidth, panelHeigth, referenceLabelValues, backgroundColor);
	}

	@Override
	public JButton createButton(CustomUIelement elementData) {
		return customButton.createButton(elementData);
	}

	@Override
	public JLabel createLabel(CustomUIelement elementData) {
		return customLabel.createLabel(elementData);
	}
	
	@Override
	public JCheckBox createCheckbox(CustomUIelement elementData) {
		return customCheckbox.createCheckbox(elementData);
	}

	@Override
	public JTextField createTextfield(CustomUIelement elementData) {
		return customTextfield.createTextfield(elementData);
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
				case CHECKBOX:
					setComponent(createCheckbox(uiElementMetadata));
					break;
				case TEXTFIELD:
					setComponent(createTextfield(uiElementMetadata));
					break;
			}
		}
	}

	@Override
	public void createPanel() {
		drawPanel();
		setUIelementsOnPanel();
		
	}
	
	public void setUICustomization(	CreateButtonInt selectedWayToCreateButton, 
									CreateLabelInt selectedWayToCreateLabel,
									CreateCheckboxInt selectedWayToCreateCheckbox,
									CreateTextfieldInt selectedWayToCreateTextfield) {
		customButton = selectedWayToCreateButton;
		customLabel = selectedWayToCreateLabel;
		customCheckbox = selectedWayToCreateCheckbox;
		customTextfield = selectedWayToCreateTextfield;
	}

	

}
