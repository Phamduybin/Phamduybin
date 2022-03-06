import java.util.Scanner;

public class App90 {
    public static void main(String[] agr) throws Exception {
        String chuoi;
        char kytu;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi ky tu bat ky:");
        chuoi = scanner.nextLine();
        System.out.println("Cac ky tu trong chuoi la: ");
        for (int i = 0; i < chuoi.length(); i++) {
            kytu = chuoi.charAt(i);
            System.out.println(kytu);
        }
        scanner.close();
    }

}