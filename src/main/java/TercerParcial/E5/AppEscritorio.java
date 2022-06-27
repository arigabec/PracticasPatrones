package TercerParcial.E5;

public class AppEscritorio implements IEmpresa2 {
    private String name;
    private String tipo;

    public AppEscritorio(String name) {
        this.name = name;
        tipo = "Escritorio";
    }

    @Override
    public void iniciarSesion() {
        System.out.println("<<< DESARROLLANDO INICIO DE SESION >>>");
        System.out.println("Nombre de la app: " + name);
        System.out.println("Tipo de app: " + tipo);
        System.out.println();
    }

    @Override
    public void cerrarSesion() {
        System.out.println("<<< DESARROLLANDO CIERRE DE SESION >>>");
        System.out.println("Nombre de la app: " + name);
        System.out.println("Tipo de app: " + tipo);
        System.out.println();
    }

    @Override
    public void generarDatos() {
        System.out.println("<<< GENERANDO DATOS DE LA APP >>>");
        System.out.println("Nombre de la app: " + name);
        System.out.println("Tipo de app: " + tipo);
        System.out.println();
    }
}
