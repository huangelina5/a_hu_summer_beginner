public class lesson4_class_circle{
  public static void main(String[] args){

    circle cir1 = new circle(1.0,"red");
    System.out.println(cir1);
  }
}

class circle{
  double radius;
  String color;

  public circle(double radius, String color){
    this.radius = radius;
    this.color = color;
  }

  public circle(double radius){
    this.radius = radius;
  }

  public circle(){

  }

  public double getRadius(){
    return this.radius;
  }

  public void setRadius(double radius){
    this.radius = radius;
  }

  public String getColor(){
    return this.color;
  }

  public void setColor(String color){
    this.color = color;
  }

  public String toString(){
    return "Circle [" + this.radius + " , " + this.color + "]";
  }

  public double getArea(){
    double area = radius * radius * Math.PI
    return area;
  }

  public double getCircumference(){
    double circumference = 2 * radius
  }

  



}
