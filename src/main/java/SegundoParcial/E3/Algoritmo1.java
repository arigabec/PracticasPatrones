package SegundoParcial.E3;

import java.util.List;

public class Algoritmo1 implements IAlgoritmo {

    @Override
    public void buscarCelular(int precio, String modelo, List<Celular> celulares){
        for (Celular c : celulares) {
            if(c.getModelo().equals(modelo)){
                System.out.println("BUSCANDO POR MODELO > " + modelo);
                c.showInfo();
            }
            if (c.getPrecio() == precio) {
                System.out.println("BUSCANDO POR PRECIO > " + precio);
                c.showInfo();
            }
        }
    }
}
