package Main;

import Shapes.Triangle;

public class App1 {
    public static void main(String[] args) {
        Triangle t = new Triangle('A', 1, 2);
        t.nhap();
        t.kiemtratamgiac();
    }
}