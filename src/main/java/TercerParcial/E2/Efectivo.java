package TercerParcial.E2;

public class Efectivo implements IPago {

    @Override
    public void pagar(int monto) {
        System.out.println("<<< Pagando en efectivo >>>");
        System.out.println("Precio total: " + monto);
        System.out.println();
    }
}
