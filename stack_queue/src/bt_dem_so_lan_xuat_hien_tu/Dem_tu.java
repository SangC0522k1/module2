package bt_dem_so_lan_xuat_hien_tu;

import java.util.Set;
import java.util.TreeMap;

public class Dem_tu {
    public static void main(String[] args) {
        String str = "sang là một chàng trai vui vẽ hòa đồng,thêm hiền nữa";
        str.replace(",", " ");
        String[] array = str.split("");
        String key ="";
        int value;
        TreeMap<String,Integer> map = new TreeMap<>();
        for (String s : array) {
            key = s.toLowerCase();
            if (map.containsKey(key)) {
                value = map.get(key);
                map.remove(key);
                map.put(key, value +1 );
            }
            else {
                map.put(key, 1);
            }
        }
        Object o = new Object();
        Set<String> set = map.keySet();
        for (String s : set){
            key =s;
            System.out.println(key + " show " + map.get(key) + " times.");
        }
    }
}
