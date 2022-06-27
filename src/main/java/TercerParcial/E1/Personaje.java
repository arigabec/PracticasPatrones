package TercerParcial.E1;

public class Personaje {
    private String nombre;
    private int nivel;
    private String armas;
    private double porcentajeArmadura;
    private double puntosAtaque;
    private double puntosDefensa;
    private double puntosVida;

    public Personaje(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String isArmas() {
        return armas;
    }

    public void setArmas(String armas) {
        this.armas = armas;
    }

    public double getPorcentajeArmadura() {
        return porcentajeArmadura;
    }

    public void setPorcentajeArmadura(double porcentajeArmadura) {
        this.porcentajeArmadura = porcentajeArmadura;
    }

    public double getPuntosAtaque() {
        return puntosAtaque;
    }

    public void setPuntosAtaque(double puntosAtaque) {
        this.puntosAtaque = puntosAtaque;
    }

    public double getPuntosDefensa() {
        return puntosDefensa;
    }

    public void setPuntosDefensa(double puntosDefensa) {
        this.puntosDefensa = puntosDefensa;
    }

    public double getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(double puntosVida) {
        this.puntosVida = puntosVida;
    }

    public void showInfo(){
        System.out.println("<<< INFO DEL PERSONAJE >>>");
        System.out.println("Nombre: " + nombre);
        System.out.println("Nivel: " + nivel);
        System.out.println("Armas: " + armas);
        System.out.println("Porcentaje de armadura: " + porcentajeArmadura);
        System.out.println("Puntos de ataque: " + puntosAtaque);
        System.out.println("Puntos de defensa: " + puntosDefensa);
        System.out.println("Puntos de vida: " + puntosVida);
        System.out.println();
    }
}
