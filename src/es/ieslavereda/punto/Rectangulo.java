package es.ieslavereda.punto;

public class Rectangulo {

    private Punto inferiorIzquierda;
    private Punto superiorIzquierda;
    private Punto inferiorDerecha;
    private Punto superiorDerecha;

    //dos constructores: 1 a partir de punto infizd y supder
    // otro a partir de infizq y base y altura

    public Rectangulo(Punto inferiorIzquierda, Punto superiorDerecha) {
        this.inferiorIzquierda = inferiorIzquierda;
        this.superiorDerecha = superiorDerecha;
        this.superiorIzquierda = new Punto(inferiorIzquierda.getX(), superiorDerecha.getY());
        this.inferiorDerecha = new Punto(superiorDerecha.getX(), inferiorIzquierda.getY());
    }

    public Rectangulo(Punto inferiorIzquierda, int base, int altura) {
        this.inferiorIzquierda =inferiorIzquierda;
        this.inferiorDerecha = inferiorIzquierda.getRight(base);
        this.superiorIzquierda = inferiorIzquierda.getUp(altura);
        this.superiorDerecha = inferiorDerecha.getUp(altura);
    }

    //cuatro métodos funcionales para movr arriba, abajo, derecha, izquierda
    public void moveUp(int distance) {
        inferiorIzquierda.moveUp(distance);
        inferiorDerecha.moveUp(distance);
        superiorDerecha.moveUp(distance);
        superiorIzquierda.moveUp(distance);
    }

    public int getBase() {
        return (int) (inferiorIzquierda.getDistance(inferiorDerecha));
    }

    public int getHeight() {
        return (int) (inferiorDerecha.getDistance(superiorDerecha));
    }
    // perimeter - area
    public int perimeter(){
        return 2*(getBase()+getHeight());
    }

    public int area(){
        return getBase()*getHeight();
    }

    @Override
    public String toString(){
        return inferiorIzquierda +","+ superiorIzquierda +","+
                superiorDerecha +","+ inferiorDerecha;
    }

    //https://github.com/ieslavereda/OOPIntro

}
