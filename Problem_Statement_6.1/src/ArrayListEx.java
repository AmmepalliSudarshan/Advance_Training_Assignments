import java.util.ArrayList;

public class ArrayListEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		al.add("Sudarshan");
		al.add("Parthu");
		al.add("Vasudha");
		al.add("Obulesh");
		
		System.out.println(al);
		
		if(al.contains("Vasudha")) {
			System.out.println("Student name is present in the list");
			
		}
		else {
			System.out.println("name is not available");
		}

	}

}
