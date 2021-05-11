package com.example.iterator.v2;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
    private List<Product> productList = new ArrayList<>();

    public void add(Product product) {
        productList.add(product);
    }

    public Iterator createIterator() {
        return new ListIterator(this);
    }

    public class ListIterator implements Iterator {

        private ProductCollection productCollection;
        private int index;

        public ListIterator(ProductCollection productCollection) {
            this.productCollection = productCollection;
        }

        @Override
        public boolean hasNext() {
            return (index < productCollection.productList.size());
        }

        @Override
        public Product current() {
            return productCollection.productList.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }
}
