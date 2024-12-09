package btvn.buoi6.bai1;

public class Elephant extends Animal{

    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    public void action() {
        System.out.println("The elephant is spraying water.");
    }
}
