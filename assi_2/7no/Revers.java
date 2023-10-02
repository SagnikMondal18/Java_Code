import java.util.*;
class Revers{
    public static void main(String[] args) {
        int n,rev,s=0;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number : ");
        n=sc.nextInt();
        while(n>0){
            rev=n%10;
            s=(s*10)+rev;
            n=n/10;
        }
        System.out.print("Revers number is : "+ s);
    }
}