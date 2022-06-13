package SegundoParcial.E5;

public class Desarrollador implements IDesarrollador {
    private int nroDesarrollador;

    public Desarrollador(int nroDesarrollador) {
        this.nroDesarrollador = nroDesarrollador;
    }

    @Override
    public void update(String msg) {
        System.out.println("El desarrollador " + nroDesarrollador + " tiene una notificacion > " + msg);
    }
}
