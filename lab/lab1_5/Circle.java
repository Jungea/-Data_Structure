package lab1_5;

public class Circle {

	private int radius;
	
	public Circle() {
		radius=1;
	}
	
	public Circle(int radius) {
		this.radius=radius;
	}
	
	public int getRadius() {  //getter
		return radius;
	}
	
	public void setRadius(int radius) {  //setter
		this.radius=radius;
	}
	
	public double area() {  //¸éÀû
		return Math.PI*radius*radius;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + radius;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (radius != other.radius)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "[radius=" + radius + "]";
	}
	
	
}
