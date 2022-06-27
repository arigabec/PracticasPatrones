package TercerParcial.E7;

public class Client {
    public static void main(String[] args){
        ServicioTecnico servicio = new ServicioTecnico();

        Thread hilo1 = new Thread(new Runnable() {
            @Override
            public void run() {
                servicio.repairLaptop(new Laptop("Small", 250));
            }
        });

        hilo1.start();

        Thread hilo2 = new Thread(new Runnable() {
            @Override
            public void run() {
                servicio.repairTablet(new Tablet("Big", 200));
            }
        });

        hilo2.start();

        Thread hilo3 = new Thread(new Runnable() {
            @Override
            public void run() {
                servicio.repairPC(new PC("Medium", 500));
            }
        });

        hilo3.start();
    }
}
