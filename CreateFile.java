import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class CreateFile{
    public static void main(String[] args) {
        File myFile= new File("myfirstFile.txt");
        try{
            if(myFile.createNewFile()){
            System.out.println("File is created:"+ myFile);
            FileWriter writeFile= new FileWriter("myfirstFile.txt");
            writeFile.write("Hello this is my first file created through java command.");
            writeFile.close();
        }
        else{
            System.out.println("File already exists.");
            try{
                Scanner myReader= new Scanner(myFile);
                if(myReader.hasNextLine()){
                    System.out.println("File has something written in it.......parsing.........");
                      while(myReader.hasNextLine()){
                        String content= myReader.nextLine();
                        System.out.println(content);
            }
              myReader.close();
              System.out.println("File Information :-\n"+ myFile.getName()+"\n"+ myFile.getAbsolutePath()+"\n"+myFile.length());
                }else{
                    System.out.println("File is empty");
                   System.out.println( myFile.delete()?"File Deleted Successfully":"File Deletion failed");
                }
          
            }catch(FileNotFoundException e){
              System.out.println("An error occurred");
               e.printStackTrace();

            }
            
        }
        }catch(Exception e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

