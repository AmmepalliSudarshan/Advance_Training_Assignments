import java.util.Scanner;

public class FirstRepeatingEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int temp=0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]+" is the first repeating element");
					temp=1;
					i=n;
					j=n;
				}
				
			}
		}
		if(temp==0) {
			System.out.println("No repeating elements");
			
		}

	}

}
