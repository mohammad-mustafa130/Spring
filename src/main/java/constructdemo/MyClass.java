package constructdemo;

public class MyClass {
    private int age;
    private String name;
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String toString() {
        return "Name is " + name + " and age is " + age;
    }
    public void init() {
        System.out.println("Init method called");
    }
}
