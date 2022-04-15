package app67;

import app67.hinhtru;

public class hinhtron {

    public static void main(String[] args) {
        hinhtron ht = new hinhtron();
        hinhtru htru = new hinhtru();
        ht.xuatThongTin();
        htru.xuatThongTin();

    }
}

public class hinhtru extends hinhtron {
    @Override
    public void xuatthongtin() {
        System.out.println("day la hinh tru");
    }
}