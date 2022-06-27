package TercerParcial.E1;

public class AgregarCuracion extends Habilidades {
    private String[] armas = {"Espada", "Hacha", "Escopeta"};

    public AgregarCuracion(IJuego juego) {
        super(juego);
    }

    @Override
    public void agregarHabilidad(Personaje personaje){
        // Cuando se agregan posiciones de curación sus puntos de regeneración suben aun 80%.
        System.out.println("Añadiendo puntos de curacion al personaje!");
        double nuevaVida = personaje.getPuntosVida() + 80;
        personaje.setPuntosDefensa(nuevaVida);
        personaje.showInfo();
    }
}
