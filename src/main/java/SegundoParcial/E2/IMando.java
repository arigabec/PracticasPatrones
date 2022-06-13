package SegundoParcial.E2;

public interface IMando {
    void setNext(IMando handler);
    void criteriaHandler(String orden);
    IMando next();
}
