package btvn.buoi6;

import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
//        Lion lion = new Lion("Leo", 5);
//        Elephant elephant = new Elephant("Dumbo", 10);
//
//        // Gọi phương thức chung
//        lion.eat();
//        elephant.eat();
//
//        // Gọi phương thức riêng
//        lion.roar();
//        elephant.trumpet();


//        // Tạo danh sách các động vật
//        Animal[] animals = {
//                new Lion("Leo", 5),
//                new Elephant("Dumbo", 10),
//                new Monkey("George", 3)
//        };
//
//        // Duyệt qua danh sách và gọi phương thức makeSound()
//        for (Animal animal : animals) {
//            animal.makeSound(); // Gọi phương thức đã được ghi đè
//        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng động vật ban đầu của sở thú: ");
        int capacity = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng thừa

        ManagerAnimal manager = new ManagerAnimal(capacity);
        manager.showMenu();  // Gọi menu để thực hiện các thao tác trong zoo


    }
}
