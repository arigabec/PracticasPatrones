package SegundoParcial.E5;

public class Client {
    public static void main(String[] args){
        Github github = new Github();
        Git git = new Git();
        Codigo codigo;

        Desarrollador desarrollador1 = new Desarrollador(1);
        Desarrollador desarrollador2 = new Desarrollador(2);
        Desarrollador desarrollador3 = new Desarrollador(3);

        git.attach(desarrollador1);
        git.attach(desarrollador2);
        git.attach(desarrollador3);
        git.suscribir();

        codigo = new Codigo("public class ...","Inicio de codigo");
        codigo.setLineasCodigo("public interface ...");
        git.setCommit(codigo);
        github.createCommit("1234abc", git.createCommit());
        codigo = new Codigo("Class Person","add persona");
        codigo = new Codigo("Class Estudiante","add estudiante");
        git.setCommit(codigo);
        github.createCommit("4567def", git.createCommit());
        codigo = new Codigo("Class Docente","add docente");
        codigo = new Codigo("Class Product","add producto");

        codigo = git.restoreCommit(github.getCommit("1234abc"));
        git.sendNotification("Se restauro un commit");
        codigo.showInfo();
    }
}
