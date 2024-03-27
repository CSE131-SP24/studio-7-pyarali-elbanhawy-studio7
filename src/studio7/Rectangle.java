package studio7;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {

	private double length;
	private double width;
public Rectangle(double theLength, double theWidth) {
length = theLength;
width = theWidth;
}
public double Area() {
	return length*width;
}
public double Perimeter() {
	return (2*width)+(2*length);
}
public boolean Comparison(double length2, double width2) {
	double Area1 = Area ();
	double Area2 = (width2*length2);
	if (Area1 < Area2) {
	return true; 
	} else {
	return false;
	}

}
public boolean Comparison(Rectangle rectangle2) {
	double Area1 = Area ();
	double Area2 = rectangle2.Area();
	if (Area1 < Area2) {
	return true; 
	} else {
	return false;
	}

}
public boolean ifSquare() {
	if (length == width) {
return true;
	} else {
		return false;
	}
	}
public void Draw () {
	StdDraw.rectangle(0.5, 0.5, width*0.5, length*0.5);
}
public static void main(String[] args) {
Rectangle pink = new Rectangle(0.2, 0.3);
System.out.println("Area is " + pink.Area());
System.out.println("Perimeter is " + pink.Perimeter());
StdDraw.setPenColor(Color.pink);
pink.Draw();

Rectangle blue = new Rectangle(0.5,0.7);
StdDraw.setPenColor(Color.blue);
blue.Draw();

System.out.println("Pink rectangle is smaller than Blue " + pink.Comparison(0.5, 0.7));
System.out.println("Pink rectangle is smaller than Blue " + pink.Comparison(blue));

}
}

