
package modificadoresacceso;


public class MainCuenta {

   
    public static void main(String[] args) {
     CuentaBancaria c1=new CuentaBancaria("Maria",100000.0);
     c1.mostrar();
     c1.depositar(50000.0);
    
     c1.retirar(70000.0);
     System.out.println("despues de las operaciones");
     c1.mostrar();
      System.out.println("acceso al saldo con getter"+c1.getSaldo());
    }
    
}
