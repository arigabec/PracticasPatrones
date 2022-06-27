package TercerParcial.E5;

public class Client {
    public static void main(String[] args){
        IEmpresa1 android = new Android("My Android App");
        android.login();

        IEmpresa1 ios = new IOS("My IOS App");
        ios.logout();

        IEmpresa1 windowsP = new Android("My WindowsP App");
        windowsP.reporte();

        IEmpresa1 web = new Artefacto(new AppWeb("My Web App"));
        web.login();

        IEmpresa1 escritorio = new Artefacto(new AppEscritorio("My Desk App"));
        escritorio.logout();
    }
}
