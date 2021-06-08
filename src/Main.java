import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        //open text file using File class and Scanner class
        File file = new File("src/weapon.txt");
                Scanner sc = new Scanner(file);
                //initializing a counter with 0
                int i =0;
                //loop that runs until the end of file (EoF)
        while (sc.hasNextLine()){
            //get first line in file
            String line =  sc.nextLine();
            //split it on two parts because in each line there are two art pieces and we need to check each one seperately
            String[] splitLine = line.split("\\) ");
            //added a closing parentheses to the first part to return it to the original state which is Forme (info,info,info,info,info)
            splitLine[0]=splitLine[0]+")";
            //test if art peice corresponds to the wanted one, if it is we increment the counter
            if(splitLine[0].equals("Boule (Pointe,Chaude,Bleu,Pleine,12 cm)"))i++;
            if(splitLine[1].equals("Boule (Pointe,Chaude,Bleu,Pleine,12 cm)"))i++;
        }
        //printing the counter
        System.out.println("murder weapon number : "+i);
    }
}
