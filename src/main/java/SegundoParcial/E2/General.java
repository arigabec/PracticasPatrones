package SegundoParcial.E2;

public class General implements IMando {
    private IMando next;

    @Override
    public void setNext(IMando handler) {
        next = handler;
    }

    @Override
    public void criteriaHandler(String orden) {
        if(orden.equals("Entrevistas")) {
            System.out.println("El general esta llevando a cabo las entrevistas.");
        } else {
            next.criteriaHandler(orden);
        }
    }

    @Override
    public IMando next() {
        return next;
    }
}
