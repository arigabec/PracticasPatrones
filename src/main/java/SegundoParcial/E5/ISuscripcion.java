package SegundoParcial.E5;

public interface ISuscripcion {
    void attach(IDesarrollador observer);

    void detach(IDesarrollador observer);

    void notifyObservers(String msg);
}
