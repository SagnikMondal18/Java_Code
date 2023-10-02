import java.util.*;
interface Shape{
    void CalculateArea();
}
class Circle implements Shape{
    public void CalculateArea(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius value : ");
        int r=sc.nextInt();
        double area=3.14*r*r;
        System.out.println("Circle area is : "+ area);
    }
}
class Rectangle implements Shape{
    public void CalculateArea(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length value : ");
        int l=sc.nextInt();
        System.out.println("Enter the width value : ");
        int w=sc.nextInt();
        System.out.print("Rectangle area is : "+ (l*w));
    }
}
class Shape_cal{
    public static void main(String[] args) {
        Circle c=new Circle();
        Rectangle r=new Rectangle();
        c.CalculateArea();
        r.CalculateArea();
    }
}