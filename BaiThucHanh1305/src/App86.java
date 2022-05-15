import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class App86 {
    public static void main(String [] args) throws Exception{
        // khai báo 1 HashMap có tên là hashMap
        // kiểu dữ liệu của key và value là String
        HashMap<String, String> hashMap = new HashMap<>();

        // thêm value vào trong hashMap với key tương ứng
        // sử dụng phương thức put()
        // đối số thứ nhất trong put là key có kiểu là String
        // và đối số thứ 2 là value có kiểu là String
        hashMap.put("CSLT","Co so lap trinh");
        hashMap.put("C++","C++");
        hashMap.put("C#","C Sharp");
        hashMap.put("PHP","PHP");
        hashMap.put("Java","Java");

        // tạo 1 Set có tên là setHashMap
        // chứa toàn bộ các entry (vừa key vừa value)
        //của hashMap
        Set<Map.Entry<String, String>> setHashMap = hashMap.entrySet();

        System.out.println("Cac entry co trong setHashMap: ");
        System.out.println(setHashMap);
    }
}
