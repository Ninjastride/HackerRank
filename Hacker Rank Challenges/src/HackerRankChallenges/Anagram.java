package HackerRankChallenges;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram	{
	
	public static boolean isAnagram(String a, String b) {
    
	// checks to see if strings are empty or null
		if( a == null || b == null || a.equals("") || b.equals("") )
		    throw new IllegalArgumentException("Please check input!");
	
	// checks to see if strings are of equal length
    if(a.length() != b.length())
        return false;
    
    // convert strings to lower-case
    a = a.toLowerCase();
    b = b.toLowerCase();
    
    // create a map/hashtable for string b
    // Map the character and frequency of multiple occurances
    Map<Character,Integer> map = new HashMap<>();
    
    for(int i = 0;i<b.length();i++)
    {
        char c = b.charAt(i);
        
        if(!map.containsKey(c)) // if key doesn't exist in map, insert it
        {
            map.put(c,1);
        }else                   // if key exist, increment frequency
        {
            Integer frequency = map.get(c);
            map.put(c,++frequency);
        }
    }
    
    // Test each character of string a against the map of string b's hashtable
    for(int i = 0;i<a.length();i++)
    {
        char c = a.charAt(i);
        
        if(!map.containsKey(c)) // if key doesn't exist in map --> is not anagram
        {
            return false;
        }
        
        Integer frequency = map.get(c);
        
        if(frequency == 0) // if this character occurance is 0 --> no matching character in other string
        {
            return false;
        }else
        {
            map.put(c,--frequency);
        }
    }
    return true; // all character matched and have equal frequency of occurances
}
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String a = scan.nextLine();
	        String b = scan.nextLine();
	        scan.close();
	      
	        System.out.println(isAnagram(a,b));
	    }
}
