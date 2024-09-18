package view.game.panels;

import java.awt.Color;
import java.awt.Font;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;

import common.CustomLabel;

public class CustomPanel extends JPanel implements PanelInterface{
	
	private static final long serialVersionUID = 1L;
	
	private int xCoordenadePosition;
	private int yCoordenadePosition;
	private int panelWidth;
	private int panelHeigth;
	List<CustomLabel> referenceLabelValues;
	private Color backgroundColor;

	public CustomPanel(int xCoordenadePosition, int yCoordenadePosition, int panelWidth, int panelHeigth, List<CustomLabel>referenceLabelValues, Color backgroundColor) {
		super();
		this.xCoordenadePosition = xCoordenadePosition;
		this.yCoordenadePosition = yCoordenadePosition;
		this.panelWidth = panelWidth;
		this.panelHeigth = panelHeigth;
		this.referenceLabelValues = referenceLabelValues;
		this.backgroundColor = backgroundColor;
	}

	@Override
	public JLabel createLabel(CustomLabel label) {
		JLabel lblGameInformation = new JLabel(label.getUIText());
		lblGameInformation.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		lblGameInformation.setBounds(label.getUICoordenadesAndDimentions());
		return lblGameInformation;
	}

	@Override
	public void setLabelsOnPanel() {
		for(CustomLabel label : referenceLabelValues) {
			add(createLabel(label));
		}
	}

	@Override
	public void createPanel() {
		setBackground(backgroundColor);
		setBounds(xCoordenadePosition, yCoordenadePosition, panelWidth, panelHeigth);	
		setLabelsOnPanel();
	}

}
