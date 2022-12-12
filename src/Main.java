public class Main {

    public static void main(String[] args) {
        Vehicle miIbiza = new Vehicle();
        Vehicle miBMW = new Vehicle("BMW", "i3", null,0);
        System.out.println(miIbiza.getConsumo());
        System.out.println(miIbiza.getMarca());
        System.out.println(miBMW.getModelo());

    }
}