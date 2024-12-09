package btvn.buoi6.bai1;

public abstract class Animail {

    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Phương thức trừu tượng action() sẽ được ghi đè trong các lớp con
    public abstract void action();

    // Phương thức showInfo() để hiện thị thông tin chi tiết
    public void showInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
