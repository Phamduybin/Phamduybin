package Shapes;

import java.util.Scanner;

public class Point {
    private char TenDiem;
    private float HoanhDo;
    private float TungDo;
    Scanner sc = new Scanner(System.in);

    public char getTenDiem() {
        return TenDiem;
    }

    public void setTenDiem(char TenDiem) {
        this.TenDiem = TenDiem;
    }

    public float getHoanhDo() {
        return HoanhDo;
    }

    public void setHoanhDo(float HoanhDo) {
        this.HoanhDo = HoanhDo;
    }

    public float getTungDo() {
        return TungDo;
    }

    public void setTungDo(float TungDo) {
        this.TungDo = TungDo;
    }

    public Point(char TenDiem, float HoanhDo, float TungDo) {
        setTenDiem(TenDiem);
        setHoanhDo(HoanhDo);
        setTungDo(TungDo);
    }

    public void nhap() {
        System.out.print("Nhap ten diem: ");
        TenDiem = sc.next().charAt(0);
        System.out.print("Nhap hoanh do: ");
        HoanhDo = sc.nextFloat();
        System.out.print("Nhap tung do: ");
        TungDo = sc.nextFloat();
    }

    public void in() {
        System.out.print(TenDiem + "(" + HoanhDo + "," + TungDo + ")");
    }
}