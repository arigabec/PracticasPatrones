package TercerParcial.E2;

public class InstalacionAgua implements Instalacion {
    private IPago pago;
    private int precio;

    public InstalacionAgua(int precio) {
        this.precio = precio;
    }

    public IPago getPago() {
        return pago;
    }

    public void setPago(IPago pago) {
        this.pago = pago;
    }

    @Override
    public void pagarInstalacion() {
        System.out.println("Pagando por la instalacion de agua!");
        pago.pagar(precio);
    }
}
