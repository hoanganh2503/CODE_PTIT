import java.util.*;
public class Hop_cua_2_day_so {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            set1.add(a);
        }
        for(int i = 0; i < m; i++){
            int a = sc.nextInt();
            set2.add(a);
        }
        Set<Integer> intersection = new HashSet<Integer>(set1);
        intersection.addAll(set2);
        int arr[] = new int[intersection.size()];
        int k = 0;
        for(Integer value: intersection){
            arr[k++] = value;
        }
        Arrays.sort(arr);
        for(int it:arr){
            System.out.print(it + " " );
        }
    }
}
