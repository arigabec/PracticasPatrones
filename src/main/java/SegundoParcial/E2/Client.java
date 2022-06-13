package SegundoParcial.E2;

public class Client {
    public static void main(String[] args){
        Mando mando = new Mando();
        mando.criteriaHandler("Entrevistas");
        mando.criteriaHandler("Disciplina");
        mando.criteriaHandler("Desbloqueos");
        mando.criteriaHandler("Manifestaciones");
        mando.criteriaHandler("Limpieza");
    }
}
