package Practice.Inheritance;

public class Student extends Person{
    public Student(String name, int age, float height){
        super(name, age, height);
    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("hello");
    }
}
