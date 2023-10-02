import java.util.*;
class Fact{
    public static void main(String[] args) {
        int fact=1,n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("Factorial is : "+ fact);
    }
}