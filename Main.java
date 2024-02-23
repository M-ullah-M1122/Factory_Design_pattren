
package main;

// Product interface
interface Product {
    void doSomething();
}

// Concrete products
class ConcreteProduct1 implements Product {
    @Override
    public void doSomething() {
        System.out.println("Doing something in ConcreteProduct1");
    }
}

class ConcreteProduct2 implements Product {
    @Override
    public void doSomething() {
        System.out.println("Doing something in ConcreteProduct2");
    }
}

// Factory class
class ProductFactory {
    public Product createProduct(String type) {
        if (type.equals("Product1")) {
            return new ConcreteProduct1();
        } else if (type.equals("Product2")) {
            return new ConcreteProduct2();
        } else {
            throw new IllegalArgumentException("Invalid product type: " + type);
        }
    }
}

// Client code
public class Main {
    public static void main(String[] args) {
        ProductFactory factory = new ProductFactory();

        // Create Product1
        Product product1 = factory.createProduct("Product1");
        product1.doSomething();

        // Create Product2
        Product product2 = factory.createProduct("Product2");
        product2.doSomething();
    }
}
