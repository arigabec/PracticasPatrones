package SegundoParcial.E1;

public class Revision {
    private Tesis state;

    public void setMemento(Tesis state){
        System.out.println("Guardando version de la tesis > " + state.getDescripcion());
        this.state = state;
    }

    public Memento createMemento(){
        return new Memento(state);
    }

    public Tesis restoreMemento(Memento m){
        this.state = m.getState();
        System.out.println("RECUPERANDO VERSION: ");
        return state;
    }
}
