package Practice.Abstraction;

public abstract class Person {
    public String name;
    public int age;
    public float height;

    public Person(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public abstract Object clone();

    public void getName(){
        System.out.println("Hoanganh");
    }

}
