package SegundoParcial.E6;

public class Empleado extends Usuario {
    private int nroUsuario;

    public Empleado(Mediator mediator) {
        super(mediator);
    }

    public int getNroUsuario() {
        return nroUsuario;
    }

    public void setNroUsuario(int nroUsuario) {
        this.nroUsuario = nroUsuario;
    }

    @Override
    public void send(String msg, String tipo, Empleado receiver) {
        mediator.send(msg, tipo, receiver, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println("Mensaje recibido por el usuario " + nroUsuario + " > " + msg);
    }
}
