import java.util.Scanner;
import java.io.*;
class FilesHandling
{
    static File file=new File("C:\\Users\\LOGESHWARISENTHIL\\Documents\\Java\\Mini_Project.txt");
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        file.createNewFile();
        int choice;
        do{
            System.out.println("1.Write Content to the File \n2.Count Words \n3.Count Characters \n4.count Lines \n5.Count Vowels and Consonants \n6.Exit \n Enter your Choice :");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    writecontent();
                     break;
                case 2:
                    countWords();
                     break;
                case 3:
                    countCharacters();
                     break;
                case 4:
                    countLines();
                     break;
                case 5:
                    countVowelsandConsonants();
                     break;
                case 6:
                    System.out.println("Exiting ... Thank u");
                    break;
                default:
                    System.out.println("Invalid choice!!!");
            }

        }while(choice!=6);
    }
     static void writecontent() throws IOException{
            FileWriter fw=new FileWriter(file);
             Scanner sc=new Scanner(System.in);
            System.out.println("Enter the Content type stop to exit:");
            while(true){
              String line=sc.nextLine();
              if(line.equals("stop")){
                break;
              }
              fw.write(line+" \n");
            }
            fw.close();
        }
        static void countWords() throws IOException{
           Scanner sc=new Scanner(file);
           String lines="";
           while(sc.hasNextLine()){
            lines+=sc.nextLine();
           }
           String[] words=lines.split(" ");
           System.out.println("Word Counts : "+words.length);
        }

        static void countCharacters() throws IOException{
            FileReader fr=new FileReader(file);
            int a;
            int char_count=0;
            while((a=fr.read())!=-1){
            char_count++;
            }
            System.out.println("Character Count : "+char_count);
            fr.close();
        }
        static void countLines() throws IOException{
            Scanner sc=new Scanner(file);
            int line_count=0;
            while(sc.hasNextLine()){
                sc.nextLine();
                line_count++;
            }
            System.out.println("Line Count : "+line_count);
        }
        static void countVowelsandConsonants() throws IOException{
            FileReader fr=new FileReader(file);
            int b;
            int v_count=0;
            int c_count=0;
            while((b=fr.read())!=-1){
                char ch=(char)b;
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' )
                {
                    v_count++;
                }
                else{
                    c_count++;
                }
            }
            System.out.println("Vowels Count : "+v_count);
            System.out.println("Consonants Count : "+c_count);
        }
}