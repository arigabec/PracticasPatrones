package SegundoParcial.E2;

public class Mando implements IMando {
    private IMando next;

    @Override
    public void setNext(IMando handler) {
        next = handler;
    }

    @Override
    public void criteriaHandler(String orden) {
        General resp1 = new General();
        this.setNext(resp1);

        Teniente resp2 = new Teniente();
        resp1.setNext(resp2);

        Coronel resp3 = new Coronel();
        resp2.setNext(resp3);

        Cabo resp4 = new Cabo();
        resp3.setNext(resp4);

        this.next.criteriaHandler(orden);
    }

    @Override
    public IMando next() {
        return next;
    }
}
