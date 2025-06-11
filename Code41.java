interface Diagnosable{
    void runDiagnostics();
}
class Car implements Diagnosable{
    public void runDiagnostics(){
        System.out.println("Running Diagnostics on Car");
    }
}
class Bike implements Diagnosable{
     public void runDiagnostics(){
        System.out.println("Running Diagnostics on Bike");
    }

}
class Truck implements Diagnosable{
     public void runDiagnostics(){
        System.out.println("Running Diagnostics on Truck");
    }

}
class Demo4{
    public static void main(String[] args){
        Car cc=new Car();
        System.out.println("Car Class:");
        cc.runDiagnostics();
        Bike bb=new Bike();
        System.out.println("\nBike Class:");
        bb.runDiagnostics();
        Truck tt=new Truck();
        System.out.println("\nTruck Class:");
        tt.runDiagnostics();
    }
}