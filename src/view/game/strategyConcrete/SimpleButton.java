package view.game.strategyConcrete;

import javax.swing.JButton;

import common.CustomUIelement;
import view.game.strategyInterfaces.CreateButtonInt;

public class SimpleButton implements CreateButtonInt {

	@Override
	public JButton createButton(CustomUIelement elementData) {
		JButton actionButton = new JButton(elementData.getUIText());
		actionButton.setBounds(elementData.getUICoordenadesAndDimentions());
		return actionButton;
	}

}
