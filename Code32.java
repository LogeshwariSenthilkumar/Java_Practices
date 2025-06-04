import java.util.Scanner;
class Find{
    void evenorodd(int num1){
              if(num1%2==0){
                      System.out.println("Even Number");
              }
              else{
                System.out.println("Odd Number");
              }
        }
    public static void main(String[] args){
        System.out.println("Enter Number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        Find f=new Find();
        f.evenorodd(num);
    }

}