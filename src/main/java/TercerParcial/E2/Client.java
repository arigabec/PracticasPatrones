package TercerParcial.E2;

public class Client {
    public static void main(String[] args){
        IPago efectivo = new Efectivo();

        InstalacionAgua instalacion1 = new InstalacionAgua(300);
        instalacion1.setPago(efectivo);
        instalacion1.pagarInstalacion();

        IPago transferencia = new Transferencia();

        InstalacionAlcantarillado instalacion2 = new InstalacionAlcantarillado(450);
        instalacion2.setPago(transferencia);
        instalacion2.pagarInstalacion();

        IPago tigoMoney = new TigoMoney();

        InstalacionElectrica instalacion3 = new InstalacionElectrica(500);
        instalacion3.setPago(tigoMoney);
        instalacion3.pagarInstalacion();

        IPago app = new Aplicacion();

        instalacion3.setPago(app);
        instalacion3.pagarInstalacion();
    }
}
