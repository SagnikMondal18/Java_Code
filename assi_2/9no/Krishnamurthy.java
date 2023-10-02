import java.util.*;
class Krishnamurthy {
    public static void main(String[] args) {
        int f=1,n,t,i,r,s=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        n= sc.nextInt();
        t=n;
        while(n>0){
            f=1;
            r=n%10;
            for(i=1;i<=r;i++){
                f=f*i;
            }
            s=s+f;
            n=n/10;
        }
        if(t==s){
            System.out.println("The number is Krishnamurthy");
        }
        else
            System.out.println("The number is not a Krishnamurthy ");
    }    
}
