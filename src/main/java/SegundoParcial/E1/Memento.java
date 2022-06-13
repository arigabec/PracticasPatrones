package SegundoParcial.E1;

public class Memento {
    private Tesis state;

    public Memento(Tesis tesis) {
        state = tesis;
    }

    public Tesis getState(){
        return state;
    }
}
