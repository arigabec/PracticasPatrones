package SegundoParcial.E7;

public class Encargado implements IBanco {
    private IBanco next;

    @Override
    public void setNext(IBanco handler) {
        next = handler;
    }

    @Override
    public void criteriaHandler(ClienteBanco clienteBanco, int cantidad) {
        int saldoActual = Prestamo.getInstance().getPrestamo() - Prestamo.getInstance().getSaldo();
        if(saldoActual == Prestamo.getInstance().getPrestamo()){
            clienteBanco.pagarPrestamoCliente(cantidad);
            System.out.println("El encargado recibe el 100% del prestamo, y este esta completamente pagado");
            System.out.println();
        } else {
            next.criteriaHandler(clienteBanco, cantidad);
        }
    }

    @Override
    public IBanco next() {
        return next;
    }
}
