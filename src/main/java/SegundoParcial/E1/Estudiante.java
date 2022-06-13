package SegundoParcial.E1;

public class Estudiante {
    private String name;
    private String ci;

    public Estudiante(String name, String ci) {
        this.name = name;
        this.ci = ci;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }
}
