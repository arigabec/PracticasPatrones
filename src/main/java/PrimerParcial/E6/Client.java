package PrimerParcial.E6;

public class Client {
    public static void main(String[] args){
        String msg = "Como administrador Quiero generar un reporte diario Para evaluar las ganancias";
        System.out.println("Mensaje recibido: " + msg);
        Interpreter parser = new Interpreter(msg);
        System.out.println("Mensaje interpretado: " + parser.evaluateMsg());
    }
}
