class Mobile {
    String brand;
    int price;
    String network;
    static String name;

    static {
        name = "Phone";
        System.out.println("in static block");
    }

    public Mobile() {
        brand = " ";
        price = 200;
        System.out.println("In constructor");
    }

    public void show() {
        System.out.println(brand + ": " + price + ": " + name);
    }

    public static void show1(Mobile obj) {
        System.out.println("In static method: " + obj.brand + ": " + obj.price + ": " + name);
    }
}

public class Hello {
    public static void main(String a[]) {
        // String name = new String("Silvik");
        // String s1 = "Silvik";
        // String s2 = "Silvik";

        // System.out.println(s1.hashCode());
        // System.out.println(s2.hashCode());

        // StringBuffer sb = new StringBuffer("Silviu");
        // System.out.println(sb.capacity());
        // System.out.println(sb.length());
        // sb.append(" Barbu");
        // sb.deleteCharAt(2);
        // sb.insert(0, "Java ");

        // String str = sb.substring(0, 5);
        // System.out.println(str);
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "StaticCeva";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 2500;

        // Mobile.name = "TePhone";

        obj1.show();
        obj2.show();

        Mobile.show1(obj1);
    }
}
