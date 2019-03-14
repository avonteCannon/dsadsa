package demopackage;

public class Vehicle {
    public int doors;
    public int wheels;

    //constructor
    public Vehicle(int doors, int wheels){
        this.doors = doors;
        this.wheels = wheels;
    }
    public String move(){
        return " move...get out the way";
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "doors=" + doors +
                ", wheels=" + wheels +
                '}';
    }
}
