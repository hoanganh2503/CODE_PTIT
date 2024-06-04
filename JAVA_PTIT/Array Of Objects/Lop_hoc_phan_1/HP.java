package Lop_hoc_phan_1;

public class HP {
    private String ma, ten, nhom, tenGv;

    protected HP(String ma, String ten, String nhom, String tenGv){
        this.ma = ma;
        this.ten = ten;
        this.nhom = nhom;
        this.tenGv = tenGv;
    }

    protected String getGroup(){
        return this.nhom;
    }
 
    protected String getName(){
        return this.ten;
    }
 
    protected String getTeacherName(){
        return this.tenGv;
    }
 
    protected String getId(){
        return this.ma;
    }
}
