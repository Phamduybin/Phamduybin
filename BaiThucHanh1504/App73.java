package app73;

public class mainclass {
    public static void main(String[] args) {
        // Các thuộc tỉnh x, y này chỉ được truy xuất đến thông qua thể hiện toaDo1
        toado toaDo1 = new toado();
        toaDo1.x = 10;
        toaDo1.y = 20;

        // Các thuộc tỉnh x, ý này chỉ được truy xuất đến thông qua thể hiện toaDo2
        toado toaDo2 = new toado();
        toaDo2.x = 5;
        toaDo2.y = 6;

        // Thuộc tỉnh thongTin lại được truy xuất đến thông qua lớp ToaDo
        toado.thongTin = "Lưu tọa độ các hình học";
    }
}

public class toado {
    public static String thongTin;
    public int x;
    public int y;

}