import java.util.*;
interface Currencyconverter{
    void convertCurrency();
}
class Dollar implements Currencyconverter{
    Scanner sc=new Scanner(System.in); 
    public void convertCurrency(){
        System.out.println("<--INR to USD-->");
        System.out.println("Enter your INR amount : ");
        double INRamount = sc.nextDouble();
        System.out.println("After convert INR to USD , the INR amount is  :"+ (INRamount / 83.14));
        System.out.println("******* USD to INR *******");
        System.out.println("Enter the USD amount : ");
        double USDamount=sc.nextDouble();
        System.out.println("After convert USD to INR , the USD amount is  :"+ (USDamount * 83.14));
    }
}
class Euro implements Currencyconverter{
    Scanner sc =new Scanner(System.in);
    public void convertCurrency(){
        System.out.println("<---- INR to EURO ---->");
        System.out.println("Enter your INR amount : ");
        double INRamount = sc.nextDouble();
        System.out.println("After convert INR to EURO , the INR amount is  :"+ (INRamount / 88.63));
        System.out.println("******* EURO to INR *******");
        System.out.println("Enter the EURO amount : ");
        double EUROamount=sc.nextDouble();
        System.out.println("After convert EURO to INR , the EURO amount is  :"+(EUROamount * 83.14)); 
    }
} 
class Currency_calculate{
    public static void main(String[] args) {
        Dollar d= new Dollar();
        Euro e=new Euro();
        Scanner sc =new Scanner(System.in);
        while(true){
            System.out.println("Choose:\n 1. for convert INR to USD & USU to INR\n 2. for convert INR to EURO & EURO to INR\n3. for tata bye bye ");
            int n=sc.nextInt();
            switch(n){
                case 1:d.convertCurrency();
                break;
                case 2:e.convertCurrency();
                break;
                case 3:System.exit(0);
                default:System.out.println("Thik kore choise korun");
            }
        }
    }
}