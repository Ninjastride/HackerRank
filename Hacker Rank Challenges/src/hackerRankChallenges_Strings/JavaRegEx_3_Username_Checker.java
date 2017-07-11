package hackerRankChallenges;

/*
 * Regular expressions (regex) help us match or search for patterns in strings. 
 * In this problem, you will be given a username. 
 * Your task is to check whether that username is valid. 
 * A valid username will have the following properties:
	
	1 - The username can contain alphanumeric characters and/or underscores(_).
	2 - The username must start with an alphabetic character.
	3 - 8 <= |Username| <=30.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaRegEx_3_Username_Checker {

	public static void main(String[] args){
	      Scanner in = new Scanner(System.in);
	      int testCases = Integer.parseInt(in.nextLine());
	      while(testCases>0){
	         String username = in.nextLine();
	         
	         String pattern = "^[A-Za-z]{1}\\w{7,29}$";
	         
	         
	         Pattern r = Pattern.compile(pattern);
	         Matcher m = r.matcher(username);
	          
	         if (m.find( )) {
	            System.out.println("Valid");
	         } else {
	            System.out.println("Invalid");
	         }
	         testCases--;
	      }
	   }
	}
