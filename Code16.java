import java.util.Scanner;
class Code16{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Two numbers:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println((n1>n2)? "Number1 is Greater":"Number2 is Greater");
    }
}