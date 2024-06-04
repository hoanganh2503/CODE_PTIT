import java.util.*;
import java.io.*;
public class Loai_bo_so_nguyen {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> list = new ArrayList<String>();
        while(sc.hasNext()){
            String s = sc.next();
            if(!isNumeric(s)) list.add(s);
        }
        Collections.sort(list);
        for(String s : list) System.out.print(s + " ");
    }

    public static boolean isNumeric(String str){
        try{
            Integer.parseInt(str);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
}
