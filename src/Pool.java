import java.util.ArrayList; import java.util.Collections; import java.util.Random;

public class Pool {
	
//Arraylist taking in Tiles class so each element in ArrayList will contain both letter and point
	ArrayList<Tiles> pool = new ArrayList<Tiles>();
	
//Constructor initialising the pool with all the letters in the game
	public Pool(){
		
		for(int i = 0; i < 12; i++)
		{
			pool.add(new Tiles('E', 1));
		}
		
		for(int i = 0; i < 9; i++)
		{
			pool.add(new Tiles('A', 1));
			pool.add(new Tiles('I', 1));
		}
		
		for(int i = 0; i < 8; i++)
		{
			pool.add(new Tiles('O', 1));
		}
		
		for(int i = 0; i < 6; i++)
		{
			pool.add(new Tiles('R', 1));
			pool.add(new Tiles('N', 1));
			pool.add(new Tiles('T', 1));
		}
		
		for(int i = 0; i < 4; i++)
		{
			pool.add(new Tiles('L', 1));
			pool.add(new Tiles('S', 1));
			pool.add(new Tiles('U', 1));
			pool.add(new Tiles('D', 2));
		}
		
		for(int i = 0; i < 3; i++)
		{
			pool.add(new Tiles('G', 2));
		}
		
		for(int i = 0; i < 2; i++)
		{
			pool.add(new Tiles('B', 3));
			pool.add(new Tiles('C', 3));
			pool.add(new Tiles('M', 3));
			pool.add(new Tiles('P', 3));
			pool.add(new Tiles('F', 4));
			pool.add(new Tiles('H', 4));
			pool.add(new Tiles('V', 4));
			pool.add(new Tiles('W', 4));
			pool.add(new Tiles('Y', 4));
			pool.add(new Tiles(' ', 0));
		}
		
		pool.add(new Tiles('K', 5));
		pool.add(new Tiles('J', 8));
		pool.add(new Tiles('X', 8));
		pool.add(new Tiles('Q', 10));
		pool.add(new Tiles('Z', 10));
		
		Collections.shuffle(pool, new Random(System.nanoTime())); 
		//Randomly shuffles the deck so its not all in alphabetical order
		
	}
	
//Display the number of tiles remaining in the pool
	public int remainingTiles(){
		return pool.size();
	}
	
//Randomly select a tile
	public Tiles getTile(){
		Random rnd = new Random();
		int rand = rnd.nextInt(pool.size()); //Randomly selects a tile
		Tiles tile = new Tiles(pool.get(rand).tile, pool.get(rand).point); //creates a new tile to return to main statement
		pool.remove(pool.get(rand)); //removes the tile from the pool
		return tile;
	}
	
	
//Check if the pool is empty
	public boolean isEmpty(){
		return pool.size() == 0;
	}
	
//Query the value of a tile
	public int tileValue(Tiles tile){
		return tile.point;
	}
	
	public void toString(Tiles tile){
		System.out.println("" + tile.tile + " " + tile.point);
	}
}
