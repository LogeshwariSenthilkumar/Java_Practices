import java.util.Scanner;
class Code12{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter Score:");
            int score=sc.nextInt();
            if(score<50){
            System.out.println("You need to Improve");

            }
            else if(score>=50 && score<=70){
            System.out.println("Good Job");

            }
            else if(score>75){
            System.out.println("Excellent Performance");

            }

    }
}