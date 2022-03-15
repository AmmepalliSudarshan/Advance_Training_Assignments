import java.util.Scanner;

public class ListOfEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the limit");
		int limit=sc.nextInt();
		for(int i=0;i<=limit;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}

	}

}
