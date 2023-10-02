import java.util.*;
public class Leapyear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year : ");
        int y = sc.nextInt();
        if(y%400 == 0 || y%4==0 && y%100!=0){
            System.out.print("The year is leapyear");
        }
        else{
            System.out.println("The year is not leapyear");
        }
    }
}
