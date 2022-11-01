package org.luisf.model;

import org.luisf.model.products.*;
import org.luisf.model.SuperMarketBag;

public class SuperMarketKart {

    public static void main(String[] args) {
        SuperMarketBag<Dairy> dairyBag = new SuperMarketBag<>(2);
        dairyBag.addProduct(new Dairy("Milk", 4.5, 34, 65));
        dairyBag.addProduct(new Dairy("Cheese", 8.5, 15, 23));
        
        SuperMarketBag<Fruit> fruitBag = new SuperMarketBag<>(2);
        fruitBag.addProduct(new Fruit("melon", 3.60, 10, "orange"));
        fruitBag.addProduct(new Fruit("apple", 1.80, 2, "Red"));


        for (Dairy a:dairyBag) {
            System.out.println("a = " + a);
        }

    }


}
