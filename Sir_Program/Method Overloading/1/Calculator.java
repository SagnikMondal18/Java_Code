class Calculator{
    int a,b;
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(double a ,double b){
        System.out.println(a+b);
    }
    void add(int a,double b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        Calculator c=new Calculator();
        c.add(5,6);
        c.add(50.3,10.2);
        c.add(5,60.30);
    }
}