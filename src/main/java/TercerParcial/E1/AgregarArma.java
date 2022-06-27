package TercerParcial.E1;

import java.util.Random;

public class AgregarArma extends Habilidades {
    private String[] armas = {"Espada", "Hacha", "Escopeta"};

    public AgregarArma(IJuego juego) {
        super(juego);
    }

    @Override
    public void agregarHabilidad(Personaje personaje){
        // Cuando se le agrega al personaje un arma (espada, hacha, escopeta) sus puntos de
        //ataque suben en un 30% y su nivel se incrementa al doble.
        System.out.println("Añadiendo arma al personaje!");
        int nroArma = new Random().nextInt(3);
        personaje.setArmas(armas[nroArma]);
        double nuevoAtaque = personaje.getPuntosAtaque() + 30;
        personaje.setPuntosAtaque(nuevoAtaque);
        int nuevoNivel = personaje.getNivel() * 2;
        personaje.setNivel(nuevoNivel);
        personaje.showInfo();
    }
}
