import java.util.*;
class Oddeven{
  public static void main(String[] args){
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Number : ");
    n=sc.nextInt();
    if(n%2==0){
        System.out.print("The number is EVEN ");
    }
    else{
        System.out.print("The Number is ODD ");
    }
   }

}