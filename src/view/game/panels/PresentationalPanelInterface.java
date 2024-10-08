package view.game.panels;

import java.awt.Rectangle;
import java.util.List;

import javax.swing.JLabel;

import common.CustomUIelement;

public interface PresentationalPanelInterface {
	public JLabel createLabel(CustomUIelement elementData);
	public void setUIelementsOnPanel();
	public void createPanel();

}
