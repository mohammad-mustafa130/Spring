package test;

public class B {
    private C c;
    public B(C c) {
        this.c = c;
    }
    public void display() {
        c.display();
    }
    public void init() {
        System.out.println("Init method");
    }
}
