package Examination.FOLDER.Vananh;

public class myString {
    public String name;
    public int age;

    public myString(String str){
        String temp_str[] = str.split("\\*");
        this.name = temp_str[0];
        this.age = 2023 - Integer.parseInt(temp_str[1].substring(temp_str[1].length() - 4));
    }

    public int getAge(){
        return this.age;
    }

    public String checkName(){
        for(int i=0; i<this.name.length() ; i++){
            if(this.name.charAt(i) != ' ' && !Character.isAlphabetic(this.name.charAt(i)))
                return "Sai";
        }
        return "Đúng";
    }
}
