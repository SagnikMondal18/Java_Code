class Product{
    String pid,pname;
    int quantity;
    double price;
    Product(){
        this.pid="034s";
        this.pname="Book";
        this.quantity=10;
        this.price=300.10;
    }
    Product(String pid,String pname,int quantity,double price){
        this.pid=pid;
        this.pname=pname;
        this.quantity=quantity;
        this.price=price;
    }
    void cost(int a){
        System.out.println("    <--: 1st Product Details :-->   ");
        System.out.println("Total cost is : "+ (quantity*price));
    }
    void cost(double n){
        System.out.println("  <--: 2nd Product Details :-->  ");
        System.out.println("Total cost is : "+ (quantity*price));
    }
    public static void main(String[] args) {
        Product p1=new Product();
        Product p2=new Product("041t","Makeup kits",10,500.10);
        p1.cost(5);
        p2.cost(5.2);
    }
}