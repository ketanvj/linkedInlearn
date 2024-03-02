package javatraining;

public class Box {
	private double length;
	private double width;
	private double height;

	public Box(double l, double w, double h) throws InvalidBoxException{
		if (l <= 0 || w <= 0 || h <= 0)
			throw new InvalidBoxException("Invalid BOX Object creation");
		length = l;
		width = w;
		height = h;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
