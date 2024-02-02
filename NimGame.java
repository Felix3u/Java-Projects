class NimGame
{
    public static void main (String[] args)
    {
	int playerOneWin = 0;
	int playerTwoWin = 0;
	int max = 8;
	int min = 4;
	int range = max - min + 1;
	int finish = 0;
	int winner = 0;
	int playerTurn = 0;

///Original Pile
	int randOne = (int) (Math.random () * range) + min;
	for (int i = randOne ; i > 0 ; i--)
	{System.out.print ("|");}
	System.out.println ("\tPile One has " + randOne + " sticks");
	int randTwo = (int) (Math.random () * range) + min;
	for (int i = randTwo ; i > 0 ; i--)
	{System.out.print ("|");}
	System.out.println ("\tPile Two has " + randTwo + " sticks");
	int randThree = (int) (Math.random () * range) + min;
	for (int i = randThree ; i > 0 ; i--)
	{System.out.print ("|");}
	System.out.println ("\tPile Three has " + randThree + " sticks");
	int randFour = (int) (Math.random () * range) + min;
	for (int i = randFour ; i > 0 ; i--)
	{System.out.print ("|");}
	System.out.println ("\tPile Four has " + randFour + " sticks");
	
///Assignment of variables
	int totalOne = randOne;
	int totalTwo = randTwo;
	int totalThree = randThree;
	int totalFour = randFour;
	int totalSticks = totalOne + totalTwo + totalThree + totalFour;
	int one = totalOne;
	int two = totalTwo;
	int three = totalThree;
	int four = totalFour;

	while (finish != 9999)
	{
	    while (totalSticks != 0)
	    {
	    ///Player One Turn
		System.out.println ("Player One's Turn: Which Pile do you want to pick from (1,2,3,4)? ")
		    ;
		int choice = In.getInt ();
		System.out.println ("How many sticks do you want to take? ");
		int stickTake = In.getInt ();
		if (choice == 1)
		    totalOne = randOne - stickTake;
		else if (choice == 2)
		    totalTwo = randTwo - stickTake;
		else if (choice == 3)
		    totalThree = randThree - stickTake;
		else if (choice == 4)
		    totalFour = randFour - stickTake;
		else
		{
		    System.out.println ("That is not a valid choice");
		    System.out.println ("Player One's Turn: Which Pile do you want to pick from (1,2,3,4)? ");
		    choice = In.getInt ();
		    System.out.println ("How many sticks do you want to take? ");
		    stickTake = In.getInt ();
		}

		for (int i = totalOne ; i > 0 ; i--)
		{
		    System.out.print ("|");
		}
		System.out.println ("\tPile One has " + totalOne + " sticks");
		for (int i = totalTwo ; i > 0 ; i--)
		{
		    System.out.print ("|");
		}
		System.out.println ("\tPile Two has " + totalTwo + " sticks");
		for (int i = totalThree ; i > 0 ; i--)
		{
		    System.out.print ("|");
		}
		System.out.println ("\tPile Three has " + totalThree + " sticks");
		for (int i = totalFour ; i > 0 ; i--)
		{
		    System.out.print ("|");
		}
		System.out.println ("\tPile Four has " + totalFour + " sticks");
		playerTurn++;
	one = totalOne;
	two = totalTwo;
	three = totalThree;
	four = totalFour;
		
///Player Two Turn
		System.out.println ("Player Two's Turn: Which Pile do you want to pick from (1,2,3,4)? ");
		choice = In.getInt ();
		System.out.println ("How many sticks do you want to take? ");
		stickTake = In.getInt ();

		if (choice == 1)
		    one = totalOne - stickTake;
		else if (choice == 2)
		    two = totalTwo - stickTake;
		else if (choice == 3)
		    three = totalThree - stickTake;
		else if (choice == 4)
		    four = totalFour - stickTake;
		else
		{
		    System.out.println ("That is not a valid choice");
		    System.out.println ("Player Two's Turn: Which Pile do you want to pick from (1,2,3,4)? ");
		    choice = In.getInt ();
		    System.out.println ("How many sticks do you want to take? ");
		    stickTake = In.getInt ();
		}

		for (int i = one ; i > 0 ; i--)
		{
		    System.out.print ("|");
		}
		System.out.println ("\tPile One has " + one + " sticks");

		for (int i = two ; i > 0 ; i--)
		{
		    System.out.print ("|");
		}
		System.out.println ("\tPile Two has " + two + " sticks");

		for (int i = three ; i > 0 ; i--)
		{
		    System.out.print ("|");
		}
		System.out.println ("\tPile Three has " + three + " sticks");

		for (int i = four ; i > 0 ; i--)
		{
		    System.out.print ("|");
		}
		System.out.println ("\tPile Four has " + four + " sticks");

		totalSticks = totalOne + totalTwo + totalThree + totalFour;
		playerTurn++;
	one = totalOne;
	two = totalTwo;
	three = totalThree;
	four = totalFour;
		
///Return Player One turn
		System.out.println ("Player One's Turn: Which Pile do you want to pick from (1,2,3,4)? ");
		choice = In.getInt ();
		System.out.println ("How many sticks do you want to take? ");
		stickTake = In.getInt ();

		if (choice == 1)
		    one = totalOne - stickTake;
		else if (choice == 2)
		    two = totalTwo - stickTake;
		else if (choice == 3)
		    three = totalThree - stickTake;
		else if (choice == 4)
		    four = totalFour - stickTake;
		else
		{
		    System.out.println ("That is not a valid choice");
		    System.out.println ("Player One's Turn: Which Pile do you want to pick from (1,2,3,4)? ");
		    choice = In.getInt ();
		    System.out.println ("How many sticks do you want to take? ");
		    stickTake = In.getInt ();
		}

		for (int i = one ; i > 0 ; i--)
		{
		    System.out.print ("|");
		}
		System.out.println ("\tPile One has " + one + " sticks");

		for (int i = two ; i > 0 ; i--)
		{
		    System.out.print ("|");
		}
		System.out.println ("\tPile Two has " + two + " sticks");

		for (int i = three ; i > 0 ; i--)
		{
		    System.out.print ("|");
		}
		System.out.println ("\tPile Three has " + three + " sticks");

		for (int i = four ; i > 0 ; i--)
		{
		    System.out.print ("|");
		}
		System.out.println ("\tPile Four has " + four + " sticks");

		totalSticks = totalOne + totalTwo + totalThree + totalFour;
		playerTurn++;
	one = totalOne;
	two = totalTwo;
	three = totalThree;
	four = totalFour;

	    }
	    if (playerTurn % 2 == 1)
		playerOneWin++;
	    else
		playerTwoWin++;

	    if (playerOneWin > playerTwoWin)
		winner = 1;
	    else
		winner = 2;

	    System.out.println ("Player " + winner + " Wins")
		;
	    System.out.println ("Enter any number to continue(9999 to finish)");
	    finish = In.getInt ();
	}


System.out.println ("THANK YOU FOR PLAYING NIM");
System.out.println ("PLAYER ONE WON: " + playerOneWin + " MANY TIMES");
System.out.println ("PLAYER Two WON: " + playerTwoWin + " MANY TIMES");
    }
}


