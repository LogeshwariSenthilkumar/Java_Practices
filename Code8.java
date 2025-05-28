import java.util.Scanner;
class Code8{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Mark:");
        int mark=sc.nextInt();
        if(mark>=35){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }
}