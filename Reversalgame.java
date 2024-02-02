//Felix Wu
class Reversalgame
{
    public static void main (String[] args)
    {
	int score = 0;
	int choice = 2;
	int[] changed = new int [10];
	int[] mainArray = new int [10];
	mainArray = makeSequence ();
	changed = (int[]) mainArray.clone ();

	int[] checkArray = new int [10]; //check array
	for (int i = 0 ; i < 10 ; i++)
	    checkArray [i] = i;

	System.out.println ("Welcome to Reversal Game! The objective of the game is for the player to put all \nthe digits in ascending order using as small a number of reversals as possible. \nAn example of a reversal would be (1 2 3) reversing by n = 3, would be (3 2 1): \nYour sequence this game is: ");

	for (int i = 0 ; i < 10 ; i++)
	    System.out.print (mainArray [i] + " ");
	System.out.println ();
	while (choice != 3)
	{
	    System.out.println ("How many numbers do you want reversed?(n):");
	    int n = In.getInt ();
	    while (n > 10 || n < 0)
	    {
		System.out.println ("That is not a valid number");
		System.out.println ("How many numbers do you want reversed?(n):");
		n = In.getInt ();
	    }
	    changed = reverse (changed, n);
	    score++;
	    for (int i = 0 ; i < 10 ; i++)
	    {
		System.out.print (changed [i] + " ");
	    }
	    System.out.println ();

	    if (isComplete (changed) == true)
	    {
		System.out.println ("You have completed the game! Turns Taken: " + score + ".");
		System.out.println ("Enter 1 to Play with the same sequence");
		System.out.println ("Enter 2 to Play with a different sequence");
		System.out.println ("Enter 3 end");
		choice = In.getInt ();
		score = 0;
		if (choice == 1)
		{
		    changed = (int[]) mainArray.clone (); // set the sequence to the original sequence
		    for (int i = 0 ; i < 10 ; i++)
		    {
			System.out.print (changed [i] + " ");
		    }
		    System.out.println ();
		}
		else if (choice == 2)
		{
		    int[] newArray = new int [10];
		    newArray = makeSequence ();
		    changed = newArray;
		    for (int i = 0 ; i < 10 ; i++)
		    {
			System.out.print (changed [i] + " ");
		    }
		    System.out.println ();
		}

	    }
	}
    }


    public static int[] makeSequence ()
    {
	boolean[] repeated = new boolean [10];
	int sequence;
	int[] array = new int [10];


	for (int i = 0 ; i < 10 ; i++)
	    repeated [i] = false;

	for (int i = 0 ; i < 10 ; i++) //for nums 0-9
	{
	    sequence = (int) (10 * Math.random ());

	    if (repeated [sequence] == false) //if it isn't repeated
	    {
		array [i] = sequence;
		repeated [sequence] = true;
	    }
	    else
	    {
		while (repeated [sequence]) //if repeated
		{
		    sequence = (int) (10 * Math.random ());
		}
		array [i] = sequence;
		repeated [sequence] = true;
	    }
	}
	return array;
    }


    public static int[] reverse (int[] a, int n)
    {
	for (int i = 0 ; i < n / 2 ; i++)
	{
	    int swtich = a [i];
	    a [i] = a [n - i - 1];
	    a [n - i - 1] = swtich;
	}
	return a;
    }


    public static boolean isComplete (int[] a)
    {
	boolean complete = false;
	for (int i = 0 ; i < 10 ; i++)
	{
	    if (a [i] == i)
		complete = true;
	    else
		complete = false;
	}
	return complete;
    }
}
