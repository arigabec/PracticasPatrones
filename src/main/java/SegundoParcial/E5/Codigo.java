package SegundoParcial.E5;

public class Codigo {
    private String lineasCodigo;
    private String comments;

    public Codigo(String lineasCodigo, String comments) {
        this.lineasCodigo = lineasCodigo;
        this.comments = comments;
    }

    public String getLineasCodigo() {
        return lineasCodigo;
    }

    public void setLineasCodigo(String lineasCodigo) {
        this.lineasCodigo = lineasCodigo;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }


    public void showInfo() {
        System.out.println("Codigo restaurado > " + lineasCodigo);
    }
}
