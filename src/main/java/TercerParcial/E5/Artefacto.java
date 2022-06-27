package TercerParcial.E5;

public class Artefacto implements IEmpresa1 {
    private IEmpresa2 artefacto;

    public Artefacto(IEmpresa2 artefacto) {
        this.artefacto = artefacto;
    }

    @Override
    public void login() {
        artefacto.iniciarSesion();
    }

    @Override
    public void logout() {
        artefacto.cerrarSesion();
    }

    @Override
    public void reporte() {
        artefacto.generarDatos();
    }
}
