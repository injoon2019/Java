package dynamic_beat_1;

import javax.swing.JFrame;	//GUI Library

public class DynamicBeat extends JFrame {
	
	public DynamicBeat() {
		setTitle("Dynamic Beat");
		setSize(Main.SCREEN_HEIGHT, Main.SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);	//to put screen center of monitor
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//if finish the game, the program will also be finished
		setVisible(true);
	}

}
