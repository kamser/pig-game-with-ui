package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Configuration extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldAmountOfPlayers;
	private JTextField textFieldDicesAmount;
	private JTextField textFieldGoalScore;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Configuration frame = new Configuration();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Configuration() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 760, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblConfigurationTitle = new JLabel("Game Configuration");
		lblConfigurationTitle.setFont(new Font("Yu Gothic", Font.BOLD, 20));
		lblConfigurationTitle.setBounds(30, 28, 300, 50);
		contentPane.add(lblConfigurationTitle);
		
		JLabel lblQuickMatch = new JLabel("Quick Match");
		lblQuickMatch.setFont(new Font("Yu Gothic", Font.BOLD, 19));
		lblQuickMatch.setBounds(30, 89, 150, 50);
		contentPane.add(lblQuickMatch);
		
		JLabel lblAmountOfPlayers = new JLabel("Amount of Players");
		lblAmountOfPlayers.setFont(new Font("Yu Gothic", Font.BOLD, 19));
		lblAmountOfPlayers.setBounds(30, 169, 190, 50);
		contentPane.add(lblAmountOfPlayers);
		
		JLabel lblQuickMatch_1_1 = new JLabel("Amount of Dices");
		lblQuickMatch_1_1.setFont(new Font("Yu Gothic", Font.BOLD, 19));
		lblQuickMatch_1_1.setBounds(30, 216, 190, 50);
		contentPane.add(lblQuickMatch_1_1);
		
		JLabel lblQuickMatch_1_2 = new JLabel("Goal Score");
		lblQuickMatch_1_2.setFont(new Font("Yu Gothic", Font.BOLD, 19));
		lblQuickMatch_1_2.setBounds(30, 261, 150, 50);
		contentPane.add(lblQuickMatch_1_2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setBounds(230, 94, 60, 30);
		contentPane.add(chckbxNewCheckBox);
		
		textFieldAmountOfPlayers = new JTextField();
		textFieldAmountOfPlayers.setBounds(230, 182, 101, 20);
		contentPane.add(textFieldAmountOfPlayers);
		textFieldAmountOfPlayers.setColumns(10);
		
		textFieldDicesAmount = new JTextField();
		textFieldDicesAmount.setBounds(234, 229, 96, 20);
		contentPane.add(textFieldDicesAmount);
		textFieldDicesAmount.setColumns(10);
		
		textFieldGoalScore = new JTextField();
		textFieldGoalScore.setBounds(234, 274, 96, 20);
		contentPane.add(textFieldGoalScore);
		textFieldGoalScore.setColumns(10);
		
		JButton btnStartGame = new JButton("Start Game");
		btnStartGame.setBounds(618, 434, 89, 23);
		contentPane.add(btnStartGame);
		
		JButton btnExitGame = new JButton("Exit");
		btnExitGame.setBounds(506, 434, 89, 23);
		contentPane.add(btnExitGame);
		
		JLabel lblPlayerName = new JLabel("Player one name:");
		lblPlayerName.setFont(new Font("Yu Gothic", Font.BOLD, 19));
		lblPlayerName.setBounds(378, 169, 190, 50);
		contentPane.add(lblPlayerName);
		
		JLabel lblPlayerTwoName = new JLabel("Player two name:");
		lblPlayerTwoName.setFont(new Font("Yu Gothic", Font.BOLD, 19));
		lblPlayerTwoName.setBounds(378, 216, 190, 50);
		contentPane.add(lblPlayerTwoName);
		
		JLabel lblPlayerThreeName = new JLabel("Player three name:");
		lblPlayerThreeName.setFont(new Font("Yu Gothic", Font.BOLD, 19));
		lblPlayerThreeName.setBounds(378, 261, 190, 50);
		contentPane.add(lblPlayerThreeName);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(558, 182, 149, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(558, 229, 149, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(558, 274, 149, 20);
		contentPane.add(textField_2);
		
		JLabel lblPlayerCreator = new JLabel("Player Creator");
		lblPlayerCreator.setFont(new Font("Yu Gothic", Font.BOLD, 19));
		lblPlayerCreator.setBounds(448, 89, 190, 50);
		contentPane.add(lblPlayerCreator);
	}
}
