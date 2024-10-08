package view.game.panels;

import java.awt.Color;
import java.util.List;

import common.CustomUIelement;

public interface PresentationalBuilder {
	
	public PresentationalBuilder setxCoordenadePosition(int xCoordenadePosition);

	public PresentationalBuilder setyCoordenadePosition(int yCoordenadePosition);

	public PresentationalBuilder setPanelWidth(int panelWidth);

	public PresentationalBuilder setPanelHeigth(int panelHeigth);

	public PresentationalBuilder setReferenceLabelValues(List<CustomUIelement> referenceLabelValues);
	
	public PresentationalBuilder setBackgroundColor(Color backgroundColor);
	
	public CustomPresentationalPanel build();

}
