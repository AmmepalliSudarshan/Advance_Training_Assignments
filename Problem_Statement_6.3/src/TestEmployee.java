import java.util.Vector;

public class TestEmployee {
	public static void main(String[] args) {
		Vector<Employee> v = addInput();
		display(v);
		}

	private static Vector<Employee> addInput() {
		// TODO Auto-generated method stub
		return null;
	}

	private static void display(Vector<Employee> v) {
		// TODO Auto-generated method stub
		
	}

	public static Vector<Employee> main1(String[] args) {
		Employee e1=new Employee (101,"sudarshan", "tirupathi");
		Employee e2=new Employee (102,"parthu", "vizag");
		Employee e3=new Employee (103,"vasudha", "chennai");
		Vector<Employee> v=new Vector<Employee>();
		v.add(e1);
		v.add(e2);
		v.add(e3);
		return v;
	}
	public static void main11(String[] args) {
		for(Employee e:v)
		{
			System.out.println(e.getEmployeeNo()+"\t"+e.getEmployeeName()+"\t"+e.getAddress());
		}
	}
}

