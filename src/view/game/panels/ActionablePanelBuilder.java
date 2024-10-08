package view.game.panels;

import java.awt.Color;
import java.util.List;

import common.CustomUIelement;

public class ActionablePanelBuilder implements ActionableBuilder{
	private int xCoordenadePosition;
	private int yCoordenadePosition;
	private int panelWidth;
	private int panelHeigth;
	private List<CustomUIelement> referenceLabelValues;
	private Color backgroundColor;
	

	@Override
	public ActionablePanelBuilder setxCoordenadePosition(int xCoordenadePosition) {
		this.xCoordenadePosition = xCoordenadePosition;
		return this;
		
	}

	@Override
	public ActionablePanelBuilder setyCoordenadePosition(int yCoordenadePosition) {
		this.yCoordenadePosition = yCoordenadePosition;
		return this;
		
	}

	@Override
	public ActionablePanelBuilder setPanelWidth(int panelWidth) {
		this.panelWidth = panelWidth;
		return this;
		
	}

	@Override
	public ActionablePanelBuilder setPanelHeigth(int panelHeigth) {
		this.panelHeigth = panelHeigth;
		return this;
		
	}

	@Override
	public ActionablePanelBuilder setReferenceLabelValues(List<CustomUIelement> referenceLabelValues) {
		this.referenceLabelValues = referenceLabelValues;
		return this;
		
	}
	
	@Override
	public ActionablePanelBuilder setBackgroundColor(Color backgroundColor) {
		this.backgroundColor = backgroundColor;
		return this;
	}

	@Override
	public CustomActionablePanel build() {
		return new CustomActionablePanel(xCoordenadePosition, yCoordenadePosition, panelWidth, panelHeigth, referenceLabelValues, backgroundColor);
	}
}
