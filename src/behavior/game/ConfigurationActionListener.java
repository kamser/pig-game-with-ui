package behavior.game;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import behavior.game.interfaces.FormAccionInt;
import common.GlobalGameVars;
import view.Game;
import view.game.panels.MainGameParentPanel;

public class ConfigurationActionListener implements ActionListener, FormAccionInt{
	
	private List<JCheckBox> checkboxReferenceList;
	private List<JTextField> textfieldReferenceList;
	private JPanel parentPanel;
	private JFrame mainProgramFrame;

	public ConfigurationActionListener(JPanel parentPanel, List<JCheckBox> checkboxReferenceList, List<JTextField> textfieldReferenceList) {
		super();
		this.checkboxReferenceList = checkboxReferenceList;
		this.textfieldReferenceList = textfieldReferenceList;
		this.parentPanel = parentPanel;
	}
	
	@Override
	public void actionPerformed(ActionEvent command) {
		if(command.getActionCommand().equals(GlobalGameVars.START_GAME_COMMAND)) {
			startGame();
		} else {
			exitGame(); 
		}	
	}
	
	private void startGame() {
		String message = "";
		String title = "";
		
		if(areAllRequiredFieldsFullfilled()) {
			for(JCheckBox checkbox : checkboxReferenceList) {
				if(checkbox.isSelected()) {
					message = "The checkbox was selected";
					title =  "Checkbox text validation";
				} else {
					message = "The checkbox was NOT selected";
					title =  "Checkbox text validation for negative scenario";
				}
					
			}
			JOptionPane.showMessageDialog(null, message, title, 0, null);
			displayMainGamePanel();
		} else {
			JOptionPane.showMessageDialog(null, "There is something wrong with some field", "Error to start the game", 0, null);
		}
	}
	
	private void displayMainGamePanel() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//mainProgramFrame.getContentPane().removeAll();
					mainProgramFrame.remove(parentPanel);
					//mainProgramFrame.add(new MainGameParentPanel());
					//mainProgramFrame.getContentPane().invalidate();
					mainProgramFrame.revalidate();
					mainProgramFrame.repaint();
					mainProgramFrame.setContentPane(new MainGameParentPanel());
					//mainProgramFrame.getContentPane().invalidate();
					mainProgramFrame.revalidate();
					mainProgramFrame.repaint();
					//mainProgramFrame.pack(); 
					//parentPanel.setVisible(false);
					//mainProgramFrame.remove(parentPanel);
					/*mainProgramFrame.getContentPane().remove(parentPanel);
					mainProgramFrame.add(new MainGameParentPanel());
					mainProgramFrame.getContentPane().invalidate();
					mainProgramFrame.getContentPane().validate();
					mainProgramFrame.repaint();*/
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
	
	public void setParentPanelRefrence(JPanel parentPanel) {
		this.parentPanel = parentPanel;
		
	}
	
	public void setMainFrameReference(JFrame mainProgramFrame) {
		this.mainProgramFrame = mainProgramFrame;
	}
	
	private boolean areAllRequiredFieldsFullfilled() {
		boolean areAllRequiredFieldsFullfilled = true;
		for(JTextField textfield : textfieldReferenceList) {
			if(textfield.getText().equals("")) {
				areAllRequiredFieldsFullfilled = false;
				break;
			}
		}
		return areAllRequiredFieldsFullfilled;
	}
	
	
	
	private void exitGame() {
		
	}

	@Override
	public void updateCheckboxs(List<Component> checkboxList) {
		//to do
		
	}

	@Override
	public void updateTextfields() {
		// TODO Auto-generated method stub
		
	}

}
