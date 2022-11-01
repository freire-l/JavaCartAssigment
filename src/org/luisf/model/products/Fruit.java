package org.luisf.model.products;

public class Fruit extends Product{
    private double weight;
    private String color;

    public Fruit(String name, Double price, double weight, String color) {
        super(name, price);
        this.weight = weight;
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "weight=" + weight +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
