import java.util.Scanner;
class Code18{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Range:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int i;
        for (i=a;i<=b;i++){
            System.out.println(i);
        }
    }
}