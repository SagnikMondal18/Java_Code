/*Creat a class called Vehicle with attributes brand and year,and a method displayinfo() that prints the brand and year of the Vehicle.Then,creat a subclass called car that inherits from Vehicle and adds an attribute numDoors.Override the displayinfo() method in the Car class to include the number of doors in the output.*/
import java.time.YearMonth;
import java.util.*;
class Vehicle{
    int year;
    String brand;
    void year_brand(int year,String brand){
    this.year=year;
    this.brand=brand;
    }
    void displayinfo(){
      System.out.println("Year is : "+ year);
      System.out.println("The brand is : " + brand);
    }
}
class Car extends Vehicle{
    int numdoors;
   // @Override
    void door(int numdoors){
        this.numdoors=numdoors;
    }
    void displayinfo(){
        System.out.println("Year is : "+ year);
        System.out.println("The brand is : " + brand);
        System.out.println("Number of doors are : " + numdoors);
    }
}
public class Inherit_3{
    public static void main(String[] args){
        Vehicle v = new Vehicle();
        Car c = new Car();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year and brand : ");
        int year = sc.nextInt();
        String brand = sc.nextLine();
        v.year_brand(year,brand);
        v.displayinfo();
        System.out.print("Enter door numbers : ");
        int numdoors = sc.nextInt();
        c.door(numdoors);
        c.year_brand(year,brand);
        c.displayinfo();
    }   
}
