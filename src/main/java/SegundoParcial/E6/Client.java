package SegundoParcial.E6;

public class Client {
    public static void main(String[] args){
        ChatEmpresarial mediator = new ChatEmpresarial();
        Empleado empleado1 = new Empleado(mediator);
        empleado1.setNroUsuario(1);

        Empleado empleado2 = new Empleado(mediator);
        empleado2.setNroUsuario(2);

        Empleado empleado3 = new Empleado(mediator);
        empleado3.setNroUsuario(3);

        Empleado empleado4 = new Empleado(mediator);
        empleado4.setNroUsuario(4);

        mediator.addChat(empleado1);
        mediator.addChat(empleado2);
        mediator.addChat(empleado3);
        mediator.addChat(empleado4);

        empleado1.send("Estoy realizando un backup de tu trabajo, empleado 2!", "directo", empleado2);
        empleado4.send("A todos los empleados de la compañia, hagan su trabajo!", "grupal", null);
    }
}
