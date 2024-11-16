package inheritance;

public class Circle extends Shape {

	private int r;
	
	public Circle(int r) {
		this.r = r;
	}
	
	public void getArea() {
		super.getArea();
		System.out.print(Math.PI*r*r);
	}
}