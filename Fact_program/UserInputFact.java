
import java.util.Scanner;
  public class UserInputFact{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number : ");
    int n = sc.nextInt();
    int i,f=1;
     for(i=1;i<=n;i++){
            f=f*i;	
      }
     System.out.print(f);
  }
}