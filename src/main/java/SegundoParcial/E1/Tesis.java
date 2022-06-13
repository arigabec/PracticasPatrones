package SegundoParcial.E1;

public class Tesis {
    private String descripcion;
    private Estudiante estudiante;

    public Tesis(String descripcion, Estudiante estudiante) {
        this.descripcion = descripcion;
        this.estudiante = estudiante;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public void showInfo() {
        System.out.println("- " + descripcion);
    }
}
