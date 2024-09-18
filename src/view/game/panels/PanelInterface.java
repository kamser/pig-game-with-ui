package view.game.panels;

import java.awt.Rectangle;
import java.util.List;

import javax.swing.JLabel;

import common.CustomLabel;

public interface PanelInterface {
	public JLabel createLabel(CustomLabel label);
	public void setLabelsOnPanel();
	public void createPanel();

}
