
public class PolindromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String UpperCase=args[0].toUpperCase();
		int len=UpperCase.length();
		System.out.println("Length of the string is : "+ len);
		
		System.out.println("string is converted into uppercase : "+ UpperCase);
		
		String temp=UpperCase;
		String rev="";
		
		for(int i=len-1;i>=0;i--) {
			rev=rev+UpperCase.charAt(i);
		}
		if(rev.equals(temp)) {
			System.out.println(temp+" is a Palindrome");
		}
		else System.out.println(temp+" not a Palindrome");

	}

}
