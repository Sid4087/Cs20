
public class Game {

	
	public static void main(String[] args) 
	{
		//Create instances (objects) from the GameCharacter
		GameCharacter player1 = new GameCharacter("Hero", 100);//Instance 1
		GameCharacter player2 = new GameCharacter("Villain", 85);//Instance 2
		
		player1.attack();//Behaviour-calls a method
		player2.takeDamage(20);
		
		System.out.println(player1.getStatus());
		System.out.println(player2.getStatus());

	}

}
