public class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

	private String suit;
	private int face;

  	//constructors
	public Card()
	{
		face = 0;
		suit = "";
	}

	public Card(String s, int f)
	{
		face = f;
		suit = s;
	}

	// modifiers
	public void changeSuit(String s)
	{
		suit = s;
	}

	public void changeFace(int f)
	{
		face = f;
	}

  	//accessors
	public String getSuit()
	{
		return suit;
	}

  	public int getValue()
  	{
		String fac  = FACES[face];
  		return face;
  	}

	public boolean equals(Card obj)
	{
		if(obj.getValue() == face && obj.getSuit().equals(suit))
		{
			return true;
		}
		else{
			return false;
		}
	}

  	//toString
	public String toString()
	{
		return (FACES[face] + " of " + getSuit() + " | value = " + getValue());
	}
  	
 }
