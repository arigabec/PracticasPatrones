package TercerParcial.E6;

public class Celular implements IDispositivo {
    private String modelo;
    private int memoria;

    public Celular(String modelo, int memoria) {
        this.modelo = modelo;
        this.memoria = memoria;
    }

    @Override
    public void showInfo() {
        System.out.println("<<< INFO DEL CELULAR >>>");
        System.out.println("Modelo: " + modelo);
        System.out.println("Memoria: " + memoria + " GB");
        System.out.println();
    }
}
