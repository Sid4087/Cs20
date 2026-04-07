package Skillbuilders;

public class Coin 
{
	public int faceUp;
	
	public Coin()
	{
		faceUp = (int)(Math.random() * 2); 
	}
	
	public void flipCoin()
	{
		faceUp = (int)(Math.random() * 2);
	}
	
	public String toString()
	{
		if (faceUp == 0)
		{
			return "The coin is faceup.";
		}
		
		else
		{
			return "The coin is facedown.";
		}
	}

	
		
		
	}

