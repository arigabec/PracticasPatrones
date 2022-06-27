package TercerParcial.E7;

public class Owners implements IUser {
    String cargo;

    public Owners(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public void update(String msg) {
        System.out.println("Nueva notificacion para: " + cargo);
        System.out.println(msg);
    }
}
