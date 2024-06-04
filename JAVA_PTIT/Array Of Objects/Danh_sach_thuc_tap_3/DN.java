package Danh_sach_thuc_tap_3;

public class DN {
    private String ma, ten;
    private int current, max;

    public DN(String ma, String ten, String max) {
        this.ma = ma;
        this.ten = ten;
        this.max = Integer.parseInt(max);
        this.current = 0;
    }
    public String getId(){
        return this.ma;
    }
    public int getCurrent() {
        return this.current;
    }

    public void setCurrent() {
        this.current = this.current + 1;
    }

    public int getMax() {
        return this.max;
    }
}
