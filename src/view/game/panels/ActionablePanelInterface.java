package view.game.panels;

import javax.swing.JButton;
import javax.swing.JLabel;

import common.CustomUIelement;


public interface ActionablePanelInterface extends PresentationalPanelInterface{
	public JButton createButton(CustomUIelement elementData);
}
