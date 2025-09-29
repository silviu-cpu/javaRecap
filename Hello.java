class Computer {
    public void playMusic() {
        System.out.println("Music Play");
    }

    public int getMePen() {
        return 5;
    }

    // Method Overloading concept
    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public double add(double n1, int n2) {
        return n1 + n2;
    }
}

public class Hello {
    public static void main(String a[]) {
        // sealed abstract vs non abstract
        // Computer c1 = new Computer();
        // c1.playMusic();
        // System.out.println(c1.getMePen());

        int nums[] = { 4, 5, 56 };
        int nums2[] = new int[4];

        int numsM[][] = new int[4][4];
        for (int n[] : numsM) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
