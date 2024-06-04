import java.util.*;
public class Mot_tu_duoc_dinh_nghia_la {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Set<String> set1 = new TreeSet<String>();
        Set<String> set2 = new TreeSet<String>();
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++){
            String s = sc.nextLine();
            String str[] = s.toLowerCase().split("\\s+");
            for(String it: str){
                set1.add(it);
            }
        }
        int m = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < m; i++){
            String s = sc.nextLine();
            String str[] = s.toLowerCase().split("\\s+");
            for(String it: str){
                set2.add(it);
            }
        }
        Set<String> set = new HashSet<String>(set1);
        set.retainAll(set2);
        set1.removeAll(set);
        set2.removeAll(set);

        for(String it: set1){
                System.out.print(it + " ");
        }
        System.out.println();
        for(String it: set2){
                System.out.print(it + " ");
        }
    }
}
