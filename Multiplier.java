import java.math.BigDecimal;
import java.util.ArrayList;

public class Multiplier {
   private int a, b, c, d;
   private double x, y;
   private BigDecimal i, e;
   private ArrayList<Integer> integers = new ArrayList<Integer>();

   public int Multiply (int a, int b){
       this.a = a;
       this.b = b;
       return a*b;
   }

   public int Multiply (int a, int b, int c, int d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        return a*b*c*d;
   }
   
   public double Multiply (double x, double y){
       this.x = x;
       this.y = y;
       return x*y;
   }
   
   public BigDecimal Multiply (BigDecimal i, BigDecimal e){
       this.i = i;
       this.e = e;
       return i.multiply(e);
   }

   public int Multiply (ArrayList<Integer> integers){
        this.integers = integers;
       int product = 1;
       for (int i = 0; i < integers.size(); i++){
           product *= integers.get(i);
       }
       return product;
   }

   

   


}
