package SegundoParcial.E6;

public interface Mediator {
    void send(String msg, String tipo, Empleado receiver, Empleado sender);
}
