import java.util.Scanner;
class Code15{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Salary:");
        int salary=sc.nextInt();
        System.out.println("Enter Age:");
        int age=sc.nextInt();
        if(salary>=20000 || age<=25){
            System.out.println("Enter Loan Amount:");
            int loan=sc.nextInt();
            if(loan<=50000){
                System.out.println("You are eligible for loan");
            }
            else{
                System.out.println("Maximum loan amount is 50,000");
            }
        }
        else{
            System.out.println("You are not Eligible for loan");
        }
      
    }
}