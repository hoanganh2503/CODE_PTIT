import java.util.*;
public class Dem_so_lan_xuat_hien {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int l = 0;
        while(t-->0){
            l++;
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
            for(Integer it:arr){
                map.put(it, map.getOrDefault(it, 0)+1);
            }
            System.out.println("Test " + l + ":");
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " xuat hien " + entry.getValue() + " lan");
            }
    
        }
    }
}
