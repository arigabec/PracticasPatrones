package TercerParcial.E2;

public class Aplicacion implements IPago {
    
    @Override
    public void pagar(int monto) {
        System.out.println("<<< Pagando por la aplicacion de la empresa >>>");
        double descuento = monto - monto*0.1;
        System.out.println("Precio total: " + monto + " Bs");
        System.out.println("Precio con descuento: " + descuento + " Bs");
        System.out.println();
    }
}
