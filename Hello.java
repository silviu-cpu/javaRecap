class A {
    public A() {
        System.out.println("Constr in A");
    }

    public void show() {
        System.out.println("Show in A");
    }
}

public class Hello {
    public static void main(String a[]) {
        new A().show(); // anonymous object has no refference
    }
}
