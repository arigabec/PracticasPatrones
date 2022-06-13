package SegundoParcial.E4;

public class Client {
    public static void main(String[] args){
        Whatsapp mediator = new Whatsapp();
        Cliente usuario1 = new Cliente(mediator);
        usuario1.setNroUsuario(1);

        Cliente usuario2 = new Cliente(mediator);
        usuario2.setNroUsuario(2);

        Cliente usuario3 = new Cliente(mediator);
        usuario3.setNroUsuario(3);

        Cliente usuario4 = new Cliente(mediator);
        usuario4.setNroUsuario(4);

        Cliente usuario5 = new Cliente(mediator);
        usuario5.setNroUsuario(5);

        Cliente usuario6 = new Cliente(mediator);
        usuario6.setNroUsuario(6);

        Cliente usuario7 = new Cliente(mediator);
        usuario7.setNroUsuario(7);

        Cliente usuario8 = new Cliente(mediator);
        usuario8.setNroUsuario(8);

        Cliente usuario9 = new Cliente(mediator);
        usuario9.setNroUsuario(9);

        Cliente usuario10 = new Cliente(mediator);
        usuario10.setNroUsuario(10);

        mediator.addChat(usuario1);
        mediator.addChat(usuario2);
        mediator.addChat(usuario3);
        mediator.addChat(usuario4);
        mediator.addChat(usuario5);
        mediator.addChat(usuario6);
        mediator.addChat(usuario7);
        mediator.addChat(usuario8);
        mediator.addChat(usuario9);
        mediator.addChat(usuario10);

        usuario1.send("Hola usuario 2!", "directo", usuario2);
        usuario5.send("Hola usuario 8!", "directo", usuario8);
        usuario10.send("Hola a todos los usuarios!", "grupal", null);
    }
}
