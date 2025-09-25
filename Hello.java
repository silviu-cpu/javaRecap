class Calculator {
    public int add(int x1, int x2) {
        int sum = 0;
        sum = x1 + x2;
        return sum;
    }
}

public class Hello {
    public static void main(String a[]) {
        // int num = 20;
        // byte b = 122;
        // short sh = 5882;
        // long l = 22222222223l;
        // float f = 23.2f;

        // char c = 'k';
        // boolean ba = true;
        // int num = 100_000_000;
        // int n = 3;
        // int result = 0;

        // result = n % 2 == 0 ? 10 : 20; // same js
        // System.out.println(result);

        // switch (n) {
        // case 1:
        // System.out.println("Ceva1");
        // case 2:
        // System.out.println("Ceva2");
        // case 3:
        // System.out.println("Ceva3");
        // default:
        // break;
        // }

        // int i = 1;
        // do {
        // System.out.println("Hi " + i);
        // i++;
        // } while (i <= 4);

        int n1 = 3, n2 = 4;

        Calculator x = new Calculator();
        int rez = x.add(n1, n2);
        System.out.println(rez);
    }
}
