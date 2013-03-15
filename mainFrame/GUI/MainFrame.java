package GUI;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 * 
 * @author Daniel
 * 
 * 
 *
 */
public class MainFrame {

	private PanelListener panelListener;
	private JFrame mainContainer = new JFrame("Frog Checkers");
	private JPanel mainMenu = new JPanel();
	private JButton btnSinglePlayer, btnMultiPlayer, btnScoreBoard, btnQuit;
	private ImageIcon singlePlayerButton, rollOverSinglePlayerButton, multiPlayerButton, 
					  scoreBoardButton, rollOverScoreBoardButton, 
					  rollOverMultiPlayerButton, quitButton, rollOverQuitButton;
	
	public void start() {
		mainContainer(mainMenu()); // Comment this if you don't want to see the main menu.
		//mainContainer(gamePanel()); // Comment this if you don't want to see the gamePanel.
		//mainContainer(scorePanel()); // Comment this if you don't want to see the scorePanel.
	}

	private JFrame mainContainer(JPanel frame) {
		mainContainer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainContainer.setSize(925, 608);
		mainContainer.setVisible(true);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		mainContainer.setLocation(dim.width / 2 - mainContainer.getSize().width
				/ 2, dim.height / 2 - mainContainer.getSize().height / 2);
		mainContainer.setResizable(false);

		mainContainer.add(frame);

		return mainContainer;
	}

	private JPanel mainMenu() {
		mainMenu.setLayout(null);
		ImagePanel background = new ImagePanel(new ImageIcon("GUIImages\\newBackground.png").getImage());
		
		singlePlayerButton = new ImageIcon("GUIImages\\singlePlayerButton.png");
		rollOverSinglePlayerButton = new ImageIcon("GUIImages\\rollOverSinlgePlayerButton.png");
		btnSinglePlayer = new JButton(singlePlayerButton);
		btnSinglePlayer.setOpaque(false);
		btnSinglePlayer.setContentAreaFilled(false);
		btnSinglePlayer.setBorderPainted(false);
		btnSinglePlayer.setFocusPainted(false);
		btnSinglePlayer.setBounds(320, 25, 275, 130);
		btnSinglePlayer.setRolloverIcon(rollOverSinglePlayerButton);
		mainMenu.add(btnSinglePlayer);
		
		multiPlayerButton = new ImageIcon("GUIImages\\multiPlayerButton.png");
		rollOverMultiPlayerButton = new ImageIcon("GUIImages\\rollOverMultiPlayerButton.png");
		btnMultiPlayer = new JButton(multiPlayerButton);
		btnMultiPlayer.setOpaque(false);
		btnMultiPlayer.setContentAreaFilled(false);
		btnMultiPlayer.setBorderPainted(false);
		btnMultiPlayer.setFocusPainted(false);
		btnMultiPlayer.setBounds(320, 170, 275, 130);
		btnMultiPlayer.setRolloverIcon(rollOverMultiPlayerButton);
		mainMenu.add(btnMultiPlayer);

		scoreBoardButton = new ImageIcon("GUIImages\\scoreBoardButton.png");
		rollOverScoreBoardButton = new ImageIcon("GUIImages\\rollOverScoreBoardButton.png");
		btnScoreBoard = new JButton(scoreBoardButton);
		btnScoreBoard.setOpaque(false);
		btnScoreBoard.setContentAreaFilled(false);
		btnScoreBoard.setBorderPainted(false);
		btnScoreBoard.setFocusPainted(false);
		btnScoreBoard.setBounds(13, 380, 225, 73);
		btnScoreBoard.setRolloverIcon(rollOverScoreBoardButton);
		mainMenu.add(btnScoreBoard);

		quitButton = new ImageIcon("GUIImages\\quitButton.png");
		rollOverQuitButton = new ImageIcon("GUIImages\\rollOverQuitButton.png");
		btnQuit = new JButton(quitButton);
		btnQuit.setOpaque(false);
		btnQuit.setContentAreaFilled(false);
		btnQuit.setBorderPainted(false);
		btnQuit.setFocusPainted(false);
		btnQuit.setBounds(45, 460, 120, 85);
		btnQuit.setRolloverIcon(rollOverQuitButton);
		mainMenu.add(btnQuit);
		
		mainMenu.add(background);

		return mainMenu;
	}
	
	private JPanel gamePanel() {
		JPanel singlePlayerPanel = new JPanel();
		singlePlayerPanel.setLayout(null);
		ImagePanel background = new ImagePanel(new ImageIcon("GUIImages\\GamePanelBackground.jpg").getImage());
		
		quitButton = new ImageIcon("GUIImages\\gamePanelQuitButton.png");
		rollOverQuitButton = new ImageIcon("GUIImages\\rollOverGamePanelQuitButton.png");
		btnQuit = new JButton(quitButton);
		btnQuit.setOpaque(false);
		btnQuit.setContentAreaFilled(false);
		btnQuit.setBorderPainted(false);
		btnQuit.setFocusPainted(false);
		btnQuit.setBounds(385, 480, 145, 105);
		btnQuit.setRolloverIcon(rollOverQuitButton);
		singlePlayerPanel.add(btnQuit);
		
		singlePlayerPanel.add(background);
		return singlePlayerPanel;
	}
	
	private JPanel scorePanel() {
		JPanel scorePanel = new JPanel();
		scorePanel.setLayout(null);
		ImagePanel background = new ImagePanel(new ImageIcon("GUIImages\\ScoreBoardView.png").getImage());
		
		scorePanel.add(background);
		
		return scorePanel;
	}

	public void SwitchFrames(PanelListener panelListener) {
		this.panelListener = panelListener;
	}

}