class Parent {
    int a = 12;
}

class Child extends Parent {
    void print() {
        System.out.println("Assessing parent member from child : " + a);
    }
}

public class A21_Single_Inheritance {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.print();
        System.out.println("Assessing parent member from object of child : " + obj.a);
    }
}