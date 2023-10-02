import java.util.*;
class Digitsum{
   public static void main(String[] args) {
    int sum=0,r;
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter minimum 3 digits number :");
    int n=sc.nextInt();
    while(n>0){
         r=n%10;
         sum=sum+r;
         n=n/10;
    }
     System.out.print("Digit sum is :"+ sum);
   }
}


