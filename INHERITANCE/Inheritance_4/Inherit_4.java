import java.util.*;
class Person{
    String name;
    int age;
    void detail(String name,int age){
        this.name=name;
        this.age=age;
    }
     void displayinfo(){

     }
}
class Student extends Person{
    int id;
    void sid(int id){
        this.id=id;
    }
    void displayinfo(){
        System.out.println("The student name is : " +name);
        System.out.println("Student age is : " +age);
        System.out.println("The student id is : " +id);           
    }
}
class Inherit_4{
    public static void main(String[] args){
        Person p = new Person();
        Student s = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the student name and age : ");
        String name = sc.nextLine();
        int age = sc.nextInt();
        System.out.print("Enter student ID no. :");
        int id = sc.nextInt();
        s.sid(id);
        s.detail(name,age);
        s.displayinfo();
    }
   
}