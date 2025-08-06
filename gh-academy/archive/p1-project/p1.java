// import java.io.FileNotFoundException;
// import java.io.FileReader;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class p1 {
    //    public static void main(String[] args) throws FileNotFoundException {
    //       System.out.println("Hello World");
    //        FileReader input = new FileReader("input.txt");
    //    }


    // main driver method
    public static void main(String[] args) throws Exception {
        File inputDirectory = new File(
                "C:\\Users\\Madina\\OneDrive\\Documents\\GitHub\\testrepo\\p1-project\\input.txt");
        // inputDirectory stores the file directory

        FileReader inputData = new FileReader(inputDirectory);
        // reads data from the input, stores data in byte format

        BufferedReader inputText = new BufferedReader(inputData);
        // reads text from the character based inputData


        String inputAsString = inputText.readLine();
        // System.out.println(inputAsString.length());

        FileWriter outputFile = new FileWriter("output.txt");
        outputFile.write(inputAsString);
        outputFile.close();


        // I want to convert "Hi! I am." string into an array of "Hi", "!", " ", "I", " ", "am", "."
        String[] words = inputAsString.split(".! ");
        System.out.print(words[1]);
        // System.out.print(words[1]);
        // System.out.print(words[2]);
        // for (int i = 0; i < words.length; i++) {System.out.print(words[i]);}

    }

}


