import java.util.Scanner;
class Code3{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=a*b*c;
        int e=a+b+c;
        System.out.println("Result:"+d/e);

    }
}