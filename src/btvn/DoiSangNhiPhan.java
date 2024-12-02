package btvn;

import java.util.Scanner;

public class DoiSangNhiPhan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Nhập vào một số nguyên dương: ");
        int n = scanner.nextInt();


        if (n <= 0) {
            System.out.println("Vui lòng nhập một số nguyên dương lớn hơn 0.");
        } else {

            String nhiPhan = Integer.toBinaryString(n);
            System.out.printf("Số nhị phân của %d là: %s%n", n, nhiPhan);
        }

        scanner.close();
    }
}
