package es.ieslavereda.ejercicio1y2;

public class CuentaTester {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta("Carlos");
        Cuenta c2 = new Cuenta("Ian",80000);
        Cuenta c3 = new Cuenta("Jaime", 100000);

        c1.ingreso(500);
        c1.reintegro(1000);
        c2.transferencia(c1,25000);


        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
    }
}
