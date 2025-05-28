import java.util.Scanner;
class Code5{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two Numbers:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        if(n1==n2){
            System.out.println("Both are Equal");
        }
        else{
            System.out.println("Both are not equal!!");
        }
    }
}