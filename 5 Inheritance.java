

public class Inheritance {
    void method1() {
        System.out.println("This is parent class");
    }
    public static void main(String[] args) {
        Inheritance obj = new Inheritance();
        Child obj2 = new Child();
        obj.method1();
        obj2.method2();
        obj2.method2();
    }
}

class Child{
    void method2()
    {
        System.out.println("This is child class");
    }
}

Output: This is parent class
        This is child class
        This is child class