package view.game.panelBuilder;

import java.awt.Color;
import java.util.List;

import common.CustomUIelement;
import view.game.panels.CustomFormPanel;

public class FormPanelBuilder implements FormBuilder{
	
	private int xCoordenadePosition;
	private int yCoordenadePosition;
	private int panelWidth;
	private int panelHeigth;
	private List<CustomUIelement> referenceLabelValues;
	private Color backgroundColor;

	@Override
	public FormPanelBuilder setxCoordenadePosition(int xCoordenadePosition) {
		this.xCoordenadePosition = xCoordenadePosition;
		return this;
	}

	@Override
	public FormPanelBuilder setyCoordenadePosition(int yCoordenadePosition) {
		this.yCoordenadePosition = yCoordenadePosition;
		return this;
	}

	@Override
	public FormPanelBuilder setPanelWidth(int panelWidth) {
		this.panelWidth = panelWidth;
		return this;
	}

	@Override
	public FormPanelBuilder setPanelHeigth(int panelHeigth) {
		this.panelHeigth = panelHeigth;
		return this;
	}

	@Override
	public FormPanelBuilder setReferenceLabelValues(List<CustomUIelement> referenceLabelValues) {
		this.referenceLabelValues = referenceLabelValues;
		return this;
	}

	@Override
	public FormPanelBuilder setBackgroundColor(Color backgroundColor) {
		this.backgroundColor = backgroundColor;
		return this;
	}
	
	@Override
	public CustomFormPanel build() {
		// TODO Auto-generated method stub
		return new CustomFormPanel(xCoordenadePosition, yCoordenadePosition, panelWidth, panelHeigth, referenceLabelValues, backgroundColor);
	}
	

}
