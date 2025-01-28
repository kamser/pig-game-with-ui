package view.game.strategyConcrete;

import java.awt.Font;

import javax.swing.JLabel;

import common.CustomUIelement;
import common.GlobalGameVars;
import view.game.strategyInterfaces.CreateLabelInt;

public class SimpleLabel implements CreateLabelInt{

	@Override
	public JLabel createLabel(CustomUIelement uiElementData) {
		JLabel gameLabel = new JLabel(uiElementData.getUIText());
		gameLabel.setFont(new Font(GlobalGameVars.textFontStyle, Font.BOLD, GlobalGameVars.textFontSizeNormalLabel));
		gameLabel.setBounds(uiElementData.getUICoordenadesAndDimentions());
		return gameLabel;
	}

}
