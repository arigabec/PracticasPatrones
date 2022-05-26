package PrimerParcial.E1;

public class Ventanilla {
    private Cajero cajero;

    public Ventanilla(Cajero person) {
        this.cajero = person;
    }

    public void pagarMatricula(int monto){
        Sistema.getInstance().recibirDinero(monto);
    }

    public void iniciarSesionCajero(){
        Sistema.getInstance().iniciarSesion(cajero.getNombre(), cajero.getCodigo());
    }

    public void mostrarDinero(){
        Sistema.getInstance().mostrarMontoActual();
    }
}
