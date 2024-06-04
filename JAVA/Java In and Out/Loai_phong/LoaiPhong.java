package Loai_phong;

public class LoaiPhong  implements Comparable<LoaiPhong> {
    private String ma, ten, gia, phi, data;

    public LoaiPhong(String s){
        this.data = s;
        String str[] = s.split(" ");
        this.ma = str[0];
        this.ten = str[1];
        this.gia = str[2];
        this.phi = str[3];
    }

    @Override
    public String toString() {
        return this.data;
    }

    // @Override
    public int compareTo(LoaiPhong it){
        return this.ten.compareTo(it.ten);
    }

    public String getMa(){
        return this.ma;
    }
    
    public String getTen(){
        return this.ten;
    }
    
    public String getGia(){
        return this.gia;
    }
    
    public String getPhi(){
        return this.phi;
    }
}

