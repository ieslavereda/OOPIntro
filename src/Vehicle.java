public class Vehicle {

    //usar 4 atributos
    private String marca;
    private String modelo;
    private String color;
    private int consumo;
    private int marcha;

    public Vehicle(){
        marca = "";
        modelo = "";
        color = "";
        consumo = 0;
    }

    public Vehicle(String marca, String modelo, String color, int consumo) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.consumo = consumo;
    }

    public void setConsumo (int c) {
        consumo = c;
    }
    public int getConsumo () {
        return consumo;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void subirMarcha() {
        if (marcha < 6)
            marcha++;
    }

    public void bajarMarcha() {
        if (marcha > 0)
            marcha--;
    }

}
