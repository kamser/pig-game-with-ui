package view.game.panels;

import java.awt.Color;
import java.awt.Component;
import java.util.List;
import javax.swing.JPanel;

import common.CustomUIelement;

public class BasePanel implements BasePanelInterface{
	private int xCoordenadePosition;
	private int yCoordenadePosition;
	private int panelWidth;
	private int panelHeigth;
	List<CustomUIelement> referenceLabelValues;
	private Color backgroundColor;
	JPanel panel;

	public BasePanel(int xCoordenadePosition, int yCoordenadePosition, int panelWidth, int panelHeigth, List<CustomUIelement>referenceLabelValues, Color backgroundColor) {
		this.xCoordenadePosition = xCoordenadePosition;
		this.yCoordenadePosition = yCoordenadePosition;
		this.panelWidth = panelWidth;
		this.panelHeigth = panelHeigth;
		this.referenceLabelValues = referenceLabelValues;
		this.backgroundColor = backgroundColor;
		panel = new JPanel();
	}

	public int getxCoordenadePosition() {
		return xCoordenadePosition;
	}

	public int getyCoordenadePosition() {
		return yCoordenadePosition;
	}

	public int getPanelWidth() {
		return panelWidth;
	}

	public int getPanelHeigth() {
		return panelHeigth;
	}

	public List<CustomUIelement> getReferenceLabelValues() {
		return referenceLabelValues;
	}

	public Color getBackgroundColor() {
		return backgroundColor;
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setxCoordenadePosition(int xCoordenadePosition) {
		this.xCoordenadePosition = xCoordenadePosition;
	}

	public void setyCoordenadePosition(int yCoordenadePosition) {
		this.yCoordenadePosition = yCoordenadePosition;
	}

	public void setPanelWidth(int panelWidth) {
		this.panelWidth = panelWidth;
	}

	public void setPanelHeigth(int panelHeigth) {
		this.panelHeigth = panelHeigth;
	}

	public void setReferenceLabelValues(List<CustomUIelement> referenceLabelValues) {
		this.referenceLabelValues = referenceLabelValues;
	}

	public void setBackgroundColor(Color backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	@Override
	public void drawPanel() {
		panel.setBackground(backgroundColor);
		panel.setBounds(xCoordenadePosition, yCoordenadePosition, panelWidth, panelHeigth);	
		
	}

	@Override
	public void setComponent(Component uiComponent) {
		panel.add(uiComponent);
		
	}
}
