package Word_set;
import java.util.*;
public class WordSet {
    private String s;
    private Set<String> set = new TreeSet<String>();

    public WordSet(String s) {
         this.s = s;
         Set<String> set1 = new TreeSet<String>();
         String str[] = s.replaceAll("\\s\\s+", " ").toLowerCase().split(" ");
         for(String str2 : str) set1.add(str2);
         this.set = set1;
    }

    public String union(WordSet s1){
        Set<String> ans = new TreeSet<>(this.set);
        ans.addAll(s1.set);
        String s = "";
        for(String str : ans){
            s += str + " ";
        }
        return s;
    }

    public String intersection(WordSet s1){
        this.set.retainAll(s1.set);
        String s = "";
        for(String str : this.set){
            s += str + " ";
        }
        return s;
    }

}
