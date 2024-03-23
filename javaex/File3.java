import java.io.*;
public class File3 {
   public static void main(String[] args) {
       // TODO Auto-generated method stub
       try {
       File f=new File("Balaji.txt");
       f.createNewFile();
       String i;
       FileWriter f1=new FileWriter("Balaji.txt");
       f1.write("Hello how are you?");
       System.out.println("The content has been written into the file successfully");
       f1.close();
       FileReader f2=new FileReader("Balaji.txt");
       BufferedReader bf=new BufferedReader(f2);//line by line
       while((i=bf.readLine())!=null) {
           System.out.println(i);
       }
       }
       catch(Exception e) {
           System.out.println(e);
       }
   }
}