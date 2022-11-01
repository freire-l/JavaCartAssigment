package org.luisf.model.products;

public class Dairy extends Product{
    private int quantity;
    private int proteins;

    public Dairy(String name, Double price, int quantity, int proteins) {
        super(name, price);
        this.quantity = quantity;
        this.proteins = proteins;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getProteins() {
        return proteins;
    }

    @Override
    public String toString() {
        return "Dairy{" +
                "quantity=" + quantity +
                ", proteins=" + proteins +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
