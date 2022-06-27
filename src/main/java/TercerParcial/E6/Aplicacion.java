package TercerParcial.E6;

import java.util.Random;

public class Aplicacion implements IApp {

    @Override
    public void visitCelular(Celular celular) {
        System.out.println("Sugerencia > debería aplicar un mantenimiento preventivo al celular!");
        celular.showInfo();
    }

    @Override
    public void visitComputadora(Computadora computadora) {
        if(new Random().nextInt(20) % 2 == 0){
            System.out.println("Sugerencia > debería aplicar un mantenimiento preventivo a la computadora!");
        } else {
            System.out.println("Sugerencia > debería aplicar un mantenimiento correctivo a la computadora!");
        }
        computadora.showInfo();
    }

    @Override
    public void visitTelevisor(Televisor televisor) {
        System.out.println("Sugerencia > ver informacion del televisor!");
        televisor.showInfo();
    }
}
