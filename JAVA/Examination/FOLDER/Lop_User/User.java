package Examination.FOLDER.Lop_User;

public class User {
    private String full;
    private int total;

    public User(String full){
        this.full = full;
        this.total = 0;
    }

    public void setTotal(){
        this.total++;
    }

    public int getTotal(){
        return this.total;
    }

    public String getFull(){
        return this.full;
    }
}
