package TercerParcial.E1;

public class Habilidades implements IJuego {
    protected IJuego juego;

    public Habilidades(IJuego juego) {
        this.juego = juego;
    }

    @Override
    public void crearPersonaje(Personaje personaje) {
        personaje.showInfo();
    }

    @Override
    public void agregarHabilidad(Personaje personaje) {
        //TODO
    }
}
