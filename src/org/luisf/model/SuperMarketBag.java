package org.luisf.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SuperMarketBag<T> implements Iterable<T>{

    private List<T> products;
    private int max;

    public SuperMarketBag(int max) {
        this.max = max;
        this.products = new ArrayList<>();
    }

    public void addProduct(T product){
        if(products.size() <= max)
            this.products.add(product);
        else
            throw new RuntimeException("Bag Full");
    }

    public List<T> getProducts(){
        return products;
    }

    @Override
    public Iterator<T> iterator() {
        return this.products.iterator();
    }
}
