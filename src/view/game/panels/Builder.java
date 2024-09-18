package view.game.panels;

import java.awt.Color;
import java.util.List;

import common.CustomLabel;

public interface Builder {
	
	public Builder setxCoordenadePosition(int xCoordenadePosition);

	public Builder setyCoordenadePosition(int yCoordenadePosition);

	public Builder setPanelWidth(int panelWidth);

	public Builder setPanelHeigth(int panelHeigth);

	public Builder setReferenceLabelValues(List<CustomLabel> referenceLabelValues);
	
	public Builder setBackgroundColor(Color backgroundColor);
	
	public CustomPanel build();

}
