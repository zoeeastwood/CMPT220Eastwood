public class Problem9_1 {
  

  private double width; 
 
  private double height;
 
  public Rectangle() {
    width = 1;
    height = 1;
  }
  
  public Rectangle(double newWidth, double newHeight) {
    width = newWidth;
    height = newHeight;  
  }
 
  public double getWidth() { 
     return width;
  }

  public double getHeight() {
    return height;
  }

  public double getArea() { 
    return width * height;
  }

  public double getPerimeter() { 
    return ((width + height) * 2);
  }
}