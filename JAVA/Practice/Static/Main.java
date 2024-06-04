package Practice.Static;

public class Main {
    public static void main(String[] args) {
        Student a = new Student("Hoang Anh", 20, 1.7f);
        System.out.println(Student.universityName);
        System.out.println(a.age);
        System.out.println(Student.total);
        // Student.getName();
    }
}
