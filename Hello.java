class Human {
    private int age = 22;
    private String name = "Silvik";

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Hello {
    public static void main(String a[]) {
        Human obj = new Human(83, "Ilie");

        System.out.println(obj.getAge() + " " + obj.getName());
    }
}
