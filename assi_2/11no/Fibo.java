import java.util.*;
public class Fibo {
    public static void main(String[] args) {
        int a=0,b=1,c=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n =sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print(" "+ a);
            c=a+b;
            a=b;
            b=c;
        }
    }
}
