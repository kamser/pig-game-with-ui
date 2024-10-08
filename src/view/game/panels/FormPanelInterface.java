package view.game.panels;

import javax.swing.JCheckBox;
import javax.swing.JTextField;

import common.CustomUIelement;

public interface FormPanelInterface extends ActionablePanelInterface{
	public JCheckBox createCheckbox(CustomUIelement elementData);
	public JTextField createTextfield(CustomUIelement elementData);
}
