package app77;

public class config {
    public static final int SO_LUONG_HINH_TOI_THIEU = 0;
    public static final int SO_LUONG_HINH_TOI_DA = 5;

    public static final float PI = 3.14f;
    public static final float INCH_CM = 2.45f;
    public static final int DON_VI_CM = 1;
    public static final int DON_VI_INC = 2;
    public static int donVi = DON_VI_CM;

    public static float ChuyenCentimetSangInch(float cm) {
        float inch = cm / INCH_CM;
        return inch;
    }

    public static float ChuyenInchSangCentimet(float inch) {
        float cm = inch * INCH_CM;
        return cm;
    }
}

import java.util.Scanner;

public class hinhtron extends config {
    protected float banKinh;
    private Scanner scanner;

    public hinhtron() {
        super();
        scanner = new Scanner(System.in);
    }

    public void nhapBanKinh() {

        System.out.println("Bạn dùng đơn vị tính nào :");
        System.out.println("\t1 = Centimet");
        System.out.println("\t2 = inch");
        config.donVi = scanner.nextInt();

        System.out.println("Hãy nhập vào Bán kính Hình tròn ");
        banKinh = scanner.nextFloat();
    }

    public void inThongTin() {
        if (config.donVi == config.DON_VI_CM) {
            System.out.println("Hình tròn có bán kính " + banKinh + " cm ");
            System.out.println("Tương đương" + config.ChuyenCentimetSangInch(banKinh) + " inch");
        } else {
            System.out.println("Hình tròn có bán kính " + banKinh + " inch");
            System.out.println("Tương đương" + config.ChuyenInchSangCentimet(banKinh) + " cm");
        }
    }
}
