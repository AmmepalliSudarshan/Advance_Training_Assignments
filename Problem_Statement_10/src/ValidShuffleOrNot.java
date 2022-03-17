import java.util.Scanner;

public class ValidShuffleOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String first="High";
//		String second="School";
//		String third="Highschool";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first String");
		String first=sc.next();
		System.out.println("Enter first String");
		String second=sc.next();
		System.out.println("Enter first String");
		String third=sc.next();
		if(third.equals(first+second)) {
			System.out.println("true : third string is valid shuffle of first and second string");
		}
		else {
			System.out.println("false : third string is not valid shuffle of first and second string");
			
		}

	}

}
