package SegundoParcial.E7;

public class Client {
    public static void main(String[]args) {
        ClienteBanco cliente = new ClienteBanco("Carlos Arduz");
        Banco banco = new Banco();

        // El primer pago siempre lo recibira el cahero, ya que inicialmente el monto pagado es 0
        banco.criteriaHandler(cliente, 500);
        banco.criteriaHandler(cliente, 300);
        banco.criteriaHandler(cliente, 200);

        // El ultimo pago es la "transferencia" del 100% al supervisor
        banco.criteriaHandler(cliente, 0);
    }
}