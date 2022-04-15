package app75;

public class hinhChuNhat extends hinhhoc {
    public hinhChuNhat() {
        super();
    }
}

public class hinhTron extends hinhhoc {
    public hinhTron() {
        super();
    }
}

public class hinhhoc {
    public int dem = 0;

    public hinhhoc() {
        dem++;
    }
}

public class mainclass {
    public static void main(String[] args) {

        hinhhoc hinhHoc = new hinhhoc();
        System.out.println("Có tất cả " + hinhHoc.dem + " hình trong ứng dụng trên ");
    }
}