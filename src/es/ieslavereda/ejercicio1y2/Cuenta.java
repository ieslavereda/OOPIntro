package es.ieslavereda.ejercicio1y2;

public class Cuenta {

    private double saldo;
    private String titular;
    private String numeroCuenta;
    private static int numero;

    public Cuenta(String titular) {
        this.titular = titular;
        numeroCuenta = "ESXX0019"+numero;
        numero++;
    }
    public Cuenta(String titular, double saldo) {
        this(titular);
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public boolean ingreso(double cantidad) {
        if(cantidad > 0) {
            this.saldo += cantidad;
            return true;
        }
        return false;
    }

    public boolean reintegro(double cantidad) {
        if(cantidad > 0 && saldo >= cantidad) {
            this.saldo -= cantidad;
            return true;
        }
        return false;
    }

    public boolean transferencia(Cuenta destino, double cantidad){
        if(reintegro(cantidad))
            if(destino.ingreso(cantidad))
                return true;
        return false;
    }

    @Override
    public String toString() {
        return "Titular: " + titular +
                " \n numero cuenta: " + numeroCuenta + " \n saldo: " + saldo;
    }
}
