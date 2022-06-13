package SegundoParcial.E2;

public class Cabo implements IMando {
    private IMando next;

    @Override
    public void setNext(IMando handler) {
        next = handler;
    }

    @Override
    public void criteriaHandler(String orden) {
        if(orden.equals("Limpieza")) {
            System.out.println("El cabo se esta haciendo cargo de la limpieza.");
        } else {
            next.criteriaHandler(orden);
        }
    }

    @Override
    public IMando next() {
        return next;
    }
}
