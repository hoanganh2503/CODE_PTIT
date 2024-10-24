import java.util.*;
import java.io.*;
public class Thong_ke_cac_tu_khac_nhau_trong_van_ban {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("D:/DANHSACH.in"));
        int n = sc.nextInt();
        sc.nextLine();
        String s = "";
        for(int i=0; i<n; i++){
            String line = sc.nextLine();
            s += line + " ";
        }

        String str[] = s.trim().toLowerCase().replaceAll("\\,", " ")
                                             .replaceAll("\\.", " ")
                                             .replaceAll("\\?", " ")
                                             .replaceAll("\\!", " ")
                                             .replaceAll("\\:", " ")
                                             .replaceAll("\\;", " ")
                                             .replaceAll("\\(", " ")
                                             .replaceAll("\\)", " ")
                                             .replaceAll("\\-", " ")
                                             .replaceAll("\\/", " ")
                                             .replaceAll("\\s\\s+", " ")
                                             .split(" ");
        ArrayList<Pair1> list = new ArrayList<Pair1>();
        for(String it:str){
            boolean check = true;
            for(Pair1 p :list){
                if(p.getTen().equals(it)){
                    p.setDem();
                    check = false;
                    break;
                }
            }
            if(check){
                if(!isAlphaNumeric(it)) continue;   
                Pair1 pair1 = new Pair1(it);
                list.add(pair1);
            }
        }
        Collections.sort(list);
        for(Pair1 pair1 :list){
            System.out.println(pair1);
        }
    }

        public static boolean isAlphaNumeric(String input) {
            for (char c : input.toCharArray()) {
                if (!Character.isLetterOrDigit(c)) {
                    return false;
                }
            }
            return true;
        }
}

class Pair1 implements Comparable<Pair1>{
    private String ten;
    private int dem;

    public Pair1(String ten){
        this.ten = ten;
        this.dem = 1;
    }
    public void setDem(){
        this.dem ++;
    }

    public String getTen(){
        return this.ten;
    }

    @Override
    public int compareTo(Pair1 o){
        if(this.dem > o.dem){
            return -1;
        }else if(this.dem == o.dem){
            return this.ten.compareTo(o.ten);
        }
        return 1;
    }
    @Override
    public String toString(){
        return this.ten + " " + this.dem;
    }
}
