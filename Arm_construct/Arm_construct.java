import java.util.*;
class Arm{
    int i,n,r,k,sum=0;
    Scanner sc = new Scanner(System.in);
    Arm(int n){
       // System.out.print("Enter the number : ");
       //  n=sc.nextInt();
       this.n=n;
    }
    void cal(){
        k=n;
    while(n>0){
        r = n%10;
        sum=sum+(r*r*r);
        n=n/10;
    }
    if(k==sum){
        System.out.println("Armstrong Number");
    }
    else{
        System.out.println("NOT Armstrong Number");
    }
    }
}
class Arm_construct{
    public static void main(String[] args){
        Arm obj = new Arm(153);
        obj.cal();
    }
}