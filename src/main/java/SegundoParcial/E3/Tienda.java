package SegundoParcial.E3;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    String name;
    List<Celular> listaCelulares = new ArrayList<>();
    IAlgoritmo strategy;

    public Tienda(String name) {
        this.name = name;
    }

    public void addCelular(Celular celular){
        listaCelulares.add(celular);
    }

    public List<Celular> getListaCelulares() {
        return listaCelulares;
    }

    public void setListaCelulares(List<Celular> listaCelulares) {
        this.listaCelulares = listaCelulares;
    }

    public void setStrategy(IAlgoritmo strategy) {
        this.strategy = strategy;
    }

    public void buscarCelular(int precio, String modelo){
        strategy.buscarCelular(precio, modelo, listaCelulares);
    }
}
