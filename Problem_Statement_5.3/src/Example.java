import java.util.Scanner;

public class Example {

	
		 // Print all the rotated string.
	    static void printRotatedString(String str)
	    {
	        int len = str.length();
	      
	        // Generate all rotations one by one and print
	        StringBuffer sb;
	         
	        for (int i = 0; i < len; i++)
	        {
	            sb = new StringBuffer();
	             
	            int j = i;  // Current index in str
	            int k = 0;  // Current index in temp
	      
	            // Copying the second part from the point
	            // of rotation.
	            for (int l = j; l < str.length(); l++) {
	                sb.insert(k, str.charAt(j));
	                k++;
	                j++;
	            }
	      
	            // Copying the first part from the point
	            // of rotation.
	            j = 0;
	            while (j < i)
	            {
	                sb.insert(k, str.charAt(j));
	                j++;
	                k++;
	            }
	      
	            System.out.println(sb);
	        }
	    }
	     
	   
	    public static void main(String[] args)
	    {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter the String");
	    	String s=sc.next();
	        String  str = new String(s);
	        printRotatedString(str);
	    }
	

		

	}


