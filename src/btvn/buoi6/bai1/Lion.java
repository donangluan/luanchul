package btvn.buoi6.bai1;

public class Lion extends Animal {
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void action() {
        System.out.println("The lion is hunting.");
    }

}
