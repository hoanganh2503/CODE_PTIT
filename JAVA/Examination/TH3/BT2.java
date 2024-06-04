package TH3;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class BT2 {
    public static void main(String[] args) throws ParseException, FileNotFoundException{
        Scanner in = new Scanner(new File("ONLINE.in"));
        int n = in.nextInt();
        in.nextLine();
        ArrayList<DS> ds = new ArrayList<>();
        for(int i = 0;i < n;i++){
            ds.add(new DS(in.nextLine(), in.nextLine(), in.nextLine()));
        }
        Collections.sort(ds);
        for(DS it:ds){
            System.out.println(it);
        }
    }
}
class DS implements Comparable<DS>{
    private String ten;
    private long time;

    public DS(String ten,String vao,String ra) throws ParseException{
        this.ten = ten;
        this.time = hanle(vao,ra);
    }
    public long hanle(String vao, String ra) throws ParseException{
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date1 = format.parse(vao);
        Date date2 = format.parse(ra);
        double minutes = Math.round(TimeUnit.MILLISECONDS.toSeconds(date2.getTime() - date1.getTime())/60.0);
        return (long)(minutes);
    }
    @Override
    public String toString(){
        return ten + " " + time;
    }
    @Override
    public int compareTo(DS o){
        if(this.time < o.time) return 1;
        else {
            if(this.time == o.time){
                return this.ten.compareTo(o.ten);
            }
            return -1;
        }
    }
}
