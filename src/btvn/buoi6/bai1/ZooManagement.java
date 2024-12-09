package btvn.buoi6.bai1;

import java.util.Scanner;

public class ZooManagement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerAnimal manager = new ManagerAnimal(10);

        while (true) {
            System.out.println("1. Add Lion");
            System.out.println("2. Add Elephant");
            System.out.println("3. Add Monkey");
            System.out.println("4. Stop Adding Animals");
            System.out.println("5. Show All Animals");
            System.out.println("6. Find Animal by Name");
            System.out.println("7. Remove Animal by Name");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the newline character

            switch (choice) {
                case 1: {
                    System.out.print("Enter Lion's name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Lion's age: ");
                    int age = scanner.nextInt();
                    manager.addAnimal(new Lion(name, age));
                    break;
                }
                case 2: {
                    System.out.print("Enter Elephant's name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Elephant's age: ");
                    int age = scanner.nextInt();
                    manager.addAnimal(new Elephant(name, age));
                    break;
                }
                case 3: {
                    System.out.print("Enter Monkey's name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Monkey's age: ");
                    int age = scanner.nextInt();
                    manager.addAnimal(new Monkey(name, age));
                    break;
                }
                case 4:
                    System.out.println("Stopping animal addition.");
                    return;
                case 5:
                    manager.showAnimals();
                    break;
                case 6: {
                    System.out.print("Enter the animal name to find: ");
                    String name = scanner.nextLine();
                    manager.findAnimal(name);
                    break;
                }
                case 7: {
                    System.out.print("Enter the animal name to remove: ");
                    String name = scanner.nextLine();
                    manager.removeAnimal(name);
                    break;
                }
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
