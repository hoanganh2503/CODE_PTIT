package Hieu_cua_2_tap_tu;
import java.util.*;
import java.io.*;

public class WordSet {
    private Set<String> words = new TreeSet<>();

    public WordSet(String sc1) {
        try{
            Scanner sc = new Scanner(new File(sc1));
            String line = "";
            while (sc.hasNextLine()) {
                String str = sc.nextLine();
                line += str +  " ";
            }
            String str[] = line.trim().replaceAll("\\s\\s+", " ").toLowerCase().split(" ");
            for(String it:str) this.words.add(it);
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }

    }

    public String difference(WordSet s1){
        Set<String> ans = new TreeSet<>(this.words);
        String s = "";
        for(String str : ans){
            if(s1.words.contains(str)) continue;
            s += str + " ";
        }
        return s;
    }

}
