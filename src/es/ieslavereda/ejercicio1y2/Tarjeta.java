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
}
