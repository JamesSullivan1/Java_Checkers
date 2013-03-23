package userInterface.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * 
 * @author Daniel
 *
 * Creates a main menu for the GUI. <Currently not implemented>
 */
public class MainMenu extends JPanel implements ActionListener {

	private JButton btnSinglePlayer, btnMultiPlayer, btnScoreBoard, btnQuit;
	private ImagePanel background;
	private ImageIcon singlePlayerButton, rollOverSinglePlayerButton,
			multiPlayerButton, scoreBoardButton, rollOverScoreBoardButton,
			rollOverMultiPlayerButton, quitButton, rollOverQuitButton;

	/**
	 * Mutator
	 * 
	 * Constructs the view for the main menu.
	 */
	public MainMenu() {
		setLayout(null);
		background = new ImagePanel(new ImageIcon(
				"GUIImages\\Other\\newBackground.png").getImage());

		singlePlayerButton = new ImageIcon("GUIImages\\Buttons\\singlePlayerButton.png");
		rollOverSinglePlayerButton = new ImageIcon(
				"GUIImages\\Buttons\\rollOverSinlgePlayerButton.png");
		btnSinglePlayer = new JButton(singlePlayerButton);
		btnSinglePlayer.setOpaque(false);
		btnSinglePlayer.setContentAreaFilled(false);
		btnSinglePlayer.setBorderPainted(false);
		btnSinglePlayer.setFocusPainted(false);
		btnSinglePlayer.setBounds(320, 25, 275, 130);
		btnSinglePlayer.setRolloverIcon(rollOverSinglePlayerButton);
		btnSinglePlayer.addActionListener(this);
		add(btnSinglePlayer);

		multiPlayerButton = new ImageIcon("GUIImages\\Buttons\\multiPlayerButton.png");
		rollOverMultiPlayerButton = new ImageIcon(
				"GUIImages\\Buttons\\rollOverMultiPlayerButton.png");
		btnMultiPlayer = new JButton(multiPlayerButton);
		btnMultiPlayer.setOpaque(false);
		btnMultiPlayer.setContentAreaFilled(false);
		btnMultiPlayer.setBorderPainted(false);
		btnMultiPlayer.setFocusPainted(false);
		btnMultiPlayer.setBounds(320, 170, 275, 130);
		btnMultiPlayer.setRolloverIcon(rollOverMultiPlayerButton);
		btnMultiPlayer.addActionListener(this);
		add(btnMultiPlayer);

		scoreBoardButton = new ImageIcon("GUIImages\\Buttons\\scoreBoardButton.png");
		rollOverScoreBoardButton = new ImageIcon(
				"GUIImages\\Buttons\\rollOverScoreBoardButton.png");
		btnScoreBoard = new JButton(scoreBoardButton);
		btnScoreBoard.setOpaque(false);
		btnScoreBoard.setContentAreaFilled(false);
		btnScoreBoard.setBorderPainted(false);
		btnScoreBoard.setFocusPainted(false);
		btnScoreBoard.setBounds(13, 380, 225, 73);
		btnScoreBoard.setRolloverIcon(rollOverScoreBoardButton);
		btnScoreBoard.addActionListener(this);
		add(btnScoreBoard);

		quitButton = new ImageIcon("GUIImages\\Buttons\\quitButton.png");
		rollOverQuitButton = new ImageIcon("GUIImages\\rollOverQuitButton.png");
		btnQuit = new JButton(quitButton);
		btnQuit.setOpaque(false);
		btnQuit.setContentAreaFilled(false);
		btnQuit.setBorderPainted(false);
		btnQuit.setFocusPainted(false);
		btnQuit.setBounds(45, 460, 120, 85);
		btnQuit.setRolloverIcon(rollOverQuitButton);
		btnQuit.addActionListener(this);
		add(btnQuit);

		add(background);

	}

	public void actionPerformed(ActionEvent e) {
		//JButton source = (JButton)e.getSource();
		
	}

}
