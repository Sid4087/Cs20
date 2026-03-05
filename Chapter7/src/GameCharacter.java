public class GameCharacter 
{
	//Instance variables
	private String name;
	private int health;
	
	//Constructor method
	//public means method can be called from anywhere
	public GameCharacter(String charName, int starHealth) 
	{
		name = charName;
		health = starHealth;
	}
	//Behaviour: actions the character can do
	public void attack()
	{
		System.out.println(name + "Attacks! Deals 10 damages.");
	}

	public void takeDamage(int damage)
	{
		health = health - damage;
		
		if(health < 0)
			health = 0;
		System.out.println(name + "'s health is now " + health);
	}
	
	public String getStatus()
	{
		return name + " has " + health + " health.";
	}
}
