package hackerRankChallenges;

/*
 * Given a string of text in a tag-based language, 
 * parse this text and retrieve the contents enclosed 
 * within sequences of well-organized tags meeting the following criterion:

	1	The name of the start and end tags must be same. 
		The HTML code <h1>Hello World</h2> is not valid, 
		because the text starts with an h1 tag and ends with a non-matching h2 tag.
	
	2	Tags can be nested, but content between nested tags is considered not valid. 
		For example, in <h1><a>contents</a>invalid</h1>, 
		contents is valid but invalid is not valid.
	
	3	Tags can consist of any printable characters.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TagContentExtractor{
   
	
	public static void main(String[] args){
      
      Scanner keyboard = new Scanner(System.in);
      int testCases = Integer.parseInt(keyboard.nextLine());
      
      for(int i = 0;i<testCases;i++)
      {
    	  String input = keyboard.nextLine();
    	  Pattern p = Pattern.compile("<(.+)>([^<]+)</\\1>");
    	  Matcher m = p.matcher(input);
    	  boolean match = false;
    	  
    	  while(m.find())
    	  {
    		  match = true;						// content tags matched!
    		  System.out.println(m.group(2));	// display them
    		  
    		  
    		  if(!match)
    		  {
    			  System.out.println("None");  	// content tags did not match!
    		  }
    	  }
      }
      keyboard.close();
   }
}