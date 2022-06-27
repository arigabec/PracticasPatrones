package TercerParcial.E3;

public abstract class Component {
    private int nroPalabras;
    private String tipoArchivo;

    public Component(String tipoArchivo) {
        this.tipoArchivo = tipoArchivo;
    }

    public int getNroPalabras() {
        return nroPalabras;
    }

    public Component setNroPalabras(int nroPalabras) {
        this.nroPalabras = nroPalabras;
        return this;
    }

    public String getTipoArchivo() {
        return tipoArchivo;
    }

    public Component setTipoArchivo(String tipoArchivo) {
        this.tipoArchivo = tipoArchivo;
        return this;
    }

    public abstract void countWords();
    public abstract void addElement(Component component);
    public abstract void removeElement(Component component);
}
