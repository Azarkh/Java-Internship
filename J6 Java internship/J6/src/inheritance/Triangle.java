package inheritance;

public class Triangle extends Shape {

	private int b, h;
	public Triangle(int b, int h) {
		this.b = b;
		this.h = h;
	}
	
	public void getArea() {
		super.getArea();
		System.out.print("/n" + 1/2 * b * h);
	}
}
