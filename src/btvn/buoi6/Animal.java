package btvn.buoi6;

public abstract class Animal {
    String name;
    int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Phương thức trừu tượng makeSound() phải được ghi đè ở các lớp con
    public abstract void makeSound();

    // Phương thức trừu tượng action() phải được ghi đè ở các lớp con
    public abstract void action();

    // Phương thức showInfo() hiển thị thông tin động vật
    public void showInfo() {
        System.out.println("Animal name: " + name);
        System.out.println("Animal age: " + age);
    }
}

// Lớp Lion kế thừa từ Animal
class Lion extends Animal {
    public Lion(String name, int age) {
        super(name, age);
    }

    // Ghi đè phương thức makeSound() cho Lion
    @Override
    public void makeSound() {
        System.out.println("Lion is roaring.");
    }

    // Ghi đè phương thức action() cho Lion
    @Override
    public void action() {
        System.out.println("The lion is hunting.");
    }
}

// Lớp Elephant kế thừa từ Animal
class Elephant extends Animal {
    public Elephant(String name, int age) {
        super(name, age);
    }

    // Ghi đè phương thức makeSound() cho Elephant
    @Override
    public void makeSound() {
        System.out.println("Elephant is trumpeting.");
    }

    // Ghi đè phương thức action() cho Elephant
    @Override
    public void action() {
        System.out.println("The elephant is spraying water.");
    }
}

// Lớp Monkey kế thừa từ Animal
class Monkey extends Animal {
    public Monkey(String name, int age) {
        super(name, age);
    }

    // Ghi đè phương thức makeSound() cho Monkey
    @Override
    public void makeSound() {
        System.out.println("Monkey is chattering.");
    }

    // Ghi đè phương thức action() cho Monkey
    @Override
    public void action() {
        System.out.println("The monkey is climbing trees.");
    }
}

// Chương trình chính

