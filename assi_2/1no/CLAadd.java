//wap in java to add two number using command line argument//
class CLAadd{
    public static void main(String[] args) {
        int a,b,s=0;
        a=Integer.parseInt(args[0]);
        b=Integer.parseInt(args[1]);
        s=a+b;
        System .out.println("Sum is : "+ s);
    }
}