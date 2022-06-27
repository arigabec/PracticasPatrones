package TercerParcial.E4;

public class Proxy implements IServidor {
    private IServidor servidor1;
    private IServidor servidor2;

    public Proxy() {
        System.out.println("<<< Iniciando proxy y servidores >>>");
        System.out.println();
        servidor1 = new Servidor1();
        servidor2 = new Servidor2();
    }

    public void userLogin(User user){
        if(user.getNumber() % 2 == 0){
            servidor1.userLogin(user);
        } else {
            servidor2.userLogin(user);
        }
    }

    @Override
    public void atenderUsuarios() {
        servidor1.atenderUsuarios();
        servidor2.atenderUsuarios();
    }
}
