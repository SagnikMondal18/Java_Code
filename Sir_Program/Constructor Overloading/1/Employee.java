import java.util.*;
class Employee{
    String name,designation;
    int eid;
    double salary;
    Employee(){
        this.name="Sagnik";
        this.designation="Devoloper";
        this.eid=034;
        this.salary=30000.50;
    }
    Employee(String name,String designation,int eid,double salary){
        this.name=name;
        this.designation=designation;
        this.eid=eid;
        this.salary=salary;
    }
    void display(){
        System.out.println("<--: Display the employee ditails :-->");
        System.out.println("Name : "+ name);
        System.out.println("Designation : "+ designation);        
        System.out.println("Employee id : "+ eid);        
        System.out.println("Salary : "+ salary);
    }
    public static void main(String[] args) {
        Employee e1=new Employee();
        Employee e2=new Employee("Trishita","Professor",041,25000.50);
        e1.display();
        e2.display();

    }


}
