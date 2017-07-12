package hackerRankChallenges_DataStructures;

/*
 * Input Format

	The first line contains a single integer, n , denoting the length of array. 
	The second line contains space-separated integers describing each respective element.
	(Enter n elements)
	
 * 	Sample Input
		5
		1 -2 4 -5 1
	
	Sample Output
		9 <-- (negative subarrays)
 */

import java.util.*;

public class JavaSubArray {
	
	private int SIZE;
	private int[] A;
	
	public JavaSubArray(int size)
	{	
		SIZE = size;
		A = new int[SIZE];
	}
	
	public int getSize()
	{
		return SIZE;
	}
	public int getElement(int x)
	{
		return A[x];
	}
	public void display()
	{
		for(int i = 0;i<A.length;i++)
		{
			System.out.print(A[i] + " ");
		}System.out.println("");
	}
	public void insert(int index,int value)
	{
		A[index] = value;
	}
	public static void main(String[] args)
	{
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        
		JavaSubArray A = new JavaSubArray(n);

        for(int i = 0;i<n;i++)
        {
            int value = keyboard.nextInt();
            A.insert(i,value);
        }
        
        keyboard.close();
        
		int count = 0;
	    // i is the start index
	    for (int i = 0; i < A.getSize(); i++)
	    {
	        // j is the number of elements which should be printed
	        for (int j = i; j < A.getSize(); j++)
	        {
	        	int sum = 0;
	            
	        	// print the array from i to j
	            for (int k = i; k <= j; k++)
	            {
	            	sum += A.getElement(k);
	            }
	            
	            if(sum < 0)
	            {
	            	 count++;
	            }
	        } 	
	    }
	    System.out.println(count);
}
}



