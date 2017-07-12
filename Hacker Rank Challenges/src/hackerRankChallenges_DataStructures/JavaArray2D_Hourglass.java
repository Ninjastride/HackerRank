package hackerRankChallenges_DataStructures;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


/*
 * 	purpose of this is to target the section that we will disect the hourglass from.
 *  Our starting point is [2][2]
 *  
 *  	int sum =	arr[0][0] + arr[0][1] + arr[0][2] 
							
							  + arr[1][1] 
				
				  + arr[2][0] + arr[2][1] + arr[2][2];
				  
	Showing this specific example of when we target our first hourglass, you can see
	that we can access any index of this hourglass when we reach [2][2].
	That is why the if condition will start peforming the sum when i>1 && j>1 which will
	be when we iterate the i loop to 2 and then the inner j loop to 2.
	
	To get all hour glasses components and sums, we have to do some simple math with the reference of
	our example above and now it's possible to allow the double forLoop() to the rest of the work for us.
	
		CURRENTLY I = 2 AND J = 2
		
					arr[i-2][j-2] + arr[i-2][j-1] + arr[i-2][j] 
							
							  + arr[i-1][j-1] 
				
				  + arr[i][j-2] + arr[i][j-1] + arr[i][j]; <--- this is where we found our first hourglass
				  
				  							From here we do some math knowing that i and j are equal to 2.
				  							Compare this now to the one above and you will see that they are both the same
				  
	To take back from this, is to realize that it's important to work on a small example test case and understanding the logic.
		This can save a lot of time and will produce more results. If you start to create loops and pray for a miracle from
		the Java gods... you might get a little frustrated lol.
 *  
 */
public class JavaArray2D_Hourglass {

	static int a[][] = new int[6][6];
	
	public static void display()
	{
		for(int i = 0;i<a.length;i++)
		{
			for(int j = 0;j<a.length;j++)
			{
				 System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}
			
	}
	public static void insert(int row,int col, int value)
	{
		a[row][col] = value;
	}
    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
    	
    	int maxSum = Integer.MIN_VALUE;  // Initializing to this will help with the negative sum test cases.
    	
    		insert(0,0,1);
    		insert(0,1,1);
    		insert(0,2,1);
    		insert(1,1,1);
    		insert(2,0,1);
    		insert(2,1,1);
    		insert(2,2,1);
    		insert(3,2,2);
    		insert(3,3,4);
    		insert(3,4,4);
    		insert(4,3,2);
    		insert(5,2,1);
    		insert(5,3,2);
    		insert(5,4,4);
    		
        for(int i=0; i < a.length; i++){
            for(int j=0; j < a.length; j++){

            	if(i>1 && j>1)
            	{	//sum of hourglass
            		int sum = 	  a[i-2][j-2] 
            					+ a[i-2][j-1] 
            					+ a[i-2][j] 
            					+ a[i-1][j-1] 
            					+ a[i][j-2] 
            					+ a[i][j-1] 
            					+ a[i][j];
	            		
	            		if(sum > maxSum)
	            			maxSum = sum;
            	}
            }
        }
        System.out.println("MaxSum of all hourglasses: " + maxSum);	
        display();
    }
}