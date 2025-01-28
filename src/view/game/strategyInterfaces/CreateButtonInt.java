package view.game.strategyInterfaces;

import java.awt.event.ActionListener;

import javax.swing.JButton;

import common.CustomUIelement;

public interface CreateButtonInt {
	public JButton createButton(CustomUIelement elementData, ActionListener behaviorOnClick);
}
