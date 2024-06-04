package Chuan_hoa_va_sap_xep;
import java.util.*;
public class Name {
    private String ho, ten, dem, name;

    public Name(String name) {
        name = formatName(name);
        this.name = name;
        String str[] = name.split(" ");
        this.ho = str[0];
        this.ten = str[str.length - 1];

        for(int i = 0 ; i < str.length ; i++){
            if(i != 0 && i != str.length - 1) this.dem += str[i] + " ";
        }

    }

    public String formatName(String s){
        String ans = "";
        String str[] = s.replaceAll("\\s\\s+", " ").trim().toLowerCase().split(" ");
        for(String it:str){
            it = it.substring(0, 1).toUpperCase() + it.substring(1);
            ans += it + " ";
        }
        return ans.trim();
    }

    public String getName(){
        return this.name;
    }

    public String getHo(){
        return this.ho;
    }
    public String getTen(){
        return this.ten;
    }

    public String getDem(){
        return this.dem;
    }

}
