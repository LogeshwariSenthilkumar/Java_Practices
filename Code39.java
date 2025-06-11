interface Payment{
    void pay(double amount);
    void refund(double amount);
}
class CreditCard implements Payment{
    public void pay(double amount){
        System.out.println("Paying amount of rs."+amount+" using CreditCard");
    }
    public void refund(double amount){
         System.out.println("Refunding amount of rs."+amount+" in CreditCard");
    }
   
}
class UPI implements Payment{
     public void pay(double amount){
        System.out.println("Paying amount of rs."+amount+" using UPI");
    }
    public void refund(double amount){
         System.out.println("Refunding amount of rs."+amount+" in UPI");
    }

}
class NetBanking implements Payment{
     public void pay(double amount){
        System.out.println("Paying amount of rs."+amount+" using NetBanking");
    }
    public void refund(double amount){
         System.out.println("Refunding amount of rs."+amount+" in NetBanking");
    }
}
class Demo2{
    public static void main(String[] args){
        CreditCard cd=new CreditCard();
        System.out.println("CreditCard Class:");
        cd.pay(50000);
        cd.refund(2000);
        UPI up=new UPI();
        System.out.println("\nUPI Class:");
        up.pay(30000);
        up.refund(2500);
        NetBanking nb=new NetBanking();
        System.out.println("\nNetBanking Class:");
        nb.pay(22000);
        nb.refund(1000);
    }
}