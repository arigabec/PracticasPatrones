package TercerParcial.E6;

public class Televisor implements IDispositivo {
    private String modelo;
    private int size;

    public Televisor(String modelo, int size) {
        this.modelo = modelo;
        this.size = size;
    }

    @Override
    public void showInfo() {
        System.out.println("<<< INFO DEL TELEVISOR >>>");
        System.out.println("Modelo: " + modelo);
        System.out.println("Tamaño: " + size + " pulgadas");
        System.out.println();
    }
}
