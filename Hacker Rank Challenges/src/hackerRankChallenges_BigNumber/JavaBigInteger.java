package hackerRankChallenges_BigNumber;
/*
 * In this problem, you have to add and multiply huge numbers! 
 * These numbers are so big that you can't contain them in any ordinary data types like a long integer.
 * Use the power of Java's BigInteger class and solve this problem.
  
  	Input Format

	There will be two lines containing two numbers, a and b.
	Constraints a and b are non-negative integers and can have maximum 200 digits.

	Output Format

	Output two lines. The first line should contain (a + b), 
	and the second line should contain (a x b) . Don't print any leading zeros.

	Sample Input
	
	1234
	20
	
	Sample Output
	
	1254
	24680
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaBigInteger {

    public static void main(String[] args) throws IOException {
        
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	String a = bf.readLine();
    	String b = bf.readLine();
    	
    	addThenMultiply(a,b);
    }
    
    static void addThenMultiply(String a, String b)
    {
    	BigInteger sum =  new BigInteger(a).add(new BigInteger(b));
    	BigInteger mul =  new BigInteger(a).multiply(new BigInteger(b));

		System.out.println(sum);
		System.out.println(mul);
    }
}