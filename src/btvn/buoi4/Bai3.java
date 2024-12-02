package btvn.buoi4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> mang = new ArrayList<>();

        // Nhập mảng
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            mang.add(scanner.nextInt());
        }

        // Menu chức năng
        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tính tổng các phần tử chẵn và lẻ");
            System.out.println("2. Tìm và in các số nguyên tố");
            System.out.println("3. Sắp xếp mảng");
            System.out.println("4. Chia mảng thành 2 mảng con");
            System.out.println("5. Tìm và in các phần tử trùng lặp");
            System.out.println("6. Thêm phần tử vào mảng");
            System.out.println("7. Xóa phần tử khỏi mảng");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng (0-7): ");
            int chon = scanner.nextInt();

            switch (chon) {
                case 1:
                    tinhTongChanLe(mang);
                    break;
                case 2:
                    timSoNguyenTo(mang);
                    break;
                case 3:
                    sapXepMang(mang);
                    break;
                case 4:
                    chiaMangCon(mang);
                    break;
                case 5:
                    timPhanTuTrungLap(mang);
                    break;
                case 6:
                    themPhanTu(mang, scanner);
                    break;
                case 7:
                    xoaPhanTu(mang, scanner);
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn lại.");
            }
        }
    }

    // Tính tổng các phần tử chẵn và lẻ
    public static void tinhTongChanLe(List<Integer> mang) {
        int tongChan = 0, tongLe = 0;
        for (int so : mang) {
            if (so % 2 == 0) {
                tongChan += so;
            } else {
                tongLe += so;
            }
        }
        System.out.println("Tổng các phần tử chẵn: " + tongChan);
        System.out.println("Tổng các phần tử lẻ: " + tongLe);
    }

    // Kiểm tra số nguyên tố
    public static boolean laSoNguyenTo(int so) {
        if (so < 2) return false;
        for (int i = 2; i <= Math.sqrt(so); i++) {
            if (so % i == 0) return false;
        }
        return true;
    }

    // Tìm số nguyên tố trong mảng
    public static void timSoNguyenTo(List<Integer> mang) {
        System.out.print("Các số nguyên tố trong mảng: ");
        boolean coNguyenTo = false;
        for (int so : mang) {
            if (laSoNguyenTo(so)) {
                System.out.print(so + " ");
                coNguyenTo = true;
            }
        }
        if (!coNguyenTo) {
            System.out.println("Không có số nguyên tố nào.");
        } else {
            System.out.println();
        }
    }

    // Sắp xếp mảng
    public static void sapXepMang(List<Integer> mang) {
        List<Integer> chan = new ArrayList<>();
        List<Integer> le = new ArrayList<>();
        for (int so : mang) {
            if (so % 2 == 0) {
                chan.add(so);
            } else {
                le.add(so);
            }
        }
        // Sắp xếp chẵn giảm dần, lẻ tăng dần
        chan.sort(Collections.reverseOrder());
        le.sort(Integer::compareTo);

        // Kết hợp mảng
        List<Integer> ketQua = new ArrayList<>();
        ketQua.addAll(chan);
        ketQua.addAll(le);

        System.out.println("Mảng sau khi sắp xếp: " + ketQua);
    }

    // Chia mảng thành 2 mảng con
    public static void chiaMangCon(List<Integer> mang) {
        double trungBinh = mang.stream().mapToInt(Integer::intValue).average().orElse(0);
        List<Integer> mang1 = new ArrayList<>();
        List<Integer> mang2 = new ArrayList<>();

        for (int so : mang) {
            if (so <= trungBinh) {
                mang1.add(so);
            } else {
                mang2.add(so);
            }
        }

        System.out.println("Mảng 1 (<= trung bình: " + trungBinh + "): " + mang1);
        System.out.println("Mảng 2 (> trung bình: " + trungBinh + "): " + mang2);
    }

    // Tìm và in phần tử trùng lặp
    public static void timPhanTuTrungLap(List<Integer> mang) {
        List<Integer> daKiemTra = new ArrayList<>();
        List<Integer> trungLap = new ArrayList<>();
        for (int so : mang) {
            if (daKiemTra.contains(so) && !trungLap.contains(so)) {
                trungLap.add(so);
            } else {
                daKiemTra.add(so);
            }
        }
        if (trungLap.isEmpty()) {
            System.out.println("Không có phần tử trùng lặp.");
        } else {
            System.out.println("Các phần tử trùng lặp: " + trungLap);
        }
    }

    // Thêm phần tử vào mảng
    public static void themPhanTu(List<Integer> mang, Scanner scanner) {
        System.out.print("Nhập giá trị phần tử cần thêm: ");
        int giaTri = scanner.nextInt();
        System.out.print("Nhập vị trí cần thêm (index): ");
        int viTri = scanner.nextInt();

        if (viTri < 0 || viTri > mang.size()) {
            System.out.println("Vị trí không hợp lệ!");
        } else {
            mang.add(viTri, giaTri);
            System.out.println("Mảng sau khi thêm: " + mang);
        }
    }

    // Xóa phần tử khỏi mảng
    public static void xoaPhanTu(List<Integer> mang, Scanner scanner) {
        System.out.print("Nhập giá trị phần tử cần xóa: ");
        int giaTri = scanner.nextInt();

        if (mang.contains(giaTri)) {
            mang.remove((Integer) giaTri);
            System.out.println("Mảng sau khi xóa: " + mang);
        } else {
            System.out.println("Không tìm thấy phần tử trong mảng.");
        }
    }
}

