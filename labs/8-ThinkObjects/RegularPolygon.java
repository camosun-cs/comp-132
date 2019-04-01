class RegularPolygon {
  private int n = 3;
  private double side = 1;
  private double x;
  private double y;
/**
*/
  public RegularPolygon() {
  }

  public RegularPolygon(int number, double newSide) {
    n = number;
    side = newSide;
  }

  public RegularPolygon(int number, double newSide, double newX, double newY) {
    this.n = number;
    this.side = newSide;
    this.x = newX;
    this.y = newY;
  }

  public int getN() {
    return n;
  }

  public void setN(int number) {
    n = number;
  }

  public double getSide() {
    return side;
  }

  public void setSide(double newSide) {
    side = newSide;
  }

  public double getX() {
    return x;
  }

  public void setX(double newX) {
    x = newX;
  }
  
  public double getY() {
    return y;
  }

  public void setY(double newY) {
    y = newY;
  }
  
  public double getPerimeter() {
    return n * side;
  }

  public double getArea() {
    return n * side * side / (Math.tan(Math.PI / n) * 4);
  } 
}
