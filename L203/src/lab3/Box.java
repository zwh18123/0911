package lab3;
/* Name: zhushuorong 
	Lab Section: L2 
	Lecture Section:03

	Date:08/09/2018109
	Date:08/09/20181
	Assignment:Lab3
	Description:Part_1
	*/

public class Box {
	// These are the declarations for the private instance fields:

	private String color_;
	private double height_;
	private double width_;
	private double depth_;

	// Write accessor-methods for each private instance field (getter-methods).
	public String getcolour() {
		return color_;
	}

	public double getheight() {
		return height_;
	}

	public double getwidth() {
		return width_;
	}

	public double getdepth() {
		return depth_;
	}

	// Write mutator-methods for each private instance field (setter-methods).
	public void setcolour(String c1) {
		color_ = c1;
	}

	public void setheight(double h1) {
		height_ = h1;
	}

	public void setwidth(double w1) {
		width_ = w1;
	}

	public void setdepth(double d1) {
		depth_ = d1;
	}

	public Box(double hei, double wid, double dep, String col) {
		// These are the declarations for the private instance fields:
		// set the instance fields using the input parameters from the header line.
		color_ = col;
		height_ = hei;
		width_ = wid;
		depth_ = dep;
	}

	// This is the no-argument constructor.
	public Box() {
		// Set the instance fields here:
		// 1. Set the box color to white.
		// 2. Set each dimension of the box to 12.0;
		setheight(12.0);
		setwidth(12.0);
		setdepth(12.0);
		setcolour("white");
	}

	// Write a copy constructor for the Box class here:
	public Box(Box bx) {

		setcolour(bx.getcolour());
		setdepth(bx.getwidth());
		setwidth(bx.getwidth());
		setheight(bx.getheight());
	}

	// Write separate methods for computing the area and the volume.

	public double boxarea() {
		return width_ * height_;
	}

	public double boxvolume() {
		return width_ * height_ * depth_;
	}

	// Write a method named toString to return all the instance fields as a String.
	// Use concatenation to build the String. Use your getter methods for all
	// instance
	// fields.
	// public String toString()
	public String toString() {
		String str_1 = "the colour is " + this.getcolour() + "\n" + "the height is " + this.getheight() + "\n"
				+ "the width is " + this.getwidth() + "\n" + "the depth is" + this.getdepth();

		return str_1;

	}

}
