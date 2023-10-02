public class CMD {
     public static void main(String[] args) {
        int  n,f=1,i;
        n=Integer.parseInt(args[0]);
        for(i=1;i<=n;i++){
            f=f*i;
        }
        System.out.println(f);
    }
}
