
public class Square extends GeometricObject3 implements Colorable {

  //data field
  private double side; 

  public Square() {
    
  }
 
  public String howToColor() {
    return "Color all four sides.";
  }

  public Square(double newSide){
    side = newSide;
  }
 
  public Square(double newSide,String color, boolean filled) {
    side = newSide;
    setColor(color);
    setFilled(filled);
  }

  public double getSide() { 
     return side;
  }

  @Override
  public double getArea() {
    return Math.pow(side, 2);
  }
  //getPerimeter
  @Override
  public double getPerimeter() {
    return side * 4;
  
   } 
  @Override
  public String toString() {
    return super.toString() + "\nSide: " + getSide() + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
  
  }

}
