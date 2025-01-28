package behavior.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class MainGameActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JOptionPane.showMessageDialog(null, "This is the main GAME", "Title for the Main GAME", 0, null);
		
	}
}
