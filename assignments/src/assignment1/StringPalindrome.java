//32. Program to check whether the given Strings are Palindrome or not. a) Java b) Malayalam

package assignment1;

public class StringPalindrome {

	public static void main(String[] args) {
		String org1 = "Java";
		String org2 = "Malayalam";

		// String reversal using charAt() method and checking palindrome
		/*
		  
		  int n=0; 
		  char revv1[]=new char[org1.length()]; 
		  for(int i=org1.length()-1;i>=0;i--){ 
		  revv1[n]=org1.charAt(i); n++; 
		  }
		  revv1.toString();
		  System.out.println(revv1);
		  if(org1.equalsIgnoreCase(revv1.toString())) {
		      System.out.println(org1+" is palindrome"); 
		  }
		  else
		   {  
		      System.out.println(org1 +" is not palindrome");
		    }
	  
		 */

		// String reversal using string buffer reverse() function
		StringBuffer str1 = new StringBuffer("Java");
		StringBuffer str2 = new StringBuffer("Malayalam");
		str1.reverse();
		str2.reverse();
		String rev1 = str1.toString();
		String rev2 = str2.toString();

		if (org1.equalsIgnoreCase(rev1)) {
			System.out.println(org1 + " is palindrome");
		} else {
			System.out.println(org1 + " is not palindrome");
		}
		if (org2.equalsIgnoreCase(rev2)) {
			System.out.println(org2 + " is palindrome");
		} else {
			System.out.println(org2 + " is not palindrome");
		}

	}

}
