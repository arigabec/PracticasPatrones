package TercerParcial.E5;

public class WindowsPhone implements IEmpresa1 {
    private String name;
    private String OS;

    public WindowsPhone(String name) {
        this.name = name;
        OS = "WindowsPhone";
    }

    @Override
    public void login() {
        System.out.println("<<< DESARROLLANDO LOGIN >>>");
        System.out.println("Nombre de la app: " + name);
        System.out.println("Sistema operativo: " + OS);
        System.out.println();
    }

    @Override
    public void logout() {
        System.out.println("<<< DESARROLLANDO LOGOUT >>>");
        System.out.println("Nombre de la app: " + name);
        System.out.println("Sistema operativo: " + OS);
        System.out.println();
    }

    @Override
    public void reporte() {
        System.out.println("<<< GENERANDO REPORTE >>>");
        System.out.println("Nombre de la app: " + name);
        System.out.println("Sistema operativo: " + OS);
        System.out.println();
    }
}
