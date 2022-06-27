package TercerParcial.E2;

public class InstalacionElectrica implements Instalacion {
    private IPago pago;
    private int precio;

    public InstalacionElectrica(int precio) {
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
        System.out.println("Pagando por la instalacion electrica!");
        pago.pagar(precio);
    }
}
