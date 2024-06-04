package Practice.Abstraction;

public class Student extends Person{
    public Student(String name, int age, float height){
        super(name, age, height);
    }

    @Override
    public Object clone(){
        Student clone = new Student("hoanganh", 12, 2.7f);
        return clone();
    }
}
