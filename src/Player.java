import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Player extends Frame{

	private int score;
	private String name;
	Frame newframe = new Frame();


	/* Constructor Methods */
	public Player(){
		score = 0; 
		setName();
	}
	
	

	/* Allows the player data to be reset */
	public void playerReset(){
		score = 0;
	}

	/* Allows the name of the player to be set */
	public void setName(){
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("\nPlease enter your name: ");
			if (br!=null) {
				name = br.readLine();
			}	
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	/* Allows the players score to be increased */
	public void increaseScore(int scoreIncrease) {
		score = score + scoreIncrease;
	}

	/* Allows access to their score */
	public int displayScore() {
		System.out.println("\n"+score);
		return score;
	}

	/* Allows access to a players frame (tiles) */
	public void displayFrame() {
		newframe.displayFrame();
	}

	/* Allows display of a players name */
	public String displayName() {
		System.out.println(name);
		return name;
	}
}
