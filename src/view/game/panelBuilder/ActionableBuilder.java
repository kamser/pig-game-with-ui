package view.game.panelBuilder;

import java.awt.Color;
import java.util.List;

import common.CustomUIelement;
import view.game.panels.CustomActionablePanel;

public interface ActionableBuilder {
	public ActionableBuilder setxCoordenadePosition(int xCoordenadePosition);

	public ActionableBuilder setyCoordenadePosition(int yCoordenadePosition);

	public ActionableBuilder setPanelWidth(int panelWidth);

	public ActionableBuilder setPanelHeigth(int panelHeigth);

	public ActionableBuilder setReferenceLabelValues(List<CustomUIelement> referenceLabelValues);
	
	public ActionableBuilder setBackgroundColor(Color backgroundColor);
	
	public CustomActionablePanel build();

}
