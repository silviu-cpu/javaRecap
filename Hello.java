class A {
    public A() {
        System.out.println("Constr in A");
    }

    public A(int m) {
        System.out.println("Constr in A int m");
    }
}

class B extends A {
    public B() {
        super();
        System.out.println("Constr in B");
    }

    public B(int n) {
        this(); // will call the constructor of the class B()
        System.out.println("Constr in B int n");
    }
}

public class Hello {
    public static void main(String a[]) {
        B obj = new B(6);
    }
}
