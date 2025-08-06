import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.StringTokenizer;

public class decompress {
    public static void main(String[] args) throws Exception{
        // 4. Read compressed file and decompress.
        File inputDirectory = new File("/Users/madinabolat/Documents/GitHub/testrepo/p1/src/output.sc");
        FileReader inputData = new FileReader(inputDirectory);
        BufferedReader inputText = new BufferedReader(inputData);
        StringBuffer stringBuffer = new StringBuffer();
        String line;
        while ((line=inputText.readLine()) != null) {
            stringBuffer.append(line);
            stringBuffer.append(System.lineSeparator());
        }

        inputText.close();

        String inputAsString = stringBuffer.toString();
        //System.out.println(inputAsString);

        StringTokenizer inputAsTokens = new StringTokenizer(inputAsString, "\n");
        int numberTokens = inputAsTokens.countTokens();
        String[] allTokens = new String[numberTokens];
        while (inputAsTokens.hasMoreTokens())
            for (int i = 0; i < numberTokens; i++) {
                allTokens[i] = inputAsTokens.nextToken();
            }

        String[] codes = new String[numberTokens-1];
        String[] words = new String[numberTokens-1];
        for (int i=0; i < numberTokens-1; i++){
            StringTokenizer element = new StringTokenizer(allTokens[i], "-");
            codes[i]= element.nextToken();
            //System.out.println("code: "+codes[i]);
            words[i]= element.nextToken();
            //System.out.println("word: "+words[i]);
        }

        String encodedMessage = allTokens[numberTokens-1];
        StringTokenizer encodedMessageTokens = new StringTokenizer(encodedMessage, " ");
        int numberWords = encodedMessageTokens.countTokens();
        String[] encodedMessageArray = new String[numberWords];
        while (encodedMessageTokens.hasMoreTokens())
            for (int i = 0; i < numberWords; i++) {
                encodedMessageArray[i] = encodedMessageTokens.nextToken();
            }
        //for (int i = 0; i < numberWords; i++) {System.out.println(encodedMessageArray[i]);}

        String[] decodedMessageArray = new String[numberWords];
        for (int i = 0; i < numberWords; i++) {
            for (int j = 0; j < codes.length; j++){
                if(encodedMessageArray[i].equals(codes[j])){
                    decodedMessageArray[i]=words[j];
                }
            }
            //System.out.println(decodedMessageArray[i]);
        }

        StringBuilder decodedMessageBuilder = new StringBuilder();
        for (int i = 0; i < numberWords; i++) {
            decodedMessageBuilder.append(decodedMessageArray[i]);
        }
        String decodedMessage = decodedMessageBuilder.toString();
        System.out.println(decodedMessage);

        // create output.txt
        FileWriter outputFile = new FileWriter("readable.txt");
        outputFile.write(decodedMessage);
        outputFile.close();

    }
}
