import java.util.ArrayList;

public class Frame {
	
	private int Capacity = 7;	//frame max size (7)
	
	//ArrayList frame contains tile objects, passed from Pool class 
	public ArrayList<Tiles> frame = new ArrayList<Tiles>();
	
	//returns 1 the if the frame is empty, 0 otherwise 
	public boolean isEmpty(){
		return (frame.size()==0);
	}
	
	//takes in
	public void refill(Pool pool) throws RankOutOfBoundsException{
		
		while (frame.size() < Capacity){
			if (frame.size() > Capacity){
				throw new RankOutOfBoundsException();
			}
			
			else if (frame.size() == Capacity){
				System.out.println("Your frame is full");
			}
			
			else {
				frame.add(pool.getTile());			
			}
		}
	}
	
	public void removeTile(int positionOfRemoval) throws RankOutOfBoundsException{
		
		if (frame.size() < 0){
			throw new RankOutOfBoundsException();
		}
		
		else if (frame.size() == 0){
			System.out.println("Your frame is already empty");
		}
		
		else{
			
			if (positionOfRemoval < frame.size()){
				frame.remove(positionOfRemoval);
			}
			
			else{
				throw new RankOutOfBoundsException();
			}
		}
		
	}
	//searches each position from first to last for the user-entered character
	public void search(char userTile){
		
		int exists = 0;
		
		for (int position = 0; position < frame.size(); position++ ){
			
			if 	(userTile == frame.get(position).tile){
				System.out.println("\nYour tile is located in position " + (position+1));
				exists++;	//if the tile exists it is indicated by this variable
			}
		}
		
		//if the tile does not exits
		if (exists == 0){
			System.out.println("\nYour tile could not be found");
		}
	}
	
	//Displays the contents of the current frame
	public void displayFrame(){
		for (int n=0; n<frame.size(); n++ ) {
			System.out.print(frame.get(n).tile + " ");
		}
	}
}