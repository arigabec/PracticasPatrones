package TercerParcial.E7;

public class ServicioTecnico implements IEmpresa {
    private NotificacionPago notificacion;

    public ServicioTecnico(){
        notificacion = new NotificacionPago();
        notificacion.subscriptionOwners(new Owners("Presidente"));
        notificacion.subscriptionOwners(new Owners("Vicepresidente"));
        notificacion.subscriptionOwners(new Owners("Contabilidad"));
    }

    @Override
    public void repairLaptop(Laptop laptop) {
        System.out.println("> Reparando laptop!");
        laptop.showInfo();
        pagar(laptop.getPrice());
        notificacion.sendNotification();

    }

    @Override
    public void repairPC(PC pc) {
        System.out.println("> Reparando PC!");
        pc.showInfo();
        pagar(pc.getPrice());
        notificacion.sendNotification();
    }

    @Override
    public void repairTablet(Tablet tablet) {
        System.out.println("> Reparando tablet!");
        tablet.showInfo();
        pagar(tablet.getPrice());
        notificacion.sendNotification();
    }

    public void pagar(int cantidad){
        Account.getInstance().pagar(cantidad);
    }
}
