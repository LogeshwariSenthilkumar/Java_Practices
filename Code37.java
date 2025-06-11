interface A{
    void show();
}
class Interface implements A{
     public void show(){
            System.out.println("Show method..");
        }
    public static void main(String[] args){
        Interface ob=new Interface();
        ob.show();
       
    }
}