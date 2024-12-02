package btvn;

public class TinhMenhGia {

    public static void main(String[] args) {

        int tongTien = 200000;
        int soPhuongAn  = 0;


        for (int soTo5000 = 0; soTo5000 <= tongTien / 5000; soTo5000++) {

            for (int soTo2000 = 0; soTo2000 <= (tongTien - soTo5000 * 5000) / 2000; soTo2000++) {

                int soTo1000 = (tongTien - soTo5000 * 5000 - soTo2000 * 2000) / 1000;


                if (soTo5000 * 5000 + soTo2000 * 2000 + soTo1000 * 1000 == tongTien) {
                    System.out.printf("Phương án: %d tờ 5000đ, %d tờ 2000đ, %d tờ 1000đ%n",
                            soTo5000, soTo2000, soTo1000);
                    soPhuongAn ++;
                }
            }
        }


        System.out.printf("Tổng số phương án: %d%n", soPhuongAn );
    }
}

