import Person;
import PTB2;
import SinhVien;

public class App1603 {
    public static void main(String[] args) {
        Person ps = new Person();
        SinhVien sv = new SinhVien<>();
        PTB2 pt = new PTB2();
        ps.nhapPersonID();
        ps.nhapPersonName();
        ps.nhapGender();
        ps.nhapAddress();
        ps.inPersonID();
        ps.inPersonName();
        ps.inGender();
        ps.inAddress();
        System.out.println("\n\n");
        sv.nhapMaSv();
        sv.nhapHoten();
        sv.nhapGioiTinh();
        sv.nhapDiaChi();
        sv.nhapNgaySinh();
        sv.inMaSv();
        sv.inHoten();
        sv.inGioitinh();
        sv.inDiaChi();
        sv.inNgaySinh();
        System.out.println("\n\n");
        pt.nhap();
        pt.in();
    }
}