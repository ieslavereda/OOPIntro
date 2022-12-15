package es.ieslavereda.ejercicio1y2;

public class Tarjeta {

    private Cuenta cuentaAsociada;
    private String titular;
    private String numTarjeta;
    private static int numero;
    private double saldo;
    private double limite;

    public Tarjeta(Cuenta cuentaAsociada, double limite) {
        this.cuentaAsociada = cuentaAsociada;
        this.limite = limite;
        this.saldo = limite;
        this.titular = cuentaAsociada.getTitular();
        this.numTarjeta = "123456"+numero;
        numero++;
    }
    public Tarjeta(Cuenta cuentaAsociada, String titular, double limite) {
        this(cuentaAsociada,limite);
        this.titular = titular;
    }

    public Cuenta getCuentaAsociada() {
        return cuentaAsociada;
    }
    public String getTitular() {
        return titular;
    }
    public String getNumTarjeta() {
        return numTarjeta;
    }
    public double getSaldo() {
        return saldo;
    }
    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) { this.limite = limite;}

    public boolean pagoCredito(double cantidad) {
        if(cantidad>0 && cantidad <= saldo) {
            saldo -= cantidad;
            return true;
        }
        return false;
    }

    public boolean pagoDebito(double cantidad) {
        return cuentaAsociada.reintegro(cantidad);
    }

    public boolean saldarDeuda() {
        if(this.cuentaAsociada.reintegro(this.limite-this.saldo)) {
            this.saldo = this.limite;
            return true;
        }
        return false;

    }
    @Override
    public String toString() {
        return "Numero tarjeta: " + numTarjeta + " titular: " + titular + " limite: " + limite +
                " saldo actual: " + saldo +
                " cuenta asociada: " + cuentaAsociada.getNumeroCuenta();
    }


}
