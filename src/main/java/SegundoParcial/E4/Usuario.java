package SegundoParcial.E4;

public abstract class Usuario {
    protected Mediator mediator;

    public Usuario(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void send(String msg, String tipo, Cliente receiver);
    public abstract void receive(String msg);
}
