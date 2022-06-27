package TercerParcial.E6;

public class Client {
    public static void main(String[] args){
        Aplicacion aplicacion = new Aplicacion();

        Celular celular = new Celular("iPhone 13", 128);
        Computadora computadora = new Computadora("HP", 8);
        Televisor televisor = new Televisor("LG Prime", 24);

        aplicacion.visitCelular(celular);
        aplicacion.visitComputadora(computadora);
        aplicacion.visitTelevisor(televisor);
    }
}
