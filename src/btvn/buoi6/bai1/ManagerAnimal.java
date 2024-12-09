package btvn.buoi6.bai1;

import java.util.ArrayList;

public class ManagerAnimal {

    private ArrayList<Animal> animals;
    private int capacity;

    public ManagerAnimal(int capacity) {
        this.capacity = capacity;
        animals = new ArrayList<>(capacity);
    }

    // Phương thức để thêm động vật vào danh sách
    public void addAnimal(Animal animal) {
        if (animals.size() >= capacity) {
            capacity += 10; // Mở rộng dung lượng danh sách
            System.out.println("List is full, expanding list size.");
        }
        animals.add(animal);
    }

    // Phương thức hiển thị danh sách động vật
    public void showAnimals() {
        if (animals.isEmpty()) {
            System.out.println("No animals in the zoo.");
        } else {
            for (Animal animal : animals) {
                animal.showInfo();
                animal.action();
            }
        }
    }

    // Phương thức tìm động vật theo tên và hiển thị thông tin
    public void findAnimal(String name) {
        boolean found = false;
        for (Animal animal : animals) {
            if (animal.name.equalsIgnoreCase(name)) {
                animal.showInfo();
                animal.action();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Animal with the name '" + name + "' not found.");
        }
    }

    // Phương thức xóa động vật theo tên
    public void removeAnimal(String name) {
        boolean found = false;
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).name.equalsIgnoreCase(name)) {
                animals.remove(i);
                System.out.println("Removed animal: " + name);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Animal with the name '" + name + "' not found.");
        }
    }
}
