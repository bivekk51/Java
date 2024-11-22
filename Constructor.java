// Write a program to illustrate the chain of constructor in inheritance

class Parent {
    public Parent() {
        System.out.println("Parent class constructor called.");
    }
}

class Child extends Parent {
    public Child() {
        System.out.println("Child class constructor called.");
    }
}

class GrandChild extends Child {
    public GrandChild() {
        System.out.println("GrandChild class constructor called.");
    }
}

public class ConstructorChainingDemo {
    public static void main(String[] args) {
        GrandChild grandChild = new GrandChild();
    }
}
