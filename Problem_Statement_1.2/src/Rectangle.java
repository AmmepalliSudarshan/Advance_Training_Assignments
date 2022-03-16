
public class Rectangle {
	
	int length;
	int breadth;
	

	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	
	public int area() {
		return length*breadth;
	}
	
	public void display() {
		System.out.println("Rectangle Area : "+area());
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1=new Rectangle(20,25);
		r1.display();
		Rectangle r2=new Rectangle(30,35);
		r2.display();
		Rectangle r3=new Rectangle(40,45);
		r3.display();
		Rectangle r4=new Rectangle(50,55);
		r4.display();
		Rectangle r5=new Rectangle(10,15);
		r5.display();

	}

}
