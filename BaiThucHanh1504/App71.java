package app71;

public class hinhtron {
    private final float pi = 3.14f;
    private float banKinh;

    public float getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(float banKinh) {
        this.banKinh = banKinh;
    }

    public float tinhChuVi() {
        return banKinh * pi * 2;
    }

    public float tinhDienTich() {
        return banKinh * banKinh * pi;
    }
}

public class mainclass {

    public static void main(String[] args) {
        hinhtron ht = new hinhtron();
        ht.setBanKinh(10);
        float chuVi = ht.tinhChuVi();
        float dienTich = ht.tinhDienTich();
        System.out.println("chu vi hinh trong: " + chuVi + "\ndien tich hinh tron: " + dienTich);
    }
}

public class toado {
    private int x;
    private int y;

    // getter x
    public int getX() {
        return x;
    }

    // setter x
    public void setX(int x) {
        this.x = x;
    }

    // getter y
    public int getY() {
        return y;
    }

    // setter y
    public void setY(int y) {
        this.y = y;
    }
}
