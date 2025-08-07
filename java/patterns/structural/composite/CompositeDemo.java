package com.composite;

public class CompositeDemo {
    public static void main(String[] args) {
        // Leaf nodes
        Employee dev1 = new Developer("Alice", "Java Developer");
        Employee dev2 = new Developer("Bob", "Python Developer");

        // Composite node
        Manager engManager = new Manager("Carol", "Engineering");

        // Add developers under manager
        engManager.addEmp(dev1);
        engManager.addEmp(dev2);

        engManager.showDetails();
        dev1.showDetails();
    }
}

