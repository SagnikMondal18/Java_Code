import java.util.*;
interface Language{
    void greet();
}
class English implements Language{
    public void greet(){
        System.out.println("\nHello World\n");
    }
}
class French implements Language{
    public void greet(){
        System.out.println("\nBonjour le Monde\n");
    }
}
class Spanish implements Language{
    public void greet(){
        System.out.println("\nHola Mundo\n");
    }
}
class Greetings{
    public static void main(String[] args) {
        English e=new English();
        French f=new French();
        Spanish s=new Spanish();
        Scanner sc =new Scanner(System.in);
        while(true){
            System.out.println("\nChoose :\n1. for English lang\n2. for French lang\n3. for Spanish lang\n4. for exit");
            int ch = sc.nextInt();
            System.out.println("\nYour choose is : "+ ch);
            switch(ch){
                case 1: e.greet();
                break;
                case 2: f.greet();
                break;
                case 3: s.greet();
                break;
                case 4: System.exit(0);
                default:System.out.println("\nWorng Choose\n");
            }
        }
    }
}