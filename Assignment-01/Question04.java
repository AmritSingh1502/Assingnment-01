
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Question04 {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        //input file
        File inputFile = new File("Alphabets.txt");
        FileReader inputReader = new FileReader(inputFile);


        //output file
        File outputFile = new File("Consonants.txt");
        FileWriter outputWriter = new FileWriter(outputFile);

        BufferedReader Reader = new BufferedReader(inputReader);
        int temp;

        while ((temp = Reader.read()) != -1) {
            char c = (char) temp;

            if (Question04.isVowel(c) == false) {
                outputWriter.append(c);
            } else {
                try {
                    throw new VowelNotAllowedException("Vowel Found!");
                } catch (VowelNotAllowedException e) {}
            }
        }
        outputWriter.close();
        Reader.close();

    }

    //checking for vowels

    public static boolean isVowel(char c) {
        if (c == 'a' || c == 'A')
            return true;
        else if (c == 'e' || c == 'E')
            return true;
        else if (c == 'i' || c == 'I')
            return true;
        else if (c == 'o' || c == 'O')
            return true;
        else if (c == 'u' || c == 'U')
            return true;
        else
            return false;
    }
}

//vowelNotAllowed user defined exception

class VowelNotAllowedException extends Exception {

    VowelNotAllowedException(String str) {

        System.out.println(str);
    }
}