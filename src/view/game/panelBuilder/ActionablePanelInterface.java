package view.game.panelBuilder;

import javax.swing.JButton;
import javax.swing.JLabel;

import common.CustomUIelement;


public interface ActionablePanelInterface extends PresentationalPanelInterface{
	public JButton createButton(CustomUIelement elementData);
}
