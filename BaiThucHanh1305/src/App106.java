import java.util.TreeMap;
import java.util.Set;
import java.util.Map;

public class App106 {
    public static void main(String[] args) throws Exception{
        // khai báo 1 TreeMap có tên là treeMap
        // kiểu dữ liệu của key là Integer 
        // và value là Character
        TreeMap<Integer, Character> treeMap = new TreeMap<>();

        // Thêm value vào trong treeMap với key tương ứng
        // sử dụng phương thức put()
        // đối số thứ nhất trong put là key có kiểu là Integer
        // và đối số thứ 2 là valua kiểu là Character
        treeMap.put(6, 'A');
        treeMap.put(5, 'B');
        treeMap.put(1, 'C');
        treeMap.put(2, 'D');
        treeMap.put(8, 'E');

        // tạo 1 Set có tên là setTreeMap
        // chứa toàn bộ các entry (vừa key vừa value)
        // của treeMap
        Set<Map.Entry<Integer, Character>> setTreeMap = treeMap.entrySet();

        // Các entry trong setTreeMap sẽ được sắp xếp tăng dần theo khóa
        System.out.println("Cac entry co trong setTreeMap: ");
        System.out.println(setTreeMap);
    }    
}
