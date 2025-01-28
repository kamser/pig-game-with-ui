package view.game.panelBuilder;

import java.awt.Color;
import java.util.List;

import common.CustomUIelement;

public interface CustomPanelBuilder {
	
	public CustomPanelBuilder setxCoordenadePosition(int xCoordenadePosition);

	public CustomPanelBuilder setyCoordenadePosition(int yCoordenadePosition);

	public CustomPanelBuilder setPanelWidth(int panelWidth);

	public CustomPanelBuilder setPanelHeigth(int panelHeigth);

	public CustomPanelBuilder setReferenceLabelValues(List<CustomUIelement> referenceLabelValues);
	
	public CustomPanelBuilder setBackgroundColor(Color backgroundColor);

}
