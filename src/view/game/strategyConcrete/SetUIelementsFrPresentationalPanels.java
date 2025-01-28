package view.game.strategyConcrete;

import java.util.List;

import common.CustomUIelement;
import view.game.panels.BasePanel;
import view.game.strategyInterfaces.CreateLabelInt;
import view.game.strategyInterfaces.IsetUIelementsOnPanel;

public class SetUIelementsFrPresentationalPanels implements IsetUIelementsOnPanel{

	@Override
	public void setUIelementsOnPanel(BasePanel panel, List<CustomUIelement> referenceLabelValues, CreateLabelInt customLabel) {
		for(CustomUIelement UIelementMetadata : referenceLabelValues) {
			panel.setComponent(customLabel.createLabel(UIelementMetadata));
		}
	}

}
