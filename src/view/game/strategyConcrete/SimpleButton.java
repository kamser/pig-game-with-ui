package view.game.strategyConcrete;

import java.awt.event.ActionListener;

import javax.swing.JButton;

import common.CustomUIelement;
import view.game.strategyInterfaces.CreateButtonInt;

public class SimpleButton implements CreateButtonInt {

	@Override
	public JButton createButton(CustomUIelement elementData, ActionListener behaviorOnClick) {
		JButton actionButton = new JButton(elementData.getUIText());
		actionButton.setBounds(elementData.getUICoordenadesAndDimentions());
		actionButton.addActionListener(behaviorOnClick);
		return actionButton;
	}

}
