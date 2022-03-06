import java.util.Scanner;

public class App81 {
    public static void main(String[] agr) throws Exception {
        int n, m;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so dong cua ma tran: ");
        n = scanner.nextInt();
        System.out.println("Nhap vao so cot cua ma tran: ");
        m = scanner.nextInt();
        int A[][] = new int[n][m];
        System.out.println("Nhap phan tu vao ma tran: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("A[" + i + "] [" + j + "]=");
                A[i][j] = scanner.nextInt();
            }
        }
        int max = A[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (max < A[i][j]) {
                    max = A[i][j];
                }
            }
        }
        System.out.println("Phan tu lan nhat trong ma tran = " + max);
        scanner.close();
    }

}