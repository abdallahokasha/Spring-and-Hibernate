package okasha;

public class Circle implements Shape {
	private Point center;

	public void draw() {
		System.out.println("Circle Drwaing \nThis is circle center:(" + center.getX() + ", " + center.getY() + ")");
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}
}
