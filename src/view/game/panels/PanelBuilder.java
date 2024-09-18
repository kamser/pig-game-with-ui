package view.game.panels;

import java.awt.Color;
import java.util.List;

import common.CustomLabel;

public class PanelBuilder implements Builder{
	
	private int xCoordenadePosition;
	private int yCoordenadePosition;
	private int panelWidth;
	private int panelHeigth;
	private List<CustomLabel> referenceLabelValues;
	private Color backgroundColor;
	

	@Override
	public PanelBuilder setxCoordenadePosition(int xCoordenadePosition) {
		this.xCoordenadePosition = xCoordenadePosition;
		return this;
		
	}

	@Override
	public PanelBuilder setyCoordenadePosition(int yCoordenadePosition) {
		this.yCoordenadePosition = yCoordenadePosition;
		return this;
		
	}

	@Override
	public PanelBuilder setPanelWidth(int panelWidth) {
		this.panelWidth = panelWidth;
		return this;
		
	}

	@Override
	public PanelBuilder setPanelHeigth(int panelHeigth) {
		this.panelHeigth = panelHeigth;
		return this;
		
	}

	@Override
	public PanelBuilder setReferenceLabelValues(List<CustomLabel> referenceLabelValues) {
		this.referenceLabelValues = referenceLabelValues;
		return this;
		
	}
	
	@Override
	public Builder setBackgroundColor(Color backgroundColor) {
		this.backgroundColor = backgroundColor;
		return this;
	}

	@Override
	public CustomPanel build() {
		return new CustomPanel(xCoordenadePosition, yCoordenadePosition, panelWidth, panelHeigth, referenceLabelValues, backgroundColor);
	}

}
