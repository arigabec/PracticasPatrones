package PrimerParcial.E1;

public class Client {
    public static void main(String[] args){
        Cajero luis = new Cajero();
        luis.setNombre("Luis García");
        luis.setCodigo("LG1");

        Ventanilla ventanilla = new Ventanilla(luis);
        ventanilla.iniciarSesionCajero();
        ventanilla.mostrarDinero();

        // Primer pago de un estudiante
        ventanilla.pagarMatricula(500);

        // Segundo pago de un estudiante
        ventanilla.pagarMatricula(120);

        // Tercer pago de un estudiante
        ventanilla.pagarMatricula(500);

        // Cuarto pago de un estudiante
        ventanilla.pagarMatricula(300);

        // Quinto pago de un estudiante
        ventanilla.pagarMatricula(80);

        ventanilla.mostrarDinero();
    }
}
