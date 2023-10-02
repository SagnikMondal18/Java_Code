import java.util.*;
interface Vehicle{
    void start();
    void stop();
}
class Car implements Vehicle{
    public void start(){
        System.out.println("Car is Start & car is called 4 wheeler ");
    }
    public void stop(){
        System.out.println("Car is Stop & car is called 4 wheeler ");
    }
}
class Motorcycle implements Vehicle{
    public void start(){
        System.out.println("Motorcycle is Start & motorcycle is called 2 wheeler ");
    }
    public void stop(){
        System.out.println("Motorcycle is Stop & motorcycle is called 2 wheeler ");
    }
}
class Display{
    public static void main(String[] args) {
     Car c=new Car();
     Motorcycle m=new Motorcycle();
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter 1 for start method call & 0 for stop method call");
     int n=sc.nextInt();
     if(n!=0){
        c.start();
        m.start();
     }
     else{
        c.stop();
        m.stop();
     }
    }
}
