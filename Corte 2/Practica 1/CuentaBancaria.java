package modificadoresacceso;
public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    
    
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void depositar(double monto){
        if(saldo>0){
            saldo=saldo+monto;
            
           
        }
        
    }
    public void retirar(double monto){
        if(saldo>0 && saldo>=monto){
            saldo=saldo-monto;
        }
    }
    public void mostrar(){
        System.out.println("Titular de la cuenta"+titular);
        System.out.println("Saldo en la cuenta"+saldo);
        
    }
    
    
    
}
