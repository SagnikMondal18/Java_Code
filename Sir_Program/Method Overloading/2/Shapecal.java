class Shapecal{
    int a,b,r,c;
    void area(int a,int b){
        System.out.println("Rectangle area is : "+ a*b);
    }
    void area(int r){
        System.out.println("Circle area is : "+ 3.14*r*r);
    }
    void area(double a,double b,double c){
        double s=(a+b+c)/2;
        double x= Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Tringle area is : "+ x);
    }
    public static void main(String[] args) {
        Shapecal s1=new Shapecal();
        s1.area(5,6);
        s1.area(5);
        s1.area(5,3,4);
    }
    
}