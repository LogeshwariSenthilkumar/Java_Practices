import java.util.Scanner;
class School{
    String passorfail(int total){
       
      if(total>=35){
        return "Pass";
      }
      else{
        return "Fail";
      }
    }
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Total Mark:");
       int total=sc.nextInt();
       School obj=new School();
       System.out.println(obj.passorfail(total));
    }
}