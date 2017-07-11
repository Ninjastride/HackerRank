package HackerRankChallenges;
import java.util.*;

public class SmallestLargestSubstring {
  
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0,k);
       
        // Complete the function
       
        for(int i = 1;i<s.length();i++)
        {
        	 // 'smallest' must be the lexicographically smallest substring of length 'k'
        		
        	if(i > s.length()-k)	{	break;	} // makes sure to not go out of bounds
        	
        	String temp = s.substring(i,i+k);	 // generates the next substring to be compared with smallest
        	
        	if(temp.compareTo(smallest) < 0)
        	{
        		smallest = temp;
        	}
        	
        	// 'largest' must be the lexicographically largest substring of length 'k'
        	if(temp.compareTo(largest) > 0)
        	{
        		largest = temp;
        	}
        	
        }
        
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}