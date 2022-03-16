
public class StringManipulation {

	public static void main(String[] args) {
		
	
	String s= "JAVA is Simple";
	
	System.out.println(s.toUpperCase()); //UpperCase
	
	System.out.println(s.toLowerCase()); //LowerCase
	
	
	String[] words=s.split("\\s");	//1st words of letter
	for(String w:words){  
		System.out.print(w.charAt(0)); 
		System.out.print(" ");
	}
	System.out.println(" ");
	
	
	String[] words1=s.split("\\s"); // Change order 
	for(String w:words1){  
		System.out.println(w); 
	}
	
	//String Builder reverse
	StringBuilder words2= new StringBuilder("JAVA is Simple");
	
	Object words21;
	System.out.println("String = " + words2.toString());
	StringBuilder reverseStr = words2.reverse();
	System.out.println("Reverse String = " + reverseStr.toString());
	
	//Total Length
	System.out.println("length of string " + s.length());
}

}
