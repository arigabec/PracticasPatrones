package SegundoParcial.E6;

public abstract class Usuario {
    protected Mediator mediator;

    public Usuario(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void send(String msg, String tipo, Empleado receiver);
    public abstract void receive(String msg);
}
