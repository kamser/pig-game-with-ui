package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import common.GlobalGameVars;
import view.game.panels.MainGameParentPanel;


import java.awt.Dimension;
import java.awt.Toolkit;


public class Game extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	int screenWidth;
	int screenHeight;
	int playerCounter = 4;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game frame = new Game();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void setInitialScreenCoordenades() {
		Dimension size = Toolkit.getDefaultToolkit().getScreenSize(); 
	    
	    // width will store the width of the screen 
		screenWidth = (int)size.getWidth(); 
	    
	    // height will store the height of the screen 
		screenHeight = (int)size.getHeight(); 
	}

	public Game() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setInitialScreenCoordenades();
		setBounds(screenWidth/3, screenHeight/3, GlobalGameVars.mainFrameWidth, GlobalGameVars.mainFrameHeight);
		contentPane = new MainGameParentPanel();
		
		

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	}
}
