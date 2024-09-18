package view.game.panels;

import java.awt.Color;
import java.awt.Font;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;

import common.CustomLabel;
import common.GameScreenReferenceValues;

public class PlayerInfoPanel  extends JPanel implements PanelInterface{

	private int xCoordenadePosition;
	private int yCoordenadePosition;
	private int panelWidth;
	private int panelHeigth;
	private static final long serialVersionUID = 1L;
	
	public PlayerInfoPanel(int xCoordenadePosition, int yCoordenadePosition, int panelWidth, int panelHeigth) {
		super();
		this.xCoordenadePosition = xCoordenadePosition;
		this.yCoordenadePosition = yCoordenadePosition;
		this.panelWidth = panelWidth;
		this.panelHeigth = panelHeigth;
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
		List<CustomLabel> referenceLabelValues = GameScreenReferenceValues.getPlayerInfoPanelLabelReferenceValues();
		
		for(CustomLabel label : referenceLabelValues) {
			
			add(createLabel(label));
		}
		
	}

	@Override
	public void createPanel() {
		setBackground(new Color(128, 255, 255));
		setBounds(xCoordenadePosition, yCoordenadePosition, panelWidth, panelHeigth);
		
		setLabelsOnPanel();
		
	}

}
