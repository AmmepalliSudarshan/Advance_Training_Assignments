
public class Rectangle {
	
	int length=1;
	int breadth=1;
	

	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}


	public int getBreadth() {
		return breadth;
	}


	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	public int calPeremeter() {
		return 2*(length+breadth);
	}
	
	public int calArea() {
		return length*breadth;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1=new Rectangle();
		System.out.println("Peremeter Of Rectangle with default length and breadth is : "+r1.calPeremeter());
		System.out.println("Area Of Rectangle with default length and width is : "+r1.calArea());
		r1.setLength(12);
		System.out.println("Length Of Rectangle : "+r1.getLength());
		r1.setBreadth(15);
		System.out.println("Breadth Of Rectangle : "+r1.getBreadth());
		
		System.out.println("Peremeter Of Rectangle is : "+r1.calPeremeter());
		System.out.println("Area Of Rectangle is : "+r1.calArea());
		

	}

}
