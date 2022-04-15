package app72;

public class mainclass {
    private int x;
    private int y;

    // getter x
    public int getX() {
        return x;
    }

    // setter x
    public void setX(int x) {
        this.x = x;
    }

    // getter y
    public int getY() {
        return y;
    }

    // setter y
    public void setY(int y) {
        this.y = y;
    }
}

public class sinhvien {
    private String ten;
    private String tuoi;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        if (ten == null || ten.isEmpty())
            this.ten = "k biet";
        else
            this.ten = ten;
    }

    public String getTuoi() {
        if (Integer.valueOf(tuoi) != -1) {
            // tuoi hop le
            return tuoi;
        } else
            return "tuoi k hop le";
    }

    public void setTuoi(int tuoi) {
        if (tuoi > 18)
            this.tuoi = String.valueOf(tuoi);
        else
            this.tuoi = String.valueOf(-1);
    }
}