package Practice.Static;

public class Student {
    public String name;
    public int age;
    public float height;
    public static String universityName = "PTIT";
    public static int total = 0;

    public Student(String name, int age, float height){
        this.name = name;
        this.age = age;
        this.height = height;
        total++;
    }

    public static void getName(){
        System.out.println(universityName);
    }
}
