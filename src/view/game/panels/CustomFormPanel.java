package view.game.panels;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
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
	ActionListener behaviorOnClick;
	
	private List<JCheckBox> panelCheckboxReferences;
	private List<JTextField> panelTextfieldReferences;
	

	public CustomFormPanel(int xCoordenadePosition, int yCoordenadePosition, int panelWidth, int panelHeigth,
			List<CustomUIelement> referenceLabelValues, Color backgroundColor) {
		super(xCoordenadePosition, yCoordenadePosition, panelWidth, panelHeigth, referenceLabelValues, backgroundColor);
		panelCheckboxReferences =  new ArrayList<JCheckBox>();
		panelTextfieldReferences =  new ArrayList<JTextField>();
	}

	@Override
	public JButton createButton(CustomUIelement elementData, ActionListener behaviorOnClick) {
		return customButton.createButton(elementData, behaviorOnClick);
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
	
	/*
	 * Para el caso del setUIelementsOnPanel, se puede pensar que pinta para hacer
	 * uso del patr[on de dise;o startegy, pero no es as[i. La finalidad del algoritmo 
	 * es la misma tanto para el panel de presentacion, de acci[on y de formulario,
	 * sin embargo, los tres requieren diferentes recursos para completarse, no requieren
	 * los mismos recursos, ya que en unos hay botones y lables, en otros solo lables y en
	 * otros a[un m[as elementos, entonces el patr[on strategy no es implementable para este caso
	 * por eso se dejo la logica del algoritmo asociada a la clase y no se extrajo. Adem[as,
	 * Esta est una clase que no va repetir el uso del algoritmo en otros lugares, por lo tanto,
	 * no vale la pena alzar la complejidad del algoritmo.
	 * Para ejemplo, se dej[o el caso del panel de presentaci[on
	 * */

	@Override
	public void setUIelementsOnPanel() {
		for(CustomUIelement uiElementMetadata : getReferenceLabelValues()) {
			switch(uiElementMetadata.getUiElemID()){
				case BUTTON:
					setComponent(createButton(uiElementMetadata, behaviorOnClick));
					break;
				case LABEL:
					setComponent(createLabel(uiElementMetadata));
					break;
				case CHECKBOX:
					JCheckBox newCheckbox = createCheckbox(uiElementMetadata);
					panelCheckboxReferences.add(newCheckbox);
					setComponent(newCheckbox);
					break;
				case TEXTFIELD:
					JTextField textfield = createTextfield(uiElementMetadata);
					panelTextfieldReferences.add(textfield);
					setComponent(textfield);
					break;
			}
		}
	}

	@Override
	public void createPanel() {
		drawPanel();
		setUIelementsOnPanel();
		
	}
	
	@Override
	public void setPanelBehavior(ActionListener behaviorOnClick) {
		this.behaviorOnClick = behaviorOnClick;
		
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
	
	public List<JCheckBox> getCheckboxComponents(){
		return panelCheckboxReferences;
	}
	
	public List<JTextField> getTextfieldComponents(){
		return panelTextfieldReferences;
	}
	

}
