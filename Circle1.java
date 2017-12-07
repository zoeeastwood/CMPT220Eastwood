

public class Circle1 extends GeometricObject4 implements Comparable<Circle1> {
  //Field 
  private double radius;

  public Circle1() {
  }

  public Circle1(double radius) {
    this.radius = radius;
  }

  public Circle1(double radius, String color, boolean filled) {
    super(color, filled);
    this.radius = radius;
    setColor(color);
    setFilled(filled);
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getArea() {
    return radius*radius*Math.PI;
  }
 

  public double getPerimeter() {
    return 2*radius*Math.PI;
  }
  
  //Get diameter
  public double getDiameter() {
    return radius * 2; 
  }

  @Override
  public int compareTo(Circle1 o) {
   if (this.equals(o)) 
     return 0; 
   else if (this.radius > o.radius)
    return 1;
   else
     return -1;
  
  
  }
 
  @Override
  public boolean equals(Object obj) {
    if(obj instanceof Circle1){
      Circle1 circle2 = ((Circle1)obj);
    if (this.radius == circle2.getRadius()) 
      return true; 
    else 
     return false;
    }return false; 
  }
 
  @Override
  public String toString() {
    return super.toString() + "\nRadius: " + radius;
 
  }

public int compareTo1(Circle1 circle2) {
	// TODO Auto-generated method stub
	return 0;
}
}