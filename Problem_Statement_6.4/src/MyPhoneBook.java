
import java.io.*;
import java.sql.*;
import java.util.*;
 
public class MyPhoneBook {
	public static String help_msg="Press: -  A  Add contact  -  S  Search  - Q  Exit :";
	public static void main(String[] args) {		
		System.out.println("\n\n*** Welcome to MyPhone Book ***\n\n");
		Scanner s=new Scanner(System.in);		
		for(;;){
				System.out.print("[Main Menu] "+help_msg+"\n:");
				String cmd=s.nextLine().trim();				
 
				//if (command.equalsIgnoreCase("H")){					
					//System.out.println(help_msg);
				if (cmd.equalsIgnoreCase("A")){
					System.out.print("Type contact details in the format: firstname,lastname,phone\n:");
 
				}else if (cmd.equalsIgnoreCase("S")){
					System.out.print("Type the name you are searching for :\n:");
 
				}else if (cmd.equalsIgnoreCase("Q")){
					System.out.println("Good Bye User....");
					System.exit(0);
				}else{					
					System.out.print("Unknown command ! Try again \n:");
				}
 
		}
 
	}
 
}