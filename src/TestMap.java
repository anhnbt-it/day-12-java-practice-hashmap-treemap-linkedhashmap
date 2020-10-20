import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/20/2020
 * Time: 1:37 PM
 */
public class TestMap {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Khoai Tay");
        hashMap.put(2, "Rose");
        hashMap.put(3, "AnhNBT");
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");
    }
}
