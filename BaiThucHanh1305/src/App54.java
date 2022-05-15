import java.util.HashSet;
import java.util.Scanner;
public class App54 {
    public static void main(String[] args ) {
        int number,n;
        HashSet<Integer> hashSetInteger = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        // Bổ sung Bổ sung chức năng nhập n phần tử từ bàn phím
        // để thêm vào Set với n nhập từ bàn phím
        System.out.println("Nhap so phan tu: ");
        n = scanner.nextInt();
        for(int i = 1; i<=n;i++){
            System.out.print("Nhap phan tu: ");
            number = scanner.nextInt();
            hashSetInteger.add(number);
        }

        //Thêm các phần tử vào hashSetInteger
        hashSetInteger.add(0);
        hashSetInteger.add(3);
        hashSetInteger.add(1);
        hashSetInteger.add(4);
        hashSetInteger.add(2);
        hashSetInteger.add(8); 
        // hiểu thị các phần tử trong hashSetInteger
        System.out.println("Cac phan tu trong hashSetString: ");
        System.out.println(hashSetInteger);
        System.out.println("Nhap phan tu can them: ");
        number = scanner.nextInt();
        // thêm một phần tử mới vào hashSetInteger từ bàn phím
        //nếu phần tử đó đã tồn tại thì thông báo đã tồn tại ngược lại thì thêm vào
        if (!hashSetInteger.contains(number)) {
            hashSetInteger.add(number);
            System.out.println("Them thanh cong: ");
            System.out.println("Cac phan tu trong hashSetString sau khi thêm: ");
            System.out.println(hashSetInteger);
        } else{
            System.out.println("Phan tu "+number+" da ton tai");     

       }
       scanner.close();
      }
      
    }