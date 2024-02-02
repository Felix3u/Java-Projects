class BridgeValue
{
    public static void main (String[] args)
    {
	char sen = 'y';
	String hand;
	boolean checkValid;
	while (sen == 'y')
	{
	    System.out.println ("Enter a String");
	    hand = In.getString ();
	    checkValid = Valid (hand);
	    while (checkValid == false)
	    {
		System.out.println ("That is not a valid hand");
		System.out.println ("Enter a String");
		hand = In.getString ();
		checkValid = Valid (hand);
	    }

	    char[] suits = Splitsuit (hand);
	    char[] ranks = Splitcard (hand);
	    int totalPoints = suitValue (suits) + cardValue (ranks);
	    printSortedCards (hand);
	    System.out.println ("Value:     " + totalPoints + " points");

	    System.out.println ("Do you wish to continue?(y/n): ");
	    sen = In.getChar ();
	}

    }


    public static void printSortedCards (String cards)  //sort and print the cards and values
    {
	char[] suits = Splitsuit (cards);
	char[] ranks = Splitcard (cards);

	char[] [] sortedCards = new char [4] [];
	for (int i = 0 ; i < 4 ; i++)
	{
	    sortedCards [i] = new char [0];
	}
	for (int i = 0 ; i < suits.length ; i++)
	{
	    int index;
	    switch (suits [i])
	    {
		case 'S':
		    index = 0;
		    break;
		case 'H':
		    index = 1;
		    break;
		case 'D':
		    index = 2;
		    break;
		case 'C':
		    index = 3;
		    break;
		default:
		    index = -1;
	    }
	    if (index >= 0)
	    {
		char[] newSuit = new char [sortedCards [index].length + 1];
		for (int j = 0 ; j < sortedCards [index].length ; j++)
		{
		    newSuit [j] = sortedCards [index] [j];
		}
		newSuit [newSuit.length - 1] = ranks [i];
		sortedCards [index] = newSuit;
	    }
	}

	for (int i = 0 ; i < 4 ; i++)
	{
	    char c;
	    switch (i)
	    {
		case 0:
		    c = 'S';
		    break;
		case 1:
		    c = 'H';
		    break;
		case 2:
		    c = 'D';
		    break;
		case 3:
		    c = 'C';
		    break;
		default:
		    c = ' ';
	    }
	    System.out.print (getSuitName (c) + " ");
	    char[] sorted = sort (suits, ranks, c, sortedCards [i].length);

	    for (int k = sorted.length - 1 ; k >= 0 ; k--)
	    {
		System.out.print (getFaceName (sorted [k]) + " ");
	    }
	    System.out.println ();
	}
    }


    public static char[] sort (char[] suits, char[] ranks, char suit, int length)  //sort the cards
    {
	char[] array = new char [length];
	int index = 0;
	for (int i = 0 ; i < suits.length ; i++)
	{
	    if (suits [i] == suit)
	    {
		array [index] = ranks [i];
		index++;
	    }
	}

	for (int i = 0 ; i < array.length ; i++)
	{
	    for (int j = i + 1 ; j < array.length ; j++)
	    {
		if (getRankValue (array [i]) > getRankValue (array [j]))
		{
		    char temp = array [i];
		    array [i] = array [j];
		    array [j] = temp;
		}
	    }
	}
	return array;
    }


    public static int getRankValue (char rank)
    {
	int value;
	switch (rank)
	{
	    case '2':
		value = 2;
		break;
	    case '3':
		value = 3;
		break;
	    case '4':
		value = 4;
		break;
	    case '5':
		value = 5;
		break;
	    case '6':
		value = 6;
		break;
	    case '7':
		value = 7;
		break;
	    case '8':
		value = 8;
		break;
	    case '9':
		value = 9;
		break;
	    case 'T':
		value = 10;
		break;
	    case 'J':
		value = 11;
		break;
	    case 'Q':
		value = 12;
		break;
	    case 'K':
		value = 13;
		break;
	    case 'A':
		value = 14;
		break;
	    default:
		value = 0;
	}
	return value;
    }


    public static String getSuitName (char c)
    {
	switch (c)
	{
	    case 'S':
		return "Spades:   ";
	    case 'H':
		return "Hearts:   ";
	    case 'D':
		return "Diamonds: ";
	    case 'C':
		return "Clubs:    ";
	    default:
		return "";
	}
    }


    public static String getFaceName (char c)
    {
	switch (c)
	{
	    case 'A':
		return "ace";
	    case 'K':
		return "king";
	    case 'Q':
		return "queen";
	    case 'J':
		return "jack";
	    case 'T':
		return "10";
	    default:
		return Character.toString (c);
	}
    }


    public static char[] Splitcard (String a)  //array for card values
    {
	char[] cardArray = new char [13];
	for (int i = 0, k = 0 ; i < a.length () ; i += 2, k++)
	    cardArray [k] = a.charAt (i);
	return cardArray;
    }


    public static char[] Splitsuit (String a)  //array for suit values
    {
	char[] suitArray = new char [13];
	for (int j = 1, k = 0 ; j < a.length () ; j += 2, k++)
	    suitArray [k] = a.charAt (j);
	return suitArray;
    }


    public static int suitValue (char[] a)  //method for points for suits
    {
	int points = 0;
	int[] suits = new int [4];
	for (int i = 0 ; i < a.length ; i++)
	{
	    if (a [i] == 'S')
		suits [0]++;
	    else if (a [i] == 'H')
		suits [1]++;
	    else if (a [i] == 'C')
		suits [2]++;
	    else if (a [i] == 'D')
		suits [3]++;
	}
	for (int i = 0 ; i < suits.length ; i++)
	{ //for loop for suits
	    if (suits [i] == 0)
		points += 3;
	    else if (suits [i] == 1)
		points += 2;
	    else if (suits [i] == 2)
		points += 1;
	    else
		points += 0;
	}
	return points;
    }

    public static int cardValue (char[] a)  //method for points for cards
    {
	int points = 0;
	for (int i = 0 ; i < a.length ; i++)
	{
	    if (a [i] == 'J')
		points++;
	    else if (a [i] == 'Q')
		points += 2;
	    else if (a [i] == 'K')
		points += 3;
	    else if (a [i] == 'A')
		points += 4;
	    else
		points += 0;
	}
	return points;
    }


    public static boolean Valid (String a)
    {
	boolean bool = true;
	if (a.length () != 26)
	    bool = false;
	for (int i = 0 ; i < a.length () ; i++)
	{
	    if (isValid (a.charAt (i)) == false)
		bool = false;
	}
	return bool;
    }


    public static boolean isValid (char a)
    {
	switch (a)
	{
	    case 'A':
	    case 'K':
	    case 'Q':
	    case 'J':
	    case 'T':
	    case '2':
	    case '3':
	    case '4':
	    case '5':
	    case '6':
	    case '7':
	    case '8':
	    case '9':
	    case 'S':
	    case 'H':
	    case 'D':
	    case 'C':
		return true;
	    default:
		return false;
	}
    }
}


