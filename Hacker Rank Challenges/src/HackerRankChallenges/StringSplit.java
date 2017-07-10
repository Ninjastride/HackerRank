package HackerRankChallenges;


import java.io.*;
import java.util.*;

/*
 * Given a string, s , matching the regular expression 
 * [A-Za-z !,?._'@]+, split the string into tokens. 
 * We define a token to be one or more consecutive English alphabetic letters. 
 * Then, print the number of tokens, followed by each token on a new line.
 */

public class StringSplit {

	public static void stringSplit(String s)
	{
        if(s.length() > (400000) || s.length() < 0) 
        {
            return;
        }
        
        //s = s.trim(); // having an issue here where I'm not getting the returned string trimmed of white-space
        				// so I put it in the system.out.println(string.trim()) on line 39.
        
        if(s.length() == 0) // if length is zero --> print 0 (delimeters)
        {
            System.out.print(0);
			return;
		}
        
		String delims = "[ .,?'!-@_]+";
        
		String[] tokens = s.split(delims); // store tokens in an array
	    System.out.println(tokens.length); // print them out to console
	    
	   
	    for(String string: s.split(delims)) 
	    {
	    	System.out.println(string.trim());   // display string as desired -->without delimeters specified & leading white-space
	    }
	}
	
	public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        //String s = scan.nextLine();
	        String s = "he is a \tvery very good boy, isn't he?";
	        stringSplit(s);
	        scan.close();
	    }
	

}
