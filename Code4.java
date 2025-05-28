import java.util.Scanner;
class Code4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name:");
        String name=sc.nextLine();
        System.out.println("Enter Score:");
        double score=sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter Department:");
        String dept=sc.nextLine();
        System.out.println("Name:"+name);
        System.out.println("Score:"+score/10+"/10");
        System.out.println("Department:"+dept);
    }
}