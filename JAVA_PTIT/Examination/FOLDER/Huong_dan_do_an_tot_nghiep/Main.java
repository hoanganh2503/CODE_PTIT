package Examination.FOLDER.Huong_dan_do_an_tot_nghiep;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("D:/MONHOC.in"));
        Scanner sc1 = new Scanner(new File("D:/MONHOC1.in"));
        ArrayList<DS> list = new ArrayList<DS>();
        while(sc.hasNextLine()){
            DS a = new DS(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            list.add(a);
        }
        Collections.sort(list);
        
        int t = sc1.nextInt();
        sc1.nextLine();
        while(t-->0){
            String str = sc1.nextLine();
            int n = Integer.parseInt(str.substring(str.length()-1));
            String tenGV = str.substring(0, str.length()-2).trim();

            for(int i = 0; i < n; i++){
                String s = sc1.nextLine();
                String s1[] = s.trim().split(" ");
                String msv = s1[0].trim();
                String do_an = "";
                for(int j = 1; j < s1.length ; j++) do_an += s1[j] + " ";
                for(DS it:list){
                    if(msv.equals(it.getMa())){
                        it.setDoAn(do_an.trim());
                        it.setGV(tenGV);
                    }
                }
            }
        }

        for(DS it:list){
            if(!it.getDo_an().isEmpty()){
                System.out.println(it);
            }
        }
    }
}
