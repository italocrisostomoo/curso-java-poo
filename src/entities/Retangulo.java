package entities;
public class Retangulo {

	public double width;
	public double height;

	public double Area() {

		return height * width;
	}

	public double Perimeter() {

		return 2 * height + 2 * width;
	}

	public double Diagonal() {

		return Math.sqrt((width * width) + (height * height));
	}
	
	public String toString() {
		
		return "Area: " + String.format("%.2f", Area()) + "\nPerimeter: " +String.format("%.2f", Perimeter()) + "\nDiagonal: " + String.format("%.2f", Diagonal());
	}

}
