package view.game.panels;

import java.awt.Color;
import java.awt.Font;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;

import common.CustomLabel;
import common.GameScreenReferenceValues;

public class CurrentPlayerInfoPanel extends JPanel implements PanelInterface{

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
		List<CustomLabel> referenceLabelValues = GameScreenReferenceValues.getCurrentPlayerInfoPanelLabelReferenceValues();
		
		for(CustomLabel label : referenceLabelValues) {
			
			add(createLabel(label));
		}
		
		/*JPanel panelCurrentPlayerInfo = new JPanel();
		panelCurrentPlayerInfo.setBackground(new Color(128, 255, 255));
		panelCurrentPlayerInfo.setBounds(10, 11, 240, 253);
		contentPane.add(panelCurrentPlayerInfo);
		panelCurrentPlayerInfo.setLayout(null);
		
		JLabel lblCurrentPlayerTitle = new JLabel("Current Player Data:");
		lblCurrentPlayerTitle.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		lblCurrentPlayerTitle.setBounds(10, 11, 150, 20);
		panelCurrentPlayerInfo.add(lblCurrentPlayerTitle);
		
		JButton btnThrowDice = new JButton("Throw Dice");
		btnThrowDice.setBounds(141, 219, 89, 23);
		panelCurrentPlayerInfo.add(btnThrowDice);
		
		JButton btnEndShift = new JButton("End Shift");
		btnEndShift.setBounds(44, 219, 89, 23);
		panelCurrentPlayerInfo.add(btnEndShift);
		
		JLabel lblPlayerName = new JLabel("Player Name:");
		lblPlayerName.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		lblPlayerName.setBounds(10, 42, 150, 20);
		panelCurrentPlayerInfo.add(lblPlayerName);
		
		JLabel lblCurrentEarnedPoints = new JLabel("Current Earned Points:");
		lblCurrentEarnedPoints.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		lblCurrentEarnedPoints.setBounds(10, 101, 170, 20);
		panelCurrentPlayerInfo.add(lblCurrentEarnedPoints);
		
		JLabel lblGlobalEarnedPoints = new JLabel("Global Earned Points:");
		lblGlobalEarnedPoints.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		lblGlobalEarnedPoints.setBounds(10, 159, 150, 20);
		panelCurrentPlayerInfo.add(lblGlobalEarnedPoints);
		
		JLabel lblPlayerNameValue = new JLabel("Name");
		lblPlayerNameValue.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		lblPlayerNameValue.setBounds(80, 70, 150, 20);
		panelCurrentPlayerInfo.add(lblPlayerNameValue);
		
		JLabel lblPlayerPointsValue = new JLabel("Points");
		lblPlayerPointsValue.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		lblPlayerPointsValue.setBounds(80, 132, 170, 20);
		panelCurrentPlayerInfo.add(lblPlayerPointsValue);
		
		JLabel lblGobalPointsValue = new JLabel("Points");
		lblGobalPointsValue.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		lblGobalPointsValue.setBounds(80, 190, 170, 20);
		panelCurrentPlayerInfo.add(lblGobalPointsValue);*/
		
	}

	@Override
	public void createPanel() {
		setBackground(new Color(128, 255, 255));
		setBounds(10, 11, 240, 253);
		
		setLabelsOnPanel();
		
	}
}
