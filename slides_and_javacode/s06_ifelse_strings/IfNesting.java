package s06_ifelse_strings;

// A+ Computer Science
// www.apluscompsci.com

//nested if statement example

public class IfNesting
{
	public static void main(String args[])
	{
		int num=1;		//change the value of num and rerun the program
		if(num>2) 
		{
		   if(num<10)
		      System.out.println(">2<10");
		}
		else
		{
		   System.out.println("<2");
		}

	}
}

