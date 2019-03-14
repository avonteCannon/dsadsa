package demopackage;

public class Person {

    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    public String appendIsh(int x){
        return "Appended this to " + x;
    }
    public String appendIsh(double x){
        return "Appended this to " + x;
    }
}
