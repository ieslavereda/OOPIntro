public class Vehicle {

    //usar 4 atributos
    private String marca;
    private String modelo;
    private String color;
    private int consumo;
    private int marcha;
    private boolean automatico;
    private int numMarchas;

    public Vehicle(){
        marca = "";
        modelo = "";
        color = "";
        marcha = 0;
        consumo = 0;
        automatico = false;
        numMarchas = 0;
    }

    public Vehicle(String marca, String modelo, String color, int consumo, boolean automatico) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.consumo = consumo;
        this.marcha = 0;
        this.automatico = automatico;
        if (automatico)
            this.numMarchas = 0;
        else
            this.numMarchas = 5;
    }

    public Vehicle(String marca, String modelo, String color, int consumo, boolean automatico, int numMarchas) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.consumo = consumo;
        this.marcha = 0;
        this.automatico = automatico;
        if (automatico)
            this.numMarchas = 0;
        else
            this.numMarchas = numMarchas;
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
    public String getModelo() {
        return modelo;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean getAutomatico() {
        return automatico;
    }
    public int getNumMarchas() { return numMarchas;}

    public void subirMarcha() {
        if (!automatico && marcha < numMarchas)
            marcha++;
    }

    public void bajarMarcha() {
        if (!automatico && marcha > 0)
            marcha--;
    }

    @Override
    public String toString() {

        String automa = automatico ? " Automatico " : "Manual";

        return "marca: " + marca + " modelo: " + modelo +
                " color: " + color + " consumo actual "
                + consumo + " marcha actual: " + marcha +
                " tipo marchas: " + automa +" número de marchas: " + numMarchas;
    }
}
