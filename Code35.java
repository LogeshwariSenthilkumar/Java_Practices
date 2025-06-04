class Vehicle{
    String brand;
    int year;
    void startEngine(){
        System.out.println("Starting Engine..");
    }
}
class Car extends Vehicle{
    String fueltype;
    void startEngine(){
        System.out.println("Car Engine Starts..");
    }
    void drive(){
        System.out.println("Car is Driving");
    }
}
class Truck extends Vehicle
{
    int loadcapacity;
    void startEngine(){
        System.out.println("Truck engine starts..");
    }
    void haul(){
        System.out.println("Truck is Hauling");
    }
}
class Demo{
    public static void main(String[] args){
        Car c=new Car();
        c.brand="Farrary";
        c.year=2000;
        c.fueltype="Petrol";
        c.startEngine();
        c.drive();
        Truck t=new Truck();
        t.brand="Mahendra";
        t.year=2003;
        t.loadcapacity=24;
        t.startEngine();
        t.haul();
    }
}