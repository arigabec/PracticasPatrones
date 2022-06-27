package TercerParcial.E7;

public class Account {
    private static Account account;
    private int saldo;

    private Account(){
        saldo = 0;
        System.out.println();
        System.out.println("Iniciar Saldo: " + saldo);
    }

    private synchronized static void  multiThreadControl(){
        if (account == null)
            account = new Account();
    }

    public static Account getInstance(){
        if(account == null)
            multiThreadControl();
        return account;
    }

    public synchronized void pagar(int cantidad){
        saldo = saldo + cantidad;
        System.out.println("Pagando " + cantidad + " Bs por la reparacion");
        System.out.println("Saldo actual: " + saldo);
        System.out.println();
    }
}
