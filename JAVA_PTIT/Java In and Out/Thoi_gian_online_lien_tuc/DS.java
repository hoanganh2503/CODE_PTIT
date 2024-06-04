package Thoi_gian_online_lien_tuc;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

public class DS implements Comparable<DS> {
    private String ten;
    private long time;

    public DS(String ten, String vao, String ra){
        this.ten = ten;
        this.time = handle(vao, ra);
    }

    public long handle(String vao, String ra) {
        try{
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date1 = format.parse(vao); 
            Date date2 = format.parse(ra);
            double minutes = Math.round(TimeUnit.MILLISECONDS.toSeconds(date2.getTime() - date1.getTime())/60.0);
            return (long)(minutes);   
        }catch(ParseException e){
            return 0;
        }
    }

    @Override
    public String toString() {
        return this.ten + " " + this.time;
    }

    @Override
    public int compareTo(DS o){
        if(this.time < o.time){
            return 1;
        }else if(this.time == o.time){
            return this.ten.compareTo(o.ten);
        }
        return -1;
    }
}
