import java.util.*;

import javax.sound.sampled.SourceDataLine;
interface Shape{
    void calculatearea();
    void calculatePerimeter();
}
class Circle implements Shape{
    Scanner sc =new Scanner(System.in);    
    public void calculatearea(){
        System.out.println("Enter the circle of redious value : ");
        double r=sc.nextDouble();
        System.out.println("Circle area calculation is : "+ (3.14*r*r));
    }
    public void calculatePerimeter(){
        System.out.println("Enter the circle of redious value for calculate circle perimeter : ");
        double r=sc.nextDouble();
        System.out.println("Circle perimeter calculation is : "+(2*3.14*r));
    }
}
class Rectangle implements Shape{
    Scanner sc =new Scanner(System.in);
    public void calculatearea(){
        System.out.println("Enter the rectangle of lenth & weight value : ");
        int l=sc.nextInt();
        int w=sc.nextInt();
        System.out.println("Rectangle area calculation is : "+(l*w));
    }
    public void calculatePerimeter(){
        System.out.println("Enter the rectangle of lenth & weight value : ");
        int l=sc.nextInt();
        int w=sc.nextInt();
        System.out.println("Rectangle perimeter calculation is : "+(2*(l+w)));
    }
}
class Calarea_perimeter{
    public static void main(String[] args) {
       Circle c=new Circle();
       Rectangle r=new Rectangle();
       c.calculatearea();
       c.calculatePerimeter();
       r.calculatearea();
       r.calculatePerimeter();
    }
}

