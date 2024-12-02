package btvn.buoi4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Văn bản mẫu
        String vanBan = "Ngôn ngữ lập trình Java ban đầu được phát triển bởi Sun Microsystems do James Gosling khởi xướng và phát hành vào năm 1995. Phiên bản mới nhất của Java Standard Edition là Java SE 8. Với sự tiến bộ của Java và sự phổ biến rộng rãi của nó, nhiều cấu hình đã được xây dựng để phù hợp với nhiều loại nền tảng khác nhau. Ví dụ: J2EE cho các ứng dụng doanh nghiệp, J2ME cho các ứng dụng di động.";

        // Menu chức năng
        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Đếm số lượng từng từ trong văn bản (không phân biệt hoa thường)");
            System.out.println("2. Viết hoa chữ cái đầu trong mỗi từ");
            System.out.println("3. Xóa các nguyên âm trong văn bản");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng (0-3): ");
            int chon = scanner.nextInt();
            scanner.nextLine(); // Xử lý dòng trống

            switch (chon) {
                case 1:
                    demSoLuongTu(vanBan);
                    break;
                case 2:
                    vietHoaChuCaiDau(vanBan);
                    break;
                case 3:
                    xoaNguyenAm(vanBan);
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn lại.");
            }
        }
    }

    // Hàm đếm số lượng từng từ (Không dùng Map)
    public static void demSoLuongTu(String vanBan) {
        String vanBanChuanHoa = vanBan.replaceAll("[^a-zA-Z0-9àáạảãâầấậẩẫăằắặẳẵèéẹẻẽêềếệểễìíịỉĩòóọỏõôồốộổỗơờớợởỡùúụủũưừứựửữỳýỵỷỹÀÁẠẢÃÂẤẬẨẪĂẰẮẶẲẴÈÉẸẺẼÊỀẾỆỂỄÌÍỊỈĨÒÓỌỎÕÔỐỒỘỔỖƠỚỜỢỞỠÙÚỤỦŨƯỨỰỬỮỲÝỴỶỸ ]", " ").toLowerCase();
        String[] tu = vanBanChuanHoa.split("\\s+");

        // Sử dụng hai danh sách song song
        List<String> danhSachTu = new ArrayList<>();
        List<Integer> danhSachSoLan = new ArrayList<>();

        for (String t : tu) {
            if (!t.isEmpty()) {
                if (danhSachTu.contains(t)) {
                    int chiSo = danhSachTu.indexOf(t);
                    danhSachSoLan.set(chiSo, danhSachSoLan.get(chiSo) + 1);
                } else {
                    danhSachTu.add(t);
                    danhSachSoLan.add(1);
                }
            }
        }

        // In kết quả
        System.out.println("\nTần suất xuất hiện của từng từ:");
        for (int i = 0; i < danhSachTu.size(); i++) {
            System.out.println(danhSachTu.get(i) + " : " + danhSachSoLan.get(i) + " lần");
        }
    }

    // Hàm viết hoa chữ cái đầu
    public static void vietHoaChuCaiDau(String vanBan) {
        String[] tu = vanBan.split("\\s+");
        StringBuilder ketQua = new StringBuilder();

        for (String t : tu) {
            if (!t.isEmpty()) {
                ketQua.append(Character.toUpperCase(t.charAt(0)))
                        .append(t.substring(1).toLowerCase())
                        .append(" ");
            }
        }

        System.out.println("\nVăn bản sau khi viết hoa chữ cái đầu:");
        System.out.println(ketQua.toString().trim());
    }

    // Hàm xóa các nguyên âm
    public static void xoaNguyenAm(String vanBan) {
        String khongNguyenAm = vanBan.replaceAll("[aeiouAEIOUáàạảãâấầậẩẫăắằặẳẵéèẹẻẽêếềệểễíìịỉĩóòọỏõôốồộổỗơớờợởỡúùụủũưừựửữýỳỵỷỹÁÀẠẢÃÂẤẦẤẬẨẪĂẮẰẶẲẴÉÈẸẺẼÊẾỀỆỂỄÍÌỊỈĨÓÒỌỎÕÔỐỒỘỔỖƠỚỜỢỞỠÚÙỤỦŨƯỨỰỬỮÝỲỴỶỸ]", "");

        System.out.println("\nVăn bản sau khi xóa các nguyên âm:");
        System.out.println(khongNguyenAm);
    }
}
