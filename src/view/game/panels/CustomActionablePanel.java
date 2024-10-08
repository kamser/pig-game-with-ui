package view.game.panels;

import java.awt.Color;
import java.awt.Font;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import common.CustomUIelement;

public class CustomActionablePanel extends JPanel implements ActionablePanelInterface{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int xCoordenadePosition;
	private int yCoordenadePosition;
	private int panelWidth;
	private int panelHeigth;
	List<CustomUIelement> referenceLabelValues;
	private Color backgroundColor;

	public CustomActionablePanel(int xCoordenadePosition, int yCoordenadePosition, int panelWidth, int panelHeigth, List<CustomUIelement>referenceLabelValues, Color backgroundColor) {
		super();
		this.xCoordenadePosition = xCoordenadePosition;
		this.yCoordenadePosition = yCoordenadePosition;
		this.panelWidth = panelWidth;
		this.panelHeigth = panelHeigth;
		this.referenceLabelValues = referenceLabelValues;
		this.backgroundColor = backgroundColor;
	}

	@Override
	public JLabel createLabel(CustomUIelement uiElementData) {
		JLabel gameLabel = new JLabel(uiElementData.getUIText());
		gameLabel.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		gameLabel.setBounds(uiElementData.getUICoordenadesAndDimentions());
		return gameLabel;
	}
	
	@Override
	public JButton createButton(CustomUIelement elementData) {
		JButton actionButton = new JButton(elementData.getUIText());
		actionButton.setBounds(elementData.getUICoordenadesAndDimentions());
		return actionButton;
	}


	@Override
	public void setUIelementsOnPanel() {
		for(CustomUIelement uiElementMetadata : referenceLabelValues) {
			switch(uiElementMetadata.getUiElemID()){
				case BUTTON:
					add(createButton(uiElementMetadata));
					break;
				case LABEL:
					add(createLabel(uiElementMetadata));
					break;
			}
		}
	}

	@Override
	public void createPanel() {
		setBackground(backgroundColor);
		setBounds(xCoordenadePosition, yCoordenadePosition, panelWidth, panelHeigth);	
		setUIelementsOnPanel();
		
	}
}
