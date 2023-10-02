import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        int n,rev,s=0,t;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number : ");
        n=sc.nextInt();
        t=n;
        while(n>0){
            rev=n%10;
            s=(s*10)+rev;
            n=n/10;
        }
        if(t==s){
            System.out.print("Revers number ");
        }
        else{
            System.out.print(" NOT Revers number ");
        }
    }
}
