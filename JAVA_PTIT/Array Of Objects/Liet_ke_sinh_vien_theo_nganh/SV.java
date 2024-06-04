package Liet_ke_sinh_vien_theo_nganh;
import java.util.*;
public class SV {
    public String ma, ten, lop, email, nganh;
    
    public SV(String ma, String ten, String lop, String email){
        this.ten = ten;
        this.ma = ma;
        this.lop = lop;
        this.email = email;

        switch(ma.substring(3, 7)){
            case "DCKT":
                this.nganh = "KE TOAN";
                break;
            case "DCCN":
                if(!lop.substring(0, 1).equals("E"))
                this.nganh = "CONG NGHE THONG TIN";
                else this.nganh = "";
                break;
            case "DCAT":
                if(!lop.substring(0, 1).equals("E"))
                this.nganh = "AN TOAN THONG TIN";
                else this.nganh = "";
                break;
            case "DCVT":
                this.nganh = "VIEN THONG";
                break;
            case "DCDT":
                this.nganh = "DIEN TU";
                break;
            default:
                this.nganh = "";
        }
    }

}
