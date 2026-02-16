
package calculadora;


public class Calculadora {

   public int x1, x2;
   
   public Calculadora(int a, int b){
    x1 = a;
    x2 = b; 
   }
   public int add(){
       return x1 + x2;
   }
   public int subs(){
       return x1 - x2;
   }
   public int mult(){
       return x1 * x2;
   }
   public int div(){
       
       return x1 / x2;
   }
    public static void main(String[] args) {
       Calculadora m = new Calculadora (34, 43);
       System.out.println(m.add());
       System.out.println(m.subs());
       System.out.println(m.mult());
       System.out.println(m.div());
       Calculadora n = new Calculadora (10, 2);
       System.out.println(n.add());
       System.out.println(n.subs());
       System.out.println(n.mult());
       System.out.println(n.div());
    }
}

