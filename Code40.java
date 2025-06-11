interface Printable{
    void print();
    void show();
}
interface Scannable{
    void scan();
    void show();
}
class MultiFunctionPrinter implements Printable,Scannable{
    public void print(){
        System.out.println("Printing.....");
    }
    public void scan(){
         System.out.println("Scanning....");
    }
    public void show(){
        System.out.println("Showing....");
    }

}

class Demo3{
    public static void main(String[] args){
        MultiFunctionPrinter mm=new MultiFunctionPrinter();
        System.out.println("MultiFunctionPrinter Class:");
        mm.print();
        mm.scan();
        mm.show();
    }
}