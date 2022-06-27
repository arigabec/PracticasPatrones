package TercerParcial.E7;

public class Laptop implements IComputadora {
    private String size;
    private int price;

    public Laptop(String size, int price) {
        this.size = size;
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void showInfo(){
        System.out.println("<<< INFO DE LA LAPTOP >>>");
        System.out.println("Tamaño: " + size);
        System.out.println("Precio reparacion: " + price);
    }
}
