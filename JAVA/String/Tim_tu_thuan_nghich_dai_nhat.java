import java.util.*;
public class Tim_tu_thuan_nghich_dai_nhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "";
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if(line.isEmpty()) break;
            s += line + " ";
        }
        
        List<String> set = new ArrayList<>();
        Set<String> set1 = new LinkedHashSet<>();

        String str[] = s.replaceAll("\\s\\s+", "").trim().split(" ");
        int max = 0;
        for(String a : str) {
            if(check(a)){
                set.add(a);
                set1.add(a);
                max = Math.max(max, a.length());
            } 
        }
        for(String a: set1) {
            if(a.length()==max){
                System.out.println(a + " " + Collections.frequency(set, a));
            }
        }
    }

    static boolean check(String s){
        for(int i=0; i<s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)) return false;
        }
        return true;
    }
}
