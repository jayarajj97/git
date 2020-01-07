package com.l7.core.redex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class EamilId {
	  static boolean check(String emailId) {
	      String chk = "[A-Za-z0-9._]+[@][A-Za-z]+[.]com";
	      return Pattern.matches(chk,emailId);
	   }

	   public static void main(String[] args) {
		   Scanner k=new Scanner(System.in);
	      String emailId = k.nextLine();
	      k.close();
	      if(check(emailId)) {
	      System.out.println("Valid");
	   } 
	      else System.out.println("Not Valid");
	      
	      Pattern emailPattern=Pattern.compile("\\S+@\\S+.com");
		   Matcher emailMatcher=emailPattern.matcher("My email is" +emailId+ " Iam sure anout my email helo.sini@gmail.com.");
			while(emailMatcher.find()){
				System.out.println("I found an email "+emailMatcher.group()+"Starting at index "+emailMatcher.start()+" and ending at index "+emailMatcher.end());
			}
	      
	      }
	   
	   
	   
	  
		
}
