package test;

public class A {
    private B b;
    public A(B b) {
        this.b = b;
    }
    public void display() {
        b.display();
    }
    public void init() {
        System.out.println("Init method");
    }
}
