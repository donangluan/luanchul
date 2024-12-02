package btvn.buoi4;

import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Nhập số điện thoại: ");
        String soDienThoai = scanner.nextLine();


        if (kiemTraSoDienThoai(soDienThoai)) {
            System.out.println("Số điện thoại hợp lệ.");
        } else {
            System.out.println("Số điện thoại không hợp lệ.");
        }
    }

    public static boolean kiemTraSoDienThoai(String soDienThoai) {
        // Loại bỏ các ký tự đặc biệt "-", "." để kiểm tra số thực sự
        String soCanKiemTra = soDienThoai.replaceAll("[-.]", "");


        if (soCanKiemTra.matches("(\\+84|84|0)\\d{9}")) {
            return true;
        }


        return false;
    }
}

