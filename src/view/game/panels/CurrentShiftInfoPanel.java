package view.game.panels;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;

import common.CustomLabel;
import common.GameScreenReferenceValues;

public class CurrentShiftInfoPanel extends JPanel implements PanelInterface{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public JLabel createLabel(CustomLabel label) {
		JLabel lblGameInformation = new JLabel(label.getUIText());
		lblGameInformation.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		lblGameInformation.setBounds(label.getUICoordenadesAndDimentions());
		return lblGameInformation;
	}

	@Override
	public void setLabelsOnPanel() {
		List<CustomLabel> referenceLabelValues = GameScreenReferenceValues.getCurrentShiftInfoPanelLabelReferenceValues();
		
		for(CustomLabel label : referenceLabelValues) {
			
			add(createLabel(label));
		}
		
	}

	@Override
	public void createPanel() {
		setBackground(new Color(255, 128, 64));
		setBounds(259, 11, 477, 253);
		
		setLabelsOnPanel();
		
	}

}
