import java.util.*;
class Student{
    String name;
    int cls,roll;
}
class Art extends Student{
    int his,ben;
    Art(String name,int roll,int cls){
        this.name=name;
        this.roll=roll;
        this.cls=cls;
    }
    void getdata(int h,int b){
        his=h;
        ben=b;
    }
    void display(){
        System.out.println("Name is : "+ name);
        System.out.println("Roll no is : "+ roll);
        System.out.println("Class : "+ cls);
        System.out.println("History marks : "+ his);
        System.out.println("Bengali marks : "+ ben);
    }
}
class Science extends Student{
    int math,chem;
    Science(String name,int roll,int cls){
        this.name=name;
        this.roll=roll;
        this.cls=cls;
    }
    void getdata(int m,int c){
        math=m;
        chem=c;
    }
    void display(){
        System.out.println("Name is : "+ name);
        System.out.println("Roll no is : "+ roll);
        System.out.println("Class : "+ cls);
        System.out.println("Math marks : "+ math);
        System.out.println("Chemistry marks : "+ chem);
    }
}
class Result{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter name : ");
        String n=sc.nextLine();
        System.out.print("Enter roll no. : ");
        int r=sc.nextInt();
        System.out.print("Enter class : ");
        int cl=sc.nextInt();
        System.out.print("Enter history marks : ");
        int h=sc.nextInt();
        System.out.print("Enter bengali marks : ");
        int b=sc.nextInt();

        System.out.print("Enter math marks : ");
        int m=sc.nextInt();
        System.out.print("Enter chemistry marks : ");
        int c=sc.nextInt();

        System.out.println("<---- Arts details ----> ");

        Art a1=new Art(n,r,cl);
        a1.getdata(h,b);
        a1.display();
        
        System.out.println("<---- Science details ----> ");

        Science s1=new Science(n, r, cl);
        s1.getdata(m, c);
        s1.display();
    }
}
