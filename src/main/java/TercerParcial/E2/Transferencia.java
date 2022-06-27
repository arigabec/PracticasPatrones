package TercerParcial.E2;

public class Transferencia implements IPago {

    @Override
    public void pagar(int monto) {
        System.out.println("<<< Pagando mediante transferencia bancaria >>>");
        double descuento = monto - monto*0.05;
        System.out.println("Precio total: " + monto + " Bs");
        System.out.println("Precio con descuento: " + descuento + " Bs");
        System.out.println();
    }
}
