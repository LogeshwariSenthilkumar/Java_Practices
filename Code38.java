interface SmartDevice{
    void turnOn();
    void turnOff();
    void getStatus();
}
class SmartFan implements SmartDevice{
    public void turnOn(){
        System.out.println("Turning ON SmartFan");
    }
    public void turnOff(){
         System.out.println("Turning OFF SmartFan");
    }
    public void getStatus(){
         System.out.println("Getting status for SmartFan");
    }

}
class SmartLight implements SmartDevice{
     public void turnOn(){
        System.out.println("Turning ON SmartLight");
    }
    public void turnOff(){
         System.out.println("Turning OFF SmartLight");
    }
    public void getStatus(){
         System.out.println("Getting status for SmartLight");
    }

}
class SmartAC implements SmartDevice{
     public void turnOn(){
        System.out.println("Turning ON SmartAC");
    }
    public void turnOff(){
         System.out.println("Turning OFF SmartAC");
    }
    public void getStatus(){
         System.out.println("Getting status for SmartAC");
    }

}
class Demo1{
    public static void main(String[] args){
        SmartFan sf=new SmartFan();
        System.out.println("SmartFan Class:");
        sf.turnOn();
        sf.turnOff();
        sf.getStatus();
        SmartLight sl=new SmartLight();
        System.out.println("\nSmartLight Class:");
        sl.turnOn();
        sl.turnOff();
        sl.getStatus();
        SmartAC sa=new SmartAC();
        System.out.println("\nSmartAC Class:");
        sa.turnOn();
        sa.turnOff();
        sa.getStatus();
    }
}