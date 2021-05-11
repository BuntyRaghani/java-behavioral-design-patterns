package com.example.iterator.v2;

public class Application {

    public static void main(String[] args) {

        ProductCollection productCollection = new ProductCollection();
        productCollection.add(new Product(1, "Test Product A"));
        productCollection.add(new Product(2, "Test Product B"));
        productCollection.add(new Product(3, "Test Product C"));
        productCollection.add(new Product(4, "Test Product D"));
        productCollection.add(new Product(5, "Test Product E"));

        // Printing products using list iterator
        System.out.println("Printing Products Using List Iterator: ");
        Iterator listIterator = productCollection.createIterator();
        while (listIterator.hasNext()) {
            Product product = listIterator.current();
            System.out.println(product);
            listIterator.next();
        }
    }
}
