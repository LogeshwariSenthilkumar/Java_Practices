import java.util.Scanner;
class Code13{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter 5 Subjects Marks:");
            int m1=sc.nextInt();
            int m2=sc.nextInt();
            int m3=sc.nextInt();
            int m4=sc.nextInt();
            int m5=sc.nextInt();
            int avg=(m1+m2+m3+m4+m5)/5;
            if(avg<35){
                System.out.println("Additional class required");
            }
            else{
                System.out.println("You are good to go");
            }


    }
}