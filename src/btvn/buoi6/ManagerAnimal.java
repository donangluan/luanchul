package btvn.buoi6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerAnimal {

    private List<Animal> animals;  // Dùng List để dễ dàng mở rộng khi cần thiết.
    private int capacity;





        // Constructor khởi tạo
        public ManagerAnimal(int initialCapacity) {
            this.animals = new ArrayList<>(initialCapacity);
            this.capacity = initialCapacity;
        }

        // Thêm động vật vào danh sách
        public void addAnimal(Animal animal) {
            if (animals.size() == capacity) {
                capacity += 10;  // Mở rộng danh sách khi đầy
                System.out.println("Sở thú đã mở rộng dung lượng thêm 10 con!");
            }
            animals.add(animal);
            System.out.println("Động vật đã được thêm thành công!");
        }

        // Hiển thị tất cả động vật trong sở thú
        public void displayAnimals() {
            if (animals.isEmpty()) {
                System.out.println("Không có động vật trong sở thú!");
            } else {
                for (Animal animal : animals) {
                    animal.showInfo();
                    animal.makeSound();
                    animal.action();
                    System.out.println();
                }
            }
        }

        // Tìm động vật theo tên (không phân biệt hoa thường)
        public void findAnimalByName(String name) {
            for (Animal animal : animals) {
                if (animal.name.equalsIgnoreCase(name)) {
                    animal.showInfo();
                    return;
                }
            }
            System.out.println("Không tìm thấy động vật này!");
        }

        // Xóa động vật theo tên (không phân biệt hoa thường)
        public void removeAnimalByName(String name) {
            for (int i = 0; i < animals.size(); i++) {
                if (animals.get(i).name.equalsIgnoreCase(name)) {
                    animals.remove(i);
                    System.out.println("Động vật đã được xóa thành công!");
                    return;
                }
            }
            System.out.println("Không tìm thấy động vật này!");
        }

        // Menu để thực hiện các thao tác trong ManagerAnimal
        public void showMenu() {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("\nChọn một tùy chọn:");
                System.out.println("1. Thêm một con sư tử");
                System.out.println("2. Thêm một con voi");
                System.out.println("3. Thêm một con khỉ");
                System.out.println("4. Hiển thị tất cả động vật");
                System.out.println("5. Tìm động vật theo tên");
                System.out.println("6. Xóa động vật theo tên");
                System.out.println("7. Thoát");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Đọc bỏ dòng thừa

                switch (choice) {
                    case 1: // Thêm Lion
                        System.out.print("Nhập tên con sư tử: ");
                        String lionName = scanner.nextLine();
                        System.out.print("Nhập tuổi con sư tử: ");
                        int lionAge = scanner.nextInt();
                        scanner.nextLine();
                        addAnimal(new Lion(lionName, lionAge));
                        break;

                    case 2: // Thêm Elephant
                        System.out.print("Nhập tên con voi: ");
                        String elephantName = scanner.nextLine();
                        System.out.print("Nhập tuổi con voi: ");
                        int elephantAge = scanner.nextInt();
                        scanner.nextLine();
                        addAnimal(new Elephant(elephantName, elephantAge));
                        break;

                    case 3: // Thêm Monkey
                        System.out.print("Nhập tên con khỉ: ");
                        String monkeyName = scanner.nextLine();
                        System.out.print("Nhập tuổi con khỉ: ");
                        int monkeyAge = scanner.nextInt();
                        scanner.nextLine();
                        addAnimal(new Monkey(monkeyName, monkeyAge));
                        break;

                    case 4: // Hiển thị tất cả động vật
                        displayAnimals();
                        break;

                    case 5: // Tìm động vật theo tên
                        System.out.print("Nhập tên động vật cần tìm: ");
                        String findName = scanner.nextLine();
                        findAnimalByName(findName);
                        break;

                    case 6: // Xóa động vật theo tên
                        System.out.print("Nhập tên động vật cần xóa: ");
                        String removeName = scanner.nextLine();
                        removeAnimalByName(removeName);
                        break;

                    case 7: // Thoát
                        System.out.println("Đang thoát chương trình. Tạm biệt!");
                        return;

                    default:
                        System.out.println("Lựa chọn không hợp lệ! Vui lòng thử lại.");
                }
            }
        }
}
