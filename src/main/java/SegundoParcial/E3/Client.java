package SegundoParcial.E3;

public class Client {
    public static void main(String[] args){
        Tienda tiendaCelulares = new Tienda("La tiendita");
        tiendaCelulares.addCelular(new Celular("iPhone SE", "Apple", "Alta", 600));
        tiendaCelulares.addCelular(new Celular("iPhone SE", "Apple", "Alta", 650));
        tiendaCelulares.addCelular(new Celular("iPhone 13", "Apple", "Alta", 1000));
        tiendaCelulares.addCelular(new Celular("Galaxy S21", "Samsung", "Alta", 700));
        tiendaCelulares.addCelular(new Celular("Galaxy S20", "Samsung", "Alta", 600));
        tiendaCelulares.addCelular(new Celular("Y9", "Huawei", "Media", 300));
        /* tiendaCelulares.addCelular(new Celular("Y9", "Huawei", "Media", 250));
        tiendaCelulares.addCelular(new Celular("Redmi Note 9", "Xiaomi", "Media", 300));
        tiendaCelulares.addCelular(new Celular("Galaxy Tab 9", "Samsung", "Alta", 550));
        tiendaCelulares.addCelular(new Celular("iPhone 8", "Apple", "Alta", 700));
        tiendaCelulares.addCelular(new Celular("P40", "Huawei", "Alta", 800));*/

        if (tiendaCelulares.getListaCelulares().size() < 10) {
            System.out.println("ALGORITMO 1");
            tiendaCelulares.setStrategy(new Algoritmo1());
        } else {
            System.out.println("ALGORITMO 2");
            tiendaCelulares.setStrategy(new Algoritmo2());
        }

        tiendaCelulares.buscarCelular(700, "Y9");
    }
}
