

public class PlayerTest {
	public static void main(String[] args) throws RankOutOfBoundsException {
		
		
//		Player p1 = new Player();
		Pool pool = new Pool();	//may need to declare pool in Frame class instead, for refilling the frame
//		
//		//p1.setName(playerName);
//		p1.displayScore();
//		p1.displayName();
//		p1.newframe.refill(pool);
//		p1.displayFrame();
//		
		Player p2 = new Player();
		
		p2.displayScore();
		p2.displayName();
		p2.newframe.refill(pool);
		p2.displayFrame();

		/**
		 * new error: Search and removeTile
		 */
		p2.search('A');
		p2.removeTile(3);
		p2.displayFrame();
	}
}