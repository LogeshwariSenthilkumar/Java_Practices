import java.util.Scanner;
class Code22{
    public static void main(String[] args){
        int[] arr=new int[5];
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 Numbers:");
        for(i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
         System.out.println("\nArray Values:");
        for(i=0;i<5;i++){
             System.out.println(arr[i]);
        }
       

    }
}