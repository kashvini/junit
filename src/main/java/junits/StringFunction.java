package junits;

public class StringFunction {

public static boolean isPlaindrome(String str) {
        
        // Pointers pointing to the beginning 
       // and the end of the string 
       int i = 0, j = str.length() - 1; 
 
       // While there are characters toc compare 
       while (i < j) { 
 
           // If there is a mismatch 
           if (str.charAt(i) != str.charAt(j)) 
               return false; 
           if(i>j) {
        	  System.out.println("dead");
           }
 
           // Increment first pointer and 
           // decrement the other 
           i++; 
           j--; 
       } 
 
       // Given string is a palindrome 
       return true; 
       
       
   }

}

