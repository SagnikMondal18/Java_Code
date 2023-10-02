
     public class Fact_obj{
      int n =5,i,f=1;
      void fact(){
      for(i=1;i<=n;i++){
             f=f*i;		  
      }
   	System.out.println(f);   
 }	
public  static void main(String[] args){
	Fact_obj a=new Fact_obj();
	a.fact();
  }
}	