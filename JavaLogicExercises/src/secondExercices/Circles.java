package secondExercices;

import java.util.Comparator;

public class Circles {
	
	private double ray;
	private String color;
	
	public Circles(double ray, String color) {this.ray =ray; this.color=color;};
	
	public String getColor() {
		return color;
	}
	
	public double getRay() {
		return ray;
	}
	
	public void setRay(double ray) {
		this.ray = ray;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public double getArea() {
		
		return (ray*ray)*3.14;
	}

}
