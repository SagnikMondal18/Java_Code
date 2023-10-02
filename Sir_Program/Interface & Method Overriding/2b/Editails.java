interface Employee{
    void calculatesalary();
    void displayDetails();
}
class Manager implements Employee{
    String name="Trhita";
    String id="T041";
    String designation="Manger";
    double salary=65000.96;
    public void calculatesalary(){
        System.out.println("<<-----Developer Salary----->>");

        System.out.println("Employee salary is : "+ salary);
    }
    public void displayDetails(){
        System.out.println("<<---- Developer Ditails ---->>");

        System.out.println("Employee name : "+ name);
        System.out.println("Employee id : "+ id);
        System.out.println("Employee designation : "+ designation);    
    }
}
class Developer implements Employee{
    String name="Sagnik";
    String id="S034";
    String designation="Developer";
    double salary=75000.54;
    
    public void calculatesalary(){
        System.out.println("<<-----Developer Salary----->>");  

        System.out.println("Employee salary is : "+ salary);
    }
    public void displayDetails(){
        System.out.println("<<---- Developer Ditails ---->>");

        System.out.println("Employee name : "+ name);
        System.out.println("Employee id : "+ id);
        System.out.println("Employee designation : "+ designation);    
    }
}
class Editails{
    public static void main(String[] args) {
        Manager m=new Manager();
        Developer d=new Developer();
        m.calculatesalary();
        m.displayDetails();
        d.calculatesalary();
        d.displayDetails();
    }
}