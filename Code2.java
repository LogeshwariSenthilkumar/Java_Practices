import java.util.Scanner;
class Code2{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name:");
        String name=sc.nextLine();
        System.out.println("Enter Age:");
        int age=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Address:");
        String address=sc.nextLine();
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Address:"+address);
    }
}