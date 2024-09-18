package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import common.GameScreenReferenceValues;
import common.GlobalGameVars;
import view.game.panels.CurrentPlayerInfoPanel;
import view.game.panels.CurrentShiftInfoPanel;
import view.game.panels.CustomPanel;
import view.game.panels.PanelBuilder;
import view.game.panels.PlayerInfoPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;


public class Game extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	int screenWidth;
	int screenHeight;
	int playerCounter = 4;

	/**
	 * Launch the application.
	 */
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
	
	public void setSecundaryPlayerInfoPanel2() {
		int nextPanelXCoordenade = GlobalGameVars.xStartCoordenadePoint;
		for(int i = 0; i < playerCounter; i++) {
			PlayerInfoPanel playerPanelInfo = new PlayerInfoPanel(nextPanelXCoordenade, 275, GlobalGameVars.secundaryPanelWeigth, GlobalGameVars.secundaryPanelHeight);
			playerPanelInfo.createPanel();
			contentPane.add(playerPanelInfo);
			playerPanelInfo.setLayout(null);
			nextPanelXCoordenade = nextPanelXCoordenade + GlobalGameVars.secundaryPanelLeftPadding + GlobalGameVars.secundaryPanelWeigth;
		}
	}
	
	public void setSecundaryPlayerInfoPanel() {
		int nextPanelXCoordenade = GlobalGameVars.xStartCoordenadePoint;
		PanelBuilder panelBuilder = new PanelBuilder();
		for(int i = 0; i < playerCounter; i++) {
			CustomPanel playerPanelInfo = panelBuilder
											.setxCoordenadePosition(nextPanelXCoordenade)
											.setyCoordenadePosition(275)
											.setPanelHeigth(GlobalGameVars.secundaryPanelHeight)
											.setPanelWidth(GlobalGameVars.secundaryPanelWeigth)
											.setReferenceLabelValues(GameScreenReferenceValues.getPlayerInfoPanelLabelReferenceValues())
											.setBackgroundColor(GlobalGameVars.brigthLightBlueColor)
											.build();
			playerPanelInfo.createPanel();
			contentPane.add(playerPanelInfo);
			playerPanelInfo.setLayout(null);
			nextPanelXCoordenade = nextPanelXCoordenade + GlobalGameVars.secundaryPanelLeftPadding + GlobalGameVars.secundaryPanelWeigth;
		}
	}
	
	public void setCurrentPlayerInfoPanel() {
		PanelBuilder panelBuilder = new PanelBuilder();
		CustomPanel currentPlayerInfoPanel = panelBuilder
												.setxCoordenadePosition(10)
												.setyCoordenadePosition(11)
												.setPanelHeigth(253)
												.setPanelWidth(240)
												.setReferenceLabelValues(GameScreenReferenceValues.getCurrentPlayerInfoPanelLabelReferenceValues())
												.setBackgroundColor(GlobalGameVars.brigthLightBlueColor)
												.build();
		currentPlayerInfoPanel.createPanel();
		contentPane.add(currentPlayerInfoPanel);
		currentPlayerInfoPanel.setLayout(null);
		
	}
	
	public void setCurrentShiftInfoPanel() {
		PanelBuilder panelBuilder = new PanelBuilder();
		CustomPanel currentShiftInfoPanel = panelBuilder
												.setxCoordenadePosition(259)
												.setyCoordenadePosition(11)
												.setPanelHeigth(253)
												.setPanelWidth(477)
												.setReferenceLabelValues(GameScreenReferenceValues.getCurrentShiftInfoPanelLabelReferenceValues())
												.setBackgroundColor(GlobalGameVars.brigthOrangeColor)
												.build();
		currentShiftInfoPanel.createPanel();
		contentPane.add(currentShiftInfoPanel);
		currentShiftInfoPanel.setLayout(null);
		
	}

	/**
	 * Create the frame.
	 */
	public Game() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setInitialScreenCoordenades();
		setBounds(screenWidth/3, screenHeight/3, 760, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setCurrentPlayerInfoPanel();
		
		setCurrentShiftInfoPanel();
		
		setSecundaryPlayerInfoPanel();

		
	}
}
