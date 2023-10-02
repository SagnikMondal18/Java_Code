import java.util.*;
class A{
    void add(int a,int b){
        System.out.println("Sum is : " + (a+b));
    }
    void sub(int a, int b){
        System.out.println("Substraction is : " + (a-b));
    }
}
class B extends A{
    void mul(int a,int b){
        System.out.println("Multipilcation is : "+ (a*b));
    }
    void div(int a ,int b ){
        System.out.println("Division is : " + (a/b));
    }
}
class Simp_Inharitance extends B{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a =sc.nextInt();
        int b = sc.nextInt();
        Simp_Inharitance obj = new Simp_Inharitance();
        obj.add(a,b);
        obj.sub(a,b);
        obj.mul(a,b);
        obj.div(a,b);
    }
}
