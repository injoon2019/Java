package dynamic_beat2_1;

import javax.swing.JFrame;


public class DynamicBeat extends JFrame{

	public DynamicBeat() {
		setTitle("Dynamic Beat");	//title of game
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);	//put the screen center of monitor
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//close program when the program is finished
		setVisible(true);		//make the screen I made visible
		
	}
	
}