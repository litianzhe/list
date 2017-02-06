import java.util.*;

/**
 * Created by user on 2017/2/5.
 */
public class Test {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Map<Integer,Integer> map=new HashMap<Integer, Integer>();
        map.put(1, 1);

        map.put(1, 2);
        map.put(1, 3);
        map.put(4, 4);
        map.put(2, 4);

        System.out.println("map:"+map);
        System.out.println("map.key:"+map.keySet());
        map.keySet();
        String a="4";
        map.remove(a);
        int b=5;
        System.out.println("map:"+map.get(a));
        System.out.println("map:"+map.get(b));
        System.out.println("map:"+map);
    }
}
