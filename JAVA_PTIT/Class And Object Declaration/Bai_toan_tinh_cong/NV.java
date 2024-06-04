package Bai_toan_tinh_cong;

public class NV {
   private String name,  position;
   private int day_salary, day_working;

   public NV(String name, int day_salary, int day_working, String position){
        this.name = name;
        this.day_salary = day_salary;
        this.day_working = day_working;
        this.position = position;
   }

   public void  printInfo(){
        long luong = this.day_salary*this.day_working;
        long thuong = 0, bonus = 0;
        if(this.day_working >= 25) thuong = luong/5;
        else if(this.day_working >= 22) thuong = luong/10;

        switch(this.position){
            case "GD":
                bonus = 250000;
                break;
            case "PGD":
                bonus = 200000;
                break;
            case "TP":
                bonus = 180000;
                break;
            case "NV":
                bonus = 150000;
                break;
        }
        System.out.printf("%s %s %d %d %d %d", "NV01", this.name, 
                       luong , thuong, bonus, luong+thuong+bonus);
   }
}
