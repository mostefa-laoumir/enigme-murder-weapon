import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        File file =
                new File("src/weapon.txt");
                Scanner sc = new Scanner(file);
int i =0;
        while (sc.hasNextLine()){
           String line =  sc.nextLine();
           //if(line.equals("Boule (Pointe,Chaude,Bleu,Pleine,12 cm) Boule (Pointe,Chaude,Bleu,Pleine,12 cm)"))i++;
            String[] splitLine = line.split("\\) ");
            splitLine[0]=splitLine[0]+")";
            if(splitLine[0].equals("Boule (Pointe,Chaude,Bleu,Pleine,12 cm)"))i++;
            if(splitLine[1].equals("Boule (Pointe,Chaude,Bleu,Pleine,12 cm)"))i++;
        }
        System.out.println("murder weapon number : "+i);
    }
}
