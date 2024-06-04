import java.util.*;
public class Xep_hang {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        Map<Long, List<Long>> map = new TreeMap<Long, List<Long>>();
        while(t-->0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            if(map.containsKey(a)){
                List<Long> list = map.get(a);
                list.add(b);
            }else{
                List<Long> list = new ArrayList<Long>();
                list.add(b);
                map.put(a, list);
            }
        }

        long ans = 0;
        for(Map.Entry<Long, List<Long>> entry : map.entrySet()){
            Long key = entry.getKey();
            ans = Math.max(ans, key);
            for(Long a : entry.getValue()){
                ans += a;
            }
        }
        System.out.println(ans);
    }
}