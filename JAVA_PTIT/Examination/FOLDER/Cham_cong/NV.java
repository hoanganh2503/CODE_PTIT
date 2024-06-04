package Examination.FOLDER.Cham_cong;

public class NV {
    private String ma, ten, tt;
    private int phut, gio, tg;

    public NV(String ma, String ten, String vao, String ra){
        this.ma = ma;
        this.ten = ten;
        vao = vao.trim();
        ra = ra.trim();
        String str1[] = vao.split(":");
        String str2[] = ra.split(":");
        int v = (Integer.parseInt(str1[0].trim())*60 + Integer.parseInt(str1[1].trim()));
        int r = (Integer.parseInt(str2[0].trim())*60 + Integer.parseInt(str2[1].trim()));
        this.gio = (r-v)/60 - 1;
        this.phut = (r-v)%60;
        this.tg = (r-v) - 60;
        if((r-v)>= (9*60)) this.tt = "DU";
        else this.tt = "THIEU";
    }

    public String getMa(){
        return this.ma;
    }

    
    public String getTen(){
        return this.ten;
    }

    
    public String getTT(){
        return this.tt;
    }
    
    public int getGIo(){
        return this.gio;
    }
    
    public int getPhut(){
        return this.phut;
    }
    
    public int getTG(){
        return this.tg;
    }
}
