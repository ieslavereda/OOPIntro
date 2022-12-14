package es.ieslavereda.ejercicio3;

public class ContadorTester {
    public static void main(String[] args) {
        Contador c1 = new Contador();
        Contador c2 = new Contador();

        c1.incremento();
        c1.incremento();
        c1.incremento();
        c1.incremento();
        c1.incremento();

        c2.decremento();

        c1.setValor(28);

        System.out.println(c1.getValor());
        System.out.println(c2.getValor());

    }

}
