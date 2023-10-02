import java.util.*;
public class largest{
    int larg(int a, int b, int c){
        if(a>=b && a>=c){
            return a;
          //  System.out.print(a + " is large");
        }
        else if(b>=c)
        {
            return b;
            //System.out.print(b + "is large");
        }
        else{
            return c;
            //System.out.print(c + "is large");
        }

    }
public static void main(String[] args){
    largest obj=new largest();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first value : ");
    int a = sc.nextInt();
    System.out.println("Enter the second value : ");
    int b = sc.nextInt();
    System.out.println("Enter the third value : ");
    int c = sc.nextInt();
    System.out.println("Largest number is: " + obj.larg(a,b,c));
  }
}