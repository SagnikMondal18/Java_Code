/*Create a class called Shape with a method calculateArea() that returns 
0.Then,create two subclasses called Rectangle and Circle,which inherit
from Shape.Implement the calculateArea() method in both subclasses to
return the area of the respective shapes.*/
import java.util.*;
class shape{
   void calculateArea(){
    }
}
class Rectangle extends shape{
   void calculateArea(int l,int w){
        System.out.println("Rectangle area is:" + (l*w));
    }
}
class Circle extends shape{
    void calculateArea(double r){
        System.out.print("Circle is :" + (3.14)*r*r);
    }
}
class Inharitance_1{
public static void main(String[] args){
    Rectangle r1= new Rectangle();
    Circle c1 = new Circle();
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the rectangle length and width value:");
    int l= sc.nextInt();
    int w= sc.nextInt();
    r1.calculateArea(l,w);
    System.out.print("Enter the circle radius value:");
    double r = sc.nextDouble();
    c1.calculateArea(r);
}
}