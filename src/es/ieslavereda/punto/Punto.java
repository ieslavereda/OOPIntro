package es.ieslavereda.punto;

public class Punto {
    private int x;
    private int y;

    public Punto() {
        this.x = 0;
        this.y=0;
    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Punto(int x) {
        this.x = x;
        this.y = 0;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public void moveRight(int distance){
        this.x += distance;
    }

    public void moveLeft(int distance){
        this.x -= distance;
    }

    public void moveUp(int distance){
        this.y += distance;
    }

    public void moveDown(int distance){
        this.y -= distance;
    }

    public Punto getUp(int distance) {
        return new Punto(this.x,this.y+distance);
    }

    public Punto getDown(int distance) {
        return new Punto(this.x,this.y-distance);
    }

    public Punto getLeft(int distance) {
        return new Punto(this.x-distance,this.y);
    }

    public Punto getRight(int distance) {
        return new Punto(this.x+distance,this.y);
    }

    public double getDistance(Punto destino) {
        int difx = destino.getX()-this.x;
        int dify = destino.getY()-this.y;

        return Math.sqrt(Math.pow(difx,2) + Math.pow(dify,2));

    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

}
