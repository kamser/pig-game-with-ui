package view.game.panelBuilder;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import common.CustomUIelement;
import view.game.strategyInterfaces.CreateButtonInt;
import view.game.strategyInterfaces.CreateLabelInt;


public interface ActionablePanelInterface extends PresentationalPanelInterface{
	public JButton createButton(CustomUIelement elementData, ActionListener behaviorOnClick);
	public void setPanelBehavior(ActionListener behaviorOnClick);
}
