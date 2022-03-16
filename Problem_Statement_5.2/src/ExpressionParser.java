public class ExpressionParser {
	public static void main(String[] args) {
		
	
	String s= (" 23  +  45  -  (  343  /  12  ) ");
	String[] ep=s.split("\\s");
	
	for(String EP:ep){  
		System.out.println(EP); 
		
	}
}

}