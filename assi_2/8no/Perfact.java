import java.util.*;
class Perfact{
    public static void main(String[] args) {
        int n,i,sum=0,t;
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the number : ");
        n= sc.nextInt();
        t=n;
        for(i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(sum==t){
            System.out.print("perfact number");
        }
        else{
            System.out.print("NOT perfact number");
        }
    }
}