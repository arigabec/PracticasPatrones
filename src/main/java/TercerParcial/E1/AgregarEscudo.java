package TercerParcial.E1;

import java.util.Random;

public class AgregarEscudo extends Habilidades {

    public AgregarEscudo(IJuego juego) {
        super(juego);
    }

    @Override
    public void agregarHabilidad(Personaje personaje){
        // Cuando se agrega un escudo sus puntos de defensa crecen un 35% y su porcentaje de
        //armadura crece en un 10%.
        System.out.println("Añadiendo escudo al personaje!");
        double nuevaDefensa = personaje.getPuntosDefensa() + 35;
        personaje.setPuntosDefensa(nuevaDefensa);
        double nuevaArmadura = personaje.getPorcentajeArmadura()+ 10;
        personaje.setPorcentajeArmadura(nuevaArmadura);
        personaje.showInfo();
    }
}
