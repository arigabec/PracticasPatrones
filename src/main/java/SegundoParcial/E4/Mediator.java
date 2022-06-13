package SegundoParcial.E4;

public interface Mediator {
    void send(String msg, String tipo, Cliente receiver, Cliente sender);
}
