import java.util.Scanner;

public class App7 {
    public static void main(String[] srgs) throws Exception {
        float n, max = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap so thuc: ");
            n = sc.nextFloat();
            if (n > max)
                max = n;
        } while (n != 0);
        System.out.println("Gia tri lon nhat trong cac so vua nhap la: " + max);
        sc.close();
    }
}