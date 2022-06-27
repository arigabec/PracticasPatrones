package TercerParcial.E3;

public class Client {
    public static void main(String[] args){
        CompositeElementos folder1 = new CompositeElementos("Folder1");
        folder1.addElement(new Archivo("Archivo1").setNroPalabras(32));
        folder1.addElement(new Archivo("Archivo2").setNroPalabras(18));
        folder1.addElement(new Archivo("Archivo3").setNroPalabras(21));

        CompositeElementos folder2 = new CompositeElementos("Folder2");
        folder2.addElement(new Archivo("Archivo4").setNroPalabras(12));
        folder2.addElement(new Archivo("Archivo5").setNroPalabras(25));
        folder2.addElement(new Archivo("Archivo6").setNroPalabras(31));

        CompositeElementos unidad1 = new CompositeElementos("Unidad1");
        unidad1.addElement(folder1);
        unidad1.addElement(folder2);

        unidad1.countWords();
    }
}
