package view.game.panels;

import java.awt.Color;
import java.util.List;

import common.CustomUIelement;

public class PresentationalPanelBuilder implements PresentationalBuilder{
	
	private int xCoordenadePosition;
	private int yCoordenadePosition;
	private int panelWidth;
	private int panelHeigth;
	private List<CustomUIelement> referenceLabelValues;
	private Color backgroundColor;
	

	@Override
	public PresentationalPanelBuilder setxCoordenadePosition(int xCoordenadePosition) {
		this.xCoordenadePosition = xCoordenadePosition;
		return this;
		
	}

	@Override
	public PresentationalPanelBuilder setyCoordenadePosition(int yCoordenadePosition) {
		this.yCoordenadePosition = yCoordenadePosition;
		return this;
		
	}

	@Override
	public PresentationalPanelBuilder setPanelWidth(int panelWidth) {
		this.panelWidth = panelWidth;
		return this;
		
	}

	@Override
	public PresentationalPanelBuilder setPanelHeigth(int panelHeigth) {
		this.panelHeigth = panelHeigth;
		return this;
		
	}

	@Override
	public PresentationalPanelBuilder setReferenceLabelValues(List<CustomUIelement> referenceLabelValues) {
		this.referenceLabelValues = referenceLabelValues;
		return this;
		
	}
	
	@Override
	public PresentationalPanelBuilder setBackgroundColor(Color backgroundColor) {
		this.backgroundColor = backgroundColor;
		return this;
	}

	@Override
	public CustomPresentationalPanel build() {
		return new CustomPresentationalPanel(xCoordenadePosition, yCoordenadePosition, panelWidth, panelHeigth, referenceLabelValues, backgroundColor);
	}

}
