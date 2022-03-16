
public class Febinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Command Line Args are : "+args[0]+" "+args[1]);
		
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c;
		int n=15;
		for(int i=1;i<=n;i++) {
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
			
			
		}
		
		

	}
}


