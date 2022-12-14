package es.ieslavereda.ejercicio3;

/**
 * Ejercicio 3. Crea una clase Contador con los métodos
 * para incrementar y decrementar el contador.
 * La clase contendrá los métodos getters y setters.
 */
public class Contador {

    private int valor;

    public void setValor(int valor){
        this.valor = valor;
    }
    public int getValor() { return this.valor;}
    public void incremento() {valor++;}
    public void decremento() {valor--;}

}
