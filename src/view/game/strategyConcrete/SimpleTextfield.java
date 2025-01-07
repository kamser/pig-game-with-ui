package view.game.strategyConcrete;

import javax.swing.JTextField;

import common.CustomUIelement;
import view.game.strategyInterfaces.CreateTextfieldInt;

public class SimpleTextfield implements CreateTextfieldInt{

	@Override
	public JTextField createTextfield(CustomUIelement uiElementData) {
		JTextField textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(uiElementData.getUICoordenadesAndDimentions());
		return textField;
	}

}
