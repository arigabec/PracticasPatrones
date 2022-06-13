package SegundoParcial.E2;

public class Coronel implements IMando {
    private IMando next;

    @Override
    public void setNext(IMando handler) {
        next = handler;
    }

    @Override
    public void criteriaHandler(String orden) {
        if(orden.equals("Desbloqueos") || orden.equals("Manifestaciones")) {
            System.out.println("El coronel se esta encargando de desbloquear las manifestaciones.");
        } else {
            next.criteriaHandler(orden);
        }
    }

    @Override
    public IMando next() {
        return next;
    }
}
