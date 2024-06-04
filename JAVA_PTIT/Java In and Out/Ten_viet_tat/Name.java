package Ten_viet_tat;
import java.util.*;
public class Name {
    private Set<String> set = new HashSet<String>();
    private String ho, ten, demm, name;

    public Name(String name) {
        this.name = name;
        String str[] = name.split(" ");
        this.ho = str[0];
        this.ten = str[str.length - 1];
        for(int i = 0 ; i < str.length ; i++){
            if(i != 0 && i != str.length - 1) this.ho += str[i] + " ";
            String a = "";
            for(int j = 0 ; j < str.length ; j++){
                if(i == j) a += "*";
                else a+= str[j].charAt(0);
                if(j != str.length - 1) a += ".";
            }
            this.set.add(a);
        }

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
        return this.name;
    }

    public Set getSet(){
        return this.set;
    }
}
