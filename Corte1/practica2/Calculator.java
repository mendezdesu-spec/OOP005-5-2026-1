package calculator;

public class Calculator {
    public int x1, x2;

//Contructor
    public Calculator(int a, int b) {
        x1 = a;
        x2 = b;
    }
    
    public int add(){
        return x1 + x2;        
    }
    
    public int subs(){
        return x1 - x2;        
    }
 
    public static void main(String[] args) {
        // TODO code application logic here
        Calculator m = new Calculator(34, 43);
        System.out.println("La suma con el objeto m es: " + m.add());
        System.out.println(m.subs());
    }
}
