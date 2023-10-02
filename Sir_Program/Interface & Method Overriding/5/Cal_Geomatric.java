import java.util.*;
interface Geomatricobj{
    void calculateArea();
    void calculatePerameter();
}
class Circle implements Geomatricobj{
    Scanner sc =new Scanner(System.in);
    public void calculateArea(){
        System.out.println("Enter the circle of redious value : ");
        double r=sc.nextDouble();
        System.out.println("Circle area calculation is : "+ (3.14*r*r));
    }
    public void calculatePerameter(){
        System.out.println("Enter the circle of redious value for calculate circle perimeter : ");
        double r=sc.nextDouble();
        System.out.println("Circle perimeter calculation is : "+(2*3.14*r));
    }
}
class Square implements Geomatricobj{
    Scanner sc =new Scanner(System.in);
    public void calculateArea(){
        System.out.println("Enter the Square value of area : ");
        int a=sc.nextInt();
        System.out.println("Square area calculation is : "+(a*a));
    }
    public void calculatePerameter(){
        System.out.println("Enter the Square value : ");
        int p=sc.nextInt();
        System.out.println("Square perimeter calculation is : "+(4*p));
    }
}
class Cal_Geomatric{
    public static void main(String[] args) {
        Circle c1=new Circle();
        Square s=new Square();
        c1.calculateArea();
        c1.calculatePerameter();
        s.calculateArea();
        s.calculatePerameter();
    }

}