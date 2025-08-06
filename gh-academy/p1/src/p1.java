import java.io.*;
import java.sql.SQLOutput;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class p1 {
    public static void main(String[] args) throws Exception{
        //1. read file,
        File inputDirectory = new File("/Users/madinabolat/Documents/GitHub/testrepo/p1/input.txt");
        FileReader inputData = new FileReader(inputDirectory);
        BufferedReader inputText = new BufferedReader(inputData);
        String inputAsString = inputText.readLine();

        //2.1 identify all words in a text, assign a code to each
        StringTokenizer inputAsTokens = new StringTokenizer(inputAsString, " :!,.?;", true);
        int numberTokens = inputAsTokens.countTokens();
        String[] allWords = new String[numberTokens];
        while (inputAsTokens.hasMoreTokens())
            for (int i = 0; i < numberTokens; i++) {
                allWords[i] = inputAsTokens.nextToken();
            }

        LinkedHashSet<String> hashSet = new LinkedHashSet<String>();
        for (int i = 0; i < numberTokens; i++) {
            hashSet.add(allWords[i]);
        }
        Object[] uniqueWordsObjectArr = hashSet.toArray();
        String[] uniqueWords = new String[uniqueWordsObjectArr.length];
        for (int i = 0; i < uniqueWords.length; i++) {
            uniqueWords[i]=uniqueWordsObjectArr[i].toString();
        }

        //2.2 assign a code to each
        int[] wordCodes = new int[uniqueWords.length];
        for (int i = 0; i < uniqueWords.length; i++) {
            wordCodes[i]=i;
        }

        //2.3 encoded text
        String[] encodedMessage = new String[allWords.length];
        for (int i = 0; i < allWords.length; i++) {
            for (int j=0; j<uniqueWords.length; j++){
                //find position j of allWords[i] in uniqueWords, return the position
                if (allWords[i].equals(uniqueWords[j])){
                    encodedMessage[i]=String.valueOf(j);
                }
            }
        }

        // 3. Compress into output file (output.sc)
        FileWriter outputFile = new FileWriter("output.sc");
        BufferedWriter output = new BufferedWriter(outputFile);
        for (int i = 0; i < uniqueWords.length; i++) {
            output.write(String.valueOf(wordCodes[i]));
            output.write("-");
            output.write(uniqueWords[i]);
            output.newLine();
        }
        for (int i = 0; i < encodedMessage.length; i++) {
            output.write(encodedMessage[i]);
            output.write(" ");
        }
        output.close();
    }


}

