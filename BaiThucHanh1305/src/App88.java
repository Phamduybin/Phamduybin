import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App88 {
    public static void main(String[] args ) throws Exception{
        HashMap<String, String> hashMapCity = new HashMap<>();
        hashMapCity.put("QNg","Quang Ngai");
        hashMapCity.put("QN","Quang Nam");
        //trong trương hợp này ta thấy 
        // key của Quảng Nam và Quảng Ninh
        // đều là QN nên chương trình sẽ thêm 
        // vào trong hashMapCity value đứng sau (tức Quảng Ninh)
        hashMapCity.put("QN","Quang Ninh");
        hashMapCity.put("HCM","Ho Chi Minh");

        System.out.println("Danh sach cac thanh pho trong hashMapCity: ");
        Set<Map.Entry<String, String>> setCity = hashMapCity.entrySet();
        System.out.println(setCity);

        // lấy thành phố có mã là QNg
        // và hiển thị tên thành phố
        System.out.println("QNg: "+ hashMapCity.get("QNg"));

        // lấy thành phố có mã là NT
        // vì trong hashMapCity không có thành phố nào có mã là NT
        // nên sẽ hiển thị giá trị null
        System.out.println("NT "+ hashMapCity.get("NT"));

        // để kiểm tra xem 1 value có trong HashMap hay không
        // chúng ta sẽ dùng phương thứuc contrainsValue()
        if(hashMapCity.containsValue("Thanh pho Ho Chi Minh")){
            System.out.println("Co Thanh pho Ho Chi Minh trong hashMapCity");
        }
    }
}
