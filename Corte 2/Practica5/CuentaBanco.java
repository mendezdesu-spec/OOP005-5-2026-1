package modificadoresacceso;

public class CuentaBanco {
    private String titular;
    private double saldo;

    public CuentaBanco (String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void depositar (double monto){
        if (monto > 0){
            saldo = saldo + monto;
        }
    }
    
    public void retirar (double monto){
        if (monto > 0 && monto <= saldo){
            saldo = saldo - monto;
        }
    }
    
    public void mostrar (){
        System.out.println ("\nTitular = " + titular);
        System.out.println ("Saldo = " + saldo);
    }
}
