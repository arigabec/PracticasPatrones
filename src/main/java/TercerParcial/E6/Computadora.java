package TercerParcial.E6;

public class Computadora implements IDispositivo {
    private String modelo;
    private int memoria;

    public Computadora(String modelo, int memoria) {
        this.modelo = modelo;
        this.memoria = memoria;
    }

    @Override
    public void showInfo() {
        System.out.println("<<< INFO DE LA COMPUTADORA >>>");
        System.out.println("Modelo: " + modelo);
        System.out.println("Memoria: " + memoria + " GB");
        System.out.println();
    }
}
