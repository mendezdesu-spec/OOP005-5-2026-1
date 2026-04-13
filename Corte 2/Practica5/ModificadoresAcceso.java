package modificadoresacceso;

public class ModificadoresAcceso {
        
    public static void main(String[] args) {
       CuentaBanco c1 = new CuentaBanco ("Lina", 100000.0);
       c1.mostrar();
       c1.depositar(25000.0);
       c1.retirar(10000.0);
       System.out.print("\nDespues de operaciones:");
       c1.mostrar();
       System.out.print("\nAcceso controlado con getter:");
       System.out.print("\nSaldo actual = " + c1.getSaldo() );
       System.out.print("\nAcceso controlado con getter: \n");
       
       
       CuentaBanco c2 = new CuentaBanco ("Mauricio", 50000.0); 
       c2.mostrar();
       c2.setSaldo(75000);
       c2.getSaldo();
       System.out.print("Saldo Mauricio: " + c2.getSaldo());
      
    }
    
}
