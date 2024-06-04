package Bai_toan_tuyen_sinh;

public class SV {
    public String kv, ten, diem, uu_tien, status;

    public SV(String kv, String ten, float diem1, float diem2, float diem3){
        this.kv = kv;
        this.ten = ten;
        double total = (double)diem1*2+(double)diem2+(double)diem3;
        switch(kv.substring(0, 3)){
            case "KV1":
                this.uu_tien = "0.5";
                break;
            case "KV2":
                this.uu_tien = "1";
                break;
            case "KV3":
                this.uu_tien = "2.5";
                break;
        }
        this.diem = String.valueOf(total);
        if(total == (int)(total)){
            this.diem = String.format("%.0f", total);
        }else this.diem = String.format("%.1f", total);

        if(total + Float.parseFloat(this.uu_tien) >= 24) this.status = "TRUNG TUYEN";
        else this.status = "TRUOT";
    }

    public void printInfo(){
        System.out.printf("%s %s %s %s %s", this.kv, this.ten, this.uu_tien, this.diem, this.status);
    }
}
