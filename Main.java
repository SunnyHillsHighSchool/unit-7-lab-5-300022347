//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Main
{
	public static void main( String args[] )
	{
		int[] r = { 5, 12, 9, 6, 1, 4, 7, 6};
		NumberAnalyzer test = new NumberAnalyzer( r );
		out.println(test);
    
		out.println("odd count = "+test.countOdds());
    
		out.println("even count = "+test.countEvens());
    
		out.println("perfect count = "+test.countPerfects()+"\n\n\n");
    
		//add more test cases			
	}
}