package SegundoParcial.E2;

public class Teniente implements IMando {
    private IMando next;

    @Override
    public void setNext(IMando handler) {
        next = handler;
    }

    @Override
    public void criteriaHandler(String orden) {
        if(orden.equals("Disciplina")) {
            System.out.println("El teniente se está encargando de la disciplina.");
        } else {
            next.criteriaHandler(orden);
        }
    }

    @Override
    public IMando next() {
        return next;
    }
}
