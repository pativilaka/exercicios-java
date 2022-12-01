package entities;

public class Rectangle {
	
	public double width;
	public double height;
	
	public double area() {
		
		return this.width * this.height;
		
	}
	
	public double perimeter() {
		
		return Math.pow(this.height, 2) + Math.pow(this.width,2);
		
	}
	
	public double diagonal() {
		
		return Math.sqrt(perimeter());
		
	}

	
	public String toString() {
		
		return "Area = "
				+ String.format("%.2f%n",  area())
				+  "Perimeter = "
				+ String.format("%.2f%n", perimeter())
				+ "Diagonal = "
				+ String.format("%.2f%n", diagonal());
		
	}
}
