package SegundoParcial.E1;

public class Client {
    public static void main(String[] args){
        Versionador caretaker = new Versionador();
        Revision originator = new Revision();
        Estudiante e1 = new Estudiante("Luis", "123" );
        Tesis tesis;

        tesis = new Tesis("Esta es la primera version de la tesis", e1);
        originator.setMemento(tesis);
        caretaker.addMemento("Version1", originator.createMemento());

        tesis = new Tesis("Corrigiendo la primera version de la tesis", e1);
        originator.setMemento(tesis);
        caretaker.addMemento("Version2", originator.createMemento());

        tesis = new Tesis("Esta es una nueva correccion", e1);
        originator.setMemento(tesis);
        caretaker.addMemento("Version3", originator.createMemento());

        tesis = new Tesis("Seguimos trabajando en la tesis", e1);
        originator.setMemento(tesis);
        caretaker.addMemento("Version4", originator.createMemento());

        tesis = new Tesis("Avance nuevo de la tesis", e1);
        originator.setMemento(tesis);
        caretaker.addMemento("Version5", originator.createMemento());

        //tesis = originator.restoreMemento(caretaker.getMemento("Version1"));
        //tesis = originator.restoreMemento(caretaker.getMemento("Version2"));
        tesis = originator.restoreMemento(caretaker.getMemento("Version3"));
        //tesis = originator.restoreMemento(caretaker.getMemento("Version4"));
        //tesis = originator.restoreMemento(caretaker.getMemento("Version5"));

        tesis.showInfo();
    }
}
