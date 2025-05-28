import java.util.Scanner;
class Code7{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Whether Meghana Died or not:");
        String meghana=sc.nextLine();
        if(meghana.equals("died")){
            System.out.println("Surya meets Ramya");
        }
        else{
            System.out.println("Surya weds Meghana");
        }
    }
}