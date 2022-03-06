import java.util.Scanner;

public class AppBai5 {
    public static void main(String[] agr) throws Exception {
        int so, tong = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhap cac so nguyen: ");
            so = scanner.nextInt();
            tong = tong + so;
            if (tong > 100) {
                break;
            }
        } while (so > 0);

        System.out.println("Tong cac so vua nhap la:" + tong);
        scanner.close();
    }

}