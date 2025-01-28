package view.game.strategyInterfaces;

import java.util.List;

import common.CustomUIelement;
import view.game.panels.BasePanel;

public interface IsetUIelementsOnPanel {
	public void setUIelementsOnPanel(BasePanel panel, List<CustomUIelement> referenceLabelValues, CreateLabelInt customLabel);
}
