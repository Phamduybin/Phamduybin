import java.util.TreeMap;
import java.util.HashMap;

public class App78 {
    public static void main(String[] args ) throws Exception{
        //khai báo 1 HashMap tên hashMap1
        // mỗi phần tử trong hashMap1 bao gồm 2 phần 
        // key (Integer) và value (Float)
        HashMap<Integer, Float> hashMap1 = new HashMap<>();

        //khai báo 1 HashMap tên hashMap2
        // mỗi phần tử trong hashMap2 bao gồm 2 phần
        // key (String) và value (String)
        // có kích thước khởi tạo = 10
        HashMap<String, String> hashMap2 = new HashMap<>();

        // khai báo 1 HashMap có kích thước khởi tạo = 4
        // và yếu tố tải = 0.75f (mặc định)
        // chi tiết về kích thươc khởi tạo và yếu tố tải
        // xem lại bài HashSet
        HashMap<Double, Double> hashMap3 = new HashMap<>(4,0.75f);

        // khai báo 1 HashMap được tạo thành từ 1 Colletion khác
        HashMap<Float, Integer> hashMap4 = new HashMap<>(new TreeMap<>());
    }
    
}
