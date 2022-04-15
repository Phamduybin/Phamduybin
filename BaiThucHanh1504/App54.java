// Lop HinhHoc
package shapes;

public class HinhHoc {

    public final float PI = 3.14f;

    public string ten;
    public float chuvi;
    public float dientich;
    public float thetich;

    public void xuatten() {
        System.out.println("\n\n====" + ten + " ====");
    }

    public void inChuvi() {
        System.out.println("Chu vi = " + chuvi);
    }

    public void inDienTich(){
        System.out.println("Dien tich = " + Dien tich);
    }

    public void inTheTich(){
        System.out.println("The tich = " + The tich);
    }
}
// Lop HinhTru
package shapes;

import java.util.Scanner;

public class HinhTru extends hinhtron {
    public float chieuCao;

    // Constructor
    public HinhTru() {
        ten = "Hình trụ";
    }

    public void nhapChieuCao() {
        nhapBankinh();
        System.out.println("Chiều cao = ");
        Scanner scanner = new Scanner(System.in);
        chieuCao = scanner.nextFloat();
    }

    public void tinhThetich() {
        tinhDienTich();
        thetich = dienTich * chieuCao;

    }
}
// Lop HinhChuNhat
package shapes;

import java.util.Scanner;

public class HinhChuNhat extends HinhHoc {
    public float dai;
    public float rong;

    // Constructor
    public HinhChuNhat() {
        ten = "Hình Chữ Nhật";
    }

    public void nhapChieuDai() {
        System.out.println("Chiều dài = ");
        Scanner scanner = new Scanner(System.in);
        dai = scanner.nextFloat();
    }

    public void nhapChieuRong() {
        System.out.println("Chiều rộng = ");
        Scanner scanner = new Scanner(System.in);
        rong = scanner.nextFloat();
    }

}package

public static void main(String[] args) {import shapes.HinhChuNhat;
import shapes.HinhTron;
import shapes.HinhTru;
import shapes.HinhVuong;

public class MainClass {
    public static void main(String[] args) {
        // Thử nghiệm với lớp Hình tròn
        HinhTron hinhTron = new HinhTron();
        hinhTron.xuatTen();
        hinhTron.nhapBanKinh();
        hinhTron.tinhChuVi();
        hinhTron.tinhDienTich();
        hinhTron.inChuVi();
        hinhTron.inDienTich();

        // thử nghiệm với lớp Hình trụ
        HinhTru hinhTru = new HinhTru();
        hinhTru.xuatTen();
        hinhTru.nhapChieuCao();
        hinhTru.tinhThetich();
        hinhTru.inTheTich();

        // thử nghiệm với lớp hình chữ nhật
        HinhChuNhat hinhChuNhat = new HinhChuNhat();
        hinhChuNhat.xuatTen();
        hinhChuNhat.nhapChieuDai();
        hinhChuNhat.nhapChieuRong();
        hinhChuNhat.tinhChuVi();
        hinhChuNhat.tinhDienTich();
        hinhChuNhat.inChuVi();
        hinhChuNhat.inDienTich();

        // Thử nghiệm với lớp HÌnh vuông
        HinhVuong hinhVuong = new HinhVuong();
        hinhVuong.xuatTen();
        hinhVuong.nhapCanh();
        hinhVuong.tinhChuVi();
        hinhVuong.tinhDienTich();
        hinhVuong.inChuVi();
        hinhVuong.inDienTich();
    }

}

}
