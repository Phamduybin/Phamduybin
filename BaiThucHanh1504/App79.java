package app79.model;

public class nhanvien {
    protected String ten;
    protected long luong;

    public nhanvien(){

    }

    public nhanvien(String ten){
        this.ten = ten;
    }

    protected String loaiNhanVien(){
        return "";
    }

    public void xuatThongTin(){
        System.out.println("==== Nhan vien: " + ten + " ====");
        System.out.println("- Loai nhan vien: " + loaiNhanVien());
        System.out.println("- Luong: " + luong + " VND  ");
    }
}

import app79.util.config;

public class nhanvienfulltime extends nhanvien{
    protected int ngayLamThem;
    protected int chucVu;
    private Object config; 

    public nhanvienfulltime(String ten){
        this.ten = ten;
    }

    public nhanvienfulltime(String ten, int ngayLamThem){
        this.ten = ten;
        this.ngayLamThem = ngayLamThem;
    }

    public void setLoaiChucVu(int chucVu){
        this.chucVu = chucVu;
    }

    @Override
    public String loaiNhanVien(){
        if(chucVu == config.NHAN_VIEN_SEP){
            return "Nhan vien sep.";
        } else {
            return "Nhan vien linh.";
        }
    }

    public void tinhLuong(){
        if(chucVu == config.NHAN_VIEN_SEP){
            luong = config.LUONG_NHAN_VIEN_FULL_TIME_SEP + ngayLamThem * config.LUONG_LAM_THEM_MOI_NGAY;
        } else {
            luong = config.LUONG_NHAN_VIEN_FULL_TIME_LINH + ngayLamThem * config.LUONG_LAM_THEM_MOI_NGAY;
        }
    }
}
import app79.util.config;

public class nhanvienparttime extends nhanvien {
    private int gioLamViec;

    public nhanvienparttime(String ten, int gioLamViec) {
        this.ten = ten;
        this.gioLamViec = gioLamViec;
    }

    @Override
    public String loainhanvien() {
        return "Nhan vien thoi vu.";
    }

    public void tinhLuong() {
        luong = config.LUONG_NHAN_VIEN_PART_TIME_MOI_GIO * gioLamViec;
    }
}

public class config {
    // Loai nhan vien
    public static final int NHAN_VIEN_SEP = 1;
    public static final int NHAN_VIEN_LINH = 2;

    // Luong nhan vien
    public static final long LUONG_NHAN_VIEN_FULL_TIME_SEP = 20000000;
    public static final long LUONG_NHAN_VIEN_FULL_TIME_LINH = 10000000;
    public static final long LUONG_LAM_THEM_MOI_NGAY = 800000;
    public static final long LUONG_NHAN_VIEN_PART_TIME_MOI_GIO = 100000;
}