package view.game.panels;

import java.awt.Color;
import java.awt.Font;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;

import common.CustomUIelement;

public class CustomPresentationalPanel extends JPanel implements PresentationalPanelInterface{
	
	private static final long serialVersionUID = 1L;
	
	private int xCoordenadePosition;
	private int yCoordenadePosition;
	private int panelWidth;
	private int panelHeigth;
	List<CustomUIelement> referenceLabelValues;
	private Color backgroundColor;

	public CustomPresentationalPanel(int xCoordenadePosition, int yCoordenadePosition, int panelWidth, int panelHeigth, List<CustomUIelement>referenceLabelValues, Color backgroundColor) {
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
	public void setUIelementsOnPanel() {
		for(CustomUIelement label : referenceLabelValues) {
			add(createLabel(label));
		}
	}

	@Override
	public void createPanel() {
		setBackground(backgroundColor);
		setBounds(xCoordenadePosition, yCoordenadePosition, panelWidth, panelHeigth);	
		setUIelementsOnPanel();
	}

}
