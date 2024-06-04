package Bang_luong_theo_phong_ban;

public class NV {
    private String ma, ten, phong, ma_phong;
    private double luong, heso;
    protected NV(String ma, String ten, String phong, String ma_phong, double luong_co_ban, double ngaycong){
        this.ma = ma;
        this.ten = ten;
        this.phong = phong;
        this.ma_phong = ma_phong;
        char loai = ma.charAt(0);
        int nam = Integer.parseInt(ma.substring(1, 3));
        switch (loai) {
            case 'A':
                if(nam >= 16) this.heso = 20;
                else if(nam >= 9) this.heso = 14;
                else if(nam >= 4) this.heso = 12;
                else if(nam >= 1) this.heso = 10;
                else this.heso = 0;
                break;
            case 'B':
                if(nam >= 16) this.heso = 16;
                else if(nam >= 9) this.heso = 13;
                else if(nam >= 4) this.heso = 11;
                else if(nam >= 1) this.heso = 10;
                else this.heso = 0;
                break;                
            case 'C':
                if(nam >= 16) this.heso = 14;
                else if(nam >= 9) this.heso = 12;
                else if(nam >= 4) this.heso = 10;
                else if(nam >= 1) this.heso = 9;
                else this.heso = 0;
                break;                
            case 'D':
                if(nam >= 16) this.heso = 13;
                else if(nam >= 9) this.heso = 11;
                else if(nam >= 4) this.heso = 9;
                else if(nam >= 1) this.heso = 8;
                else this.heso = 0;
                break;   
        }
        this.luong = luong_co_ban*ngaycong*heso*1000;
    }

    protected String getId(){
        return this.ma;
    }

    protected String getName(){
        return this.ten;
    }

    protected String getDepartment(){
        return this.phong;
    }

    protected String getDepartmentId(){
        return this.ma_phong;
    }

    protected double getSalary(){
        return this.luong;
    }

}
