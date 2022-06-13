package SegundoParcial.E3;

import java.util.Iterator;
import java.util.List;

public class Algoritmo2 implements IAlgoritmo {

    @Override
    public void buscarCelular(int precio, String modelo, List<Celular> celulares){
        Iterator<Celular> iterator = celulares.iterator();
        while (iterator.hasNext()) {
            Celular c = iterator.next();
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
