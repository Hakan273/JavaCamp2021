package classesWithAttributes;

public class Main {

    public static void main(String[] args) {

        Product product = new Product(1,"Laptop","Asus Laptop",5000,3);

        System.out.println(product.getName());

        ProductManager productmanager = new ProductManager();
        productmanager.add(product);

        System.out.println(product.getCode());

    }
}
