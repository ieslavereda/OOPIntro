public class Main {

    public static void main(String[] args) {
        Vehicle miIbiza = new Vehicle("Seat", "Ibiza","verde",8,false,5);
        Vehicle miBMW = new Vehicle("BMW", "i3", "azul",0,true);
        miIbiza.subirMarcha();
        miIbiza.subirMarcha();
        miBMW.subirMarcha();
        System.out.println(miIbiza.toString());
        System.out.println(miBMW.toString());

    }
}