package view.game.strategyConcrete;

import javax.swing.JCheckBox;

import common.CustomUIelement;
import view.game.strategyInterfaces.CreateCheckboxInt;

public class SimpleCheckbox implements CreateCheckboxInt{

	@Override
	public JCheckBox createCheckbox(CustomUIelement uiElementData) {
		JCheckBox checkBox = new JCheckBox("");
		checkBox.setBounds(uiElementData.getUICoordenadesAndDimentions());
		return checkBox;
	}

}
