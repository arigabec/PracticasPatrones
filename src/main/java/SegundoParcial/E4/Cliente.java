package SegundoParcial.E4;

public class Cliente extends Usuario {
    private int nroUsuario;

    public Cliente(Mediator mediator) {
        super(mediator);
    }

    public int getNroUsuario() {
        return nroUsuario;
    }

    public void setNroUsuario(int nroUsuario) {
        this.nroUsuario = nroUsuario;
    }

    @Override
    public void send(String msg, String tipo, Cliente receiver) {
        mediator.send(msg, tipo, receiver, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println("Mensaje recibido por el usuario " + nroUsuario + " > " + msg);
    }
}
