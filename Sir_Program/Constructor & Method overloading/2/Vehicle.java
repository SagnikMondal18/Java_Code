import java.util.Scanner;

class Vehicle{
    String make,modele;
    int year;
    double price;
    Vehicle(String modele,double price,int year,String make){
        this.modele=modele;
        this.price=price;
        this.year=year;
        this.make=make;
    }
        Vehicle(String make,String modele,int year,double price){
            this.make=make;
            this.modele=modele;
            this.year=year;
            this.price=price;
        }
        void display(){
            System.out.println(modele);   
            System.out.println(price);
            System.out.println(year);
            System.out.println(make);
        }
        void display(int n){
            System.out.println(year+" "+price+" "+make+" "+" "+modele);
        }

        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            System.out.print("Enter the modele : ");
            String m=sc.nextLine();
            System.out.print("Enter price : ");
            double p=sc.nextDouble();
            System.out.print("Enter year : ");
            int y=sc.nextInt();
            System.out.print("Enter make : ");
            String mk=sc.nextLine();
            Vehicle v1=new Vehicle(m,p,y,mk);
            Vehicle v2=new Vehicle("ABCD","KTM" , 2023, 200000.00);
            v1.display();
            v2.display(5);


        }


}