import java.util.Scanner;
class Code9{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Income:");
        int income=sc.nextInt();
        if(income>7000)
        {
            System.out.println("Scholarship Available");
        }
        else{
            System.out.println("Not Eligible for scholarship");
        }
    }
}