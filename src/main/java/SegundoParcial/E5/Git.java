package SegundoParcial.E5;

import java.util.ArrayList;
import java.util.List;

public class Git implements ISuscripcion {
    private Codigo state;
    private List<IDesarrollador> observers = new ArrayList<>();

    public void setCommit(Codigo state){
        this.state = state;
    }

    public Memento createCommit(){
        return new Memento(state);
    }

    public Codigo restoreCommit(Memento m){
        System.out.println("RESTAURANDO");
        this.state = m.getState();
        return this.state;
    }

    public void suscribir(){
        this.notifyObservers("Desarrollador suscrito");
    }

    public void sendNotification(String notificacion){
        notifyObservers(notificacion);
    }

    @Override
    public void attach(IDesarrollador observer) {
        observers.add(observer);
    }

    @Override
    public void detach(IDesarrollador observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String msg) {
        for (IDesarrollador obs : observers) {
            obs.update(msg);
        }
    }
}
