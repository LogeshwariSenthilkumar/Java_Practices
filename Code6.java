import java.util.Scanner;
class Code6{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter RCB Win or Loose:");
        String rcb=sc.nextLine();
        if(rcb.equals("win")){
            System.out.println("Ee sala cup Namdhey");
        }
        else{
            System.out.println("cup illa");
        }
    }
}