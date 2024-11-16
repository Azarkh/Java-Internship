package inheritance;

public class Shape {

	public Shape() {
		
	}
	
	public void getArea() {
		System.out.print("Area = ");
	}
	
	public class Rectangle extends Shape{
		private int l;
		private int b;
		public Rectangle(int l, int b){
			this.l = l;
			this .b = b;
		}
		
		public void getArea() {
			super.getArea();
			System.out.print(l * b);
		}
	}
}