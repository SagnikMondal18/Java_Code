import java.util.Scanner;
class User_factobj{
       void FACT(int n){
              int f =1 , i;
	for(i = 1 ; i <= n ; i++){
	       f = f*i ;
	}
	System.out.print(f);
    }
 public static void main(String[] args){
	User_factobj OBJ = new User_factobj();
	System.out.println("Enter the number :");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	OBJ.FACT(n);
  }
}