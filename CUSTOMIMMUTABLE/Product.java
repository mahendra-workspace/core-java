package CUSTOMIMMUTABLE;

import java.util.ArrayList;
import java.util.List;

public final class Product {
    private final String id;
    private final String name;
    private final double price;
    private final List<String> tags;

    public Product(String id, String name, double price, List<String> tags){
        this.id = id;
        this.name = name;
        this.price = price;
        this.tags = List.copyOf(tags);
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public List<String> getTags(){
        return tags;
    }

    public static void main(String[] args) {
        List<String> tags = new ArrayList<>();
        tags.add("Electronics");
        tags.add("Mobile");

        Product product1 = new Product("p001", "smartphone", 24000, tags);

        System.out.println("Product ID: " + product1.getId());
        System.out.println("Product Name: "+ product1.getName());
        System.out.println("Product Price: "+ product1.getPrice());
        System.out.println("Product Tags: "+ product1.getTags());

        List<Product> products = new ArrayList<>();
        products.add(product1);
    }
}
