package PrimerParcial.E4;

public class Client {
    public static void main(String[] args) {
        Estudiante luis = new Estudiante();
        luis.setNombre("Luis Mendez");
        luis.setCi("34521678");
        IMateria inscripcion1 = FactoryMateria.make("Matematicas");
        inscripcion1.registrarEstudiante(luis);
        inscripcion1.inscribirse();

        Estudiante armando = new Estudiante();
        armando.setNombre("Armando Rojas");
        armando.setCi("5698413");
        IMateria inscripcion2 = FactoryMateria.make("Matematicas");
        inscripcion2.registrarEstudiante(armando);
        inscripcion2.inscribirse();

        Estudiante carla = new Estudiante();
        carla.setNombre("Carla Ballón");
        carla.setCi("69874235");
        IMateria inscripcion3 = FactoryMateria.make("Historia");
        inscripcion3.registrarEstudiante(carla);
        inscripcion3.inscribirse();

        Estudiante camila = new Estudiante();
        camila.setNombre("Camila Escobar");
        camila.setCi("36521478");
        IMateria inscripcion4 = FactoryMateria.make("Lenguaje");
        inscripcion4.registrarEstudiante(camila);
        inscripcion4.inscribirse();

        Estudiante andres = new Estudiante();
        andres.setNombre("Andres Ramirez");
        andres.setCi("8564213");
        IMateria inscripcion5 = FactoryMateria.make("Ingles");
        inscripcion5.registrarEstudiante(andres);
        inscripcion5.inscribirse();
    }
}
