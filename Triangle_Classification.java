class Triangle_Classification
{
    public static void main (String[] args)
    {
	int sides = 1;
	while (sides != 000)
	{

	    int assignVar = 0;
	    int sum = 0;
	    boolean tri;

	    //Ask the user for side lengths
	    System.out.println ("Enter three side lengths(ex. 123) - 000 to terminate.");
	    sides = In.getInt ();
	    //Find side lengths with module
	    int SideThree = sides % 10;
	    int SideTwo = (sides % 100) / 10;
	    int SideOne = (sides % 1000) / 100;

	    //If statement for termination or error
	    if (sides == 000)
	    {
		System.out.print ("Program was terminated by user.");
		break;
	    }
	    if (sides < 0)
	    {
		System.out.print ("Error, invalid sides.");
		break;
	    }

	    //Assigning If a triangle is possible or not
	    if (SideOne + SideTwo > SideThree && SideOne < SideTwo + SideThree && SideOne + SideThree > SideTwo)
	    {
		tri = true;
		if (SideOne == SideTwo && SideTwo == SideThree)
		    System.out.print ("Triangle possible: equilateral and ");

		else if (SideOne == SideTwo || SideTwo == SideThree || SideOne == SideThree)
		    System.out.print ("Triangle possible: isosceles and ");

		else if (SideOne != SideTwo && SideTwo != SideThree && SideOne != SideThree)
		    System.out.print ("Triangle possible: scalene and ");
	    }
	    else
	    {
		tri = false;
		System.out.print ("Triangle not possible");
	    }

	    //Equations
	    if (SideTwo > SideThree && SideTwo > SideOne)

		{
		    assignVar = SideThree;
		    SideThree = SideTwo;
		    SideTwo = assignVar;
		}

	    else if (SideOne > SideThree && SideOne > SideTwo)
	    {
		assignVar = SideThree;
		SideThree = SideOne;
		SideOne = assignVar;
	    }

	    sum = (SideOne * SideOne) + (SideTwo * SideTwo);
	    
	    //Print what angle it is
	    if (tri)
	    {
		if (sum == SideThree * SideThree)
		    System.out.print ("right.");
		else if (sum > SideThree * SideThree)
		    System.out.print ("acute.");
		else if (sum < SideThree * SideThree)
		    System.out.print ("obtuse.");
	    }


	    System.out.println ();
	}
    }
}
