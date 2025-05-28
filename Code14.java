import java.util.Scanner;
class Code14{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Red or yellow or green");
        String traffic=sc.nextLine();
        if(traffic.equals("Red"))
        {
            System.out.println("Stop");
        }
        else if(traffic.equals("Yellow"))
        {
            System.out.println("Get Ready");
        }
        else if(traffic.equals("Green"))
        {
            System.out.println("Go");
        }
    }
}