import java.util.Scanner;
class Code10{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number:");
        int num=sc.nextInt();
        if(num%3==0 && num%5==0){
            System.out.println("Number is divisible by 3 and 5");
        }
        else{
            System.out.println("Number is not divisible by 3 and 5");
        }
    }
}