import java.util.*;
interface Bank{
    void deposit();
    void withdraw();
}
class Savings_acc implements Bank{
    Scanner sc = new Scanner(System.in);
    double amount=0.0;
    public void deposit() {
        System.out.println("Enter your amount what you want to deposit in saving account : ");
        double da=sc.nextDouble();
        amount=amount+da;
        System.out.println("After deposit your bank balance(savings account) is : "+ amount);
    }
    public void withdraw(){
        System.out.println("Enter your amount what you want to withdraw in savings account : ");
        double wa=sc.nextDouble();
        amount=amount-wa;
        System.out.println("After withdraw your bank balance(Savings account) is : "+ amount);
    }
}
class Current_acc implements Bank{
    Scanner sc =new Scanner(System.in);
    double amount;
    public void deposit(){
        System.out.println("Enter your amount what you want to deposit in current account : ");
        double cda=sc.nextDouble();
        amount=amount +cda;
        System.out.println("After deposit your bank balance(current account) is : "+ amount);
    }
    public void withdraw(){
        System.out.println("Enter your amount what you want to withdraw in current account : ");
        double cwa=sc.nextDouble();
        amount=amount-cwa;
        System.out.println("After withdraw your bank balance(current account) is : "+ amount);
    }
}
class Bank_system{
    public static void main(String[] args) {
        Savings_acc s1=new Savings_acc();
        Current_acc c1=new Current_acc();
        s1.deposit();
        s1.withdraw();
        c1.deposit();
        c1.withdraw();

    }
}