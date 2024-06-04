import java.util.*;
import java.io.*;
public class Khai_bao_bien_INT {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner sc = new Scanner(new File("CODE.cpp"));
        int count = 0;
        while(sc.hasNext()){
            String s = sc.next();
            if(s.contains("int")){
                String str = "";
                while(true){
                    String temp = sc.next();
                    str += temp + " ";
                    if(temp.contains("main")) break;
                    if(temp.charAt(temp.length()-1) == ';') break;
                }
                if(str.contains("main")){
                    continue;
                } else{
                    String s1[] = str.split(",");
                    for(String it:s1){
                        if(it.contains("[")){
                           it = it.trim();
                           it = it.substring(0, it.length()-1);
                            String s2[] = it.split("]");
                            int mul = 1;
                            for(String it1:s2){
                                int k = 0;
                                for(k = 0 ; k < it1.length() ; k++)
                                    if(it1.charAt(k) == '[') break;
                                mul *= Integer.parseInt(it1.substring(k+1));
                            }
                            count += mul;
                        }else count++;
                    }
                                    
                }

            }
        }
        System.out.println(count*4);
    }
}
