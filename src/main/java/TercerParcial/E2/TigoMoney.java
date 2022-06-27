package TercerParcial.E2;

public class TigoMoney implements IPago {
    
    @Override
    public void pagar(int monto) {
        System.out.println("<<< Pagando por Tigo Money >>>");
        double descuento = monto - monto*0.02;
        System.out.println("Precio total: " + monto + " Bs");
        System.out.println("Precio con descuento: " + descuento + " Bs");
        System.out.println();
    }
}
