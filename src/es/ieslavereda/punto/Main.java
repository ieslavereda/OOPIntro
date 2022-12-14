package es.ieslavereda.punto;

public class Main {

    public static void main(String[] args) {
        Punto p1 = new Punto(5,6);
        p1.moveRight(3);
        Punto p2 = new Punto(1,1);
        Punto p3 = p2.getUp(5);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());

        System.out.println(p1.getX());
        System.out.println(p2.getDistance(p1));

    }


}
