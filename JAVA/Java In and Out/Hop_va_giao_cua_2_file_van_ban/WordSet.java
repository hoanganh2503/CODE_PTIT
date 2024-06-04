package Hop_va_giao_cua_2_file_van_ban;
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


    public String union(WordSet s1){
        Set<String> ans = new TreeSet<>(this.words);
        ans.addAll(s1.words);
        String s = "";
        for(String str : ans){
            s += str + " ";
        }
        return s;
    }

    public String intersection(WordSet s1){
        this.words.retainAll(s1.words);
        String s = "";
        for(String str : this.words){
            s += str + " ";
        }
        return s;
    }
}
