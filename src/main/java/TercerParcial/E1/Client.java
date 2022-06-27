package TercerParcial.E1;

public class Client {
    public static void main (String []args){
        Personaje p1 = new Personaje("Arturo el grande");

        IJuego warcraft = new Warcraft();
        warcraft.crearPersonaje(p1);

        warcraft = new AgregarArma(warcraft);
        warcraft.agregarHabilidad(p1);

        warcraft = new AgregarEscudo(warcraft);
        warcraft.agregarHabilidad(p1);

        warcraft = new AgregarCuracion(warcraft);
        warcraft.agregarHabilidad(p1);

        warcraft = new AgregarArma(warcraft);
        warcraft.agregarHabilidad(p1);
    }
}
