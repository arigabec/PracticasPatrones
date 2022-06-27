package TercerParcial.E4;

public class Client {
    public static void main(String[] args){
        IServidor proxy = new Proxy();

        proxy.userLogin(new User("andres13", 13));
        proxy.userLogin(new User("carla24", 24));
        proxy.userLogin(new User("luis21", 21));
        proxy.userLogin(new User("andrea46", 46));

        proxy.atenderUsuarios();
    }
}
