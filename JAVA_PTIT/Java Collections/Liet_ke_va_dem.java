import java.util.*;
public class Liet_ke_va_dem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "";
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if(line.isEmpty()) break;
            s += line + " ";
        }
        System.out.println(s);

        
        ArrayList<Integer> set = new ArrayList<>();
        Set<Integer> set1 = new LinkedHashSet<>();

        String str[] = s.trim().replaceAll("\\s\\s+", " ").trim().split(" ");
        for(String a : str) {
            if(check(a)){

                set.add(Integer.parseInt(a));
                set1.add(Integer.parseInt(a));
            } 
        }
        ArrayList<Pair> list = new ArrayList<Pair>();
        for(int a: set1) {
                Pair p = new Pair(a, Collections.frequency(set, a));
                list.add(p);
        }
        Collections.sort(list);
        for(Pair p: list) {
            System.out.println(p.getFirst() + " " + p.getSecond());
        }
    }

    static boolean check(String s){
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i) > s.charAt(i+1)) return false;
        }
        return true;
    }
}

class Pair implements Comparable<Pair>{
    private int second;
    private String first;
    
    public Pair(int first, int second){
        this.first = String.valueOf(first);
        this.second = second;
    }

    public String getFirst(){
        return first;
    }

    public int getSecond(){
        return second;
    }

    @Override
    public int compareTo(Pair o){
        return -this.second + o.second;
    }
}