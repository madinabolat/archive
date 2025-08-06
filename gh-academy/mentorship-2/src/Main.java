import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void printBoard(String[][] array){
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[0].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static String[][] createEmptyBoard(int n){
        String[][] gameBoard = new String[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                gameBoard[i][j] = "-";}
        }
        return gameBoard;
    }
    public static void placeElementHere(String[][] array, String p, int i, int j){
        array[i][j]=p;
        printBoard(array);
    }
    public static String takeUserInput(int m){
        Scanner scannerInput = new Scanner(System.in);
        System.out.println("player"+m+", enter cell position in the format of row-column (Ex.: 1-1 for a cell in row 1, column 1. Rows and columns start from 1");
        String userInput = scannerInput.nextLine();s
        return(userInput);
    }
    public static void checkIfWon(String playerSign, String[][] gameBoard, int n){
        for (int i = 0; i < n; i++){
            int counter = 0;
            for (int j = 0; j < n; j++){
                if (gameBoard[i][j] == playerSign) {
                    counter += 1;
                }
                if (counter == n){
                    System.out.println("Player '"+playerSign+"' won!");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        String[][] gameBoard = createEmptyBoard(3);
        printBoard(gameBoard);
        int n = 3;
        int maxStepsFirstUser = n * n / 2 + 1;
        int maxStepsSecondUser = n * n - maxStepsFirstUser;
        String[] positionsFirstUser = new String[maxStepsFirstUser];
        String[] positionsSecondUser = new String[maxStepsSecondUser];

        for (int i = 0; i < maxStepsFirstUser; i++){
            positionsFirstUser[i] = takeUserInput(1);
            int i1 = Integer.parseInt(String.valueOf(positionsFirstUser[i].charAt(0)))-1;
            int j1 = Integer.parseInt(String.valueOf(positionsFirstUser[i].charAt(2)))-1;
            placeElementHere(gameBoard,"x",i1,j1);
            if (i == maxStepsFirstUser-1){
                break;
            }
            positionsSecondUser[i] = takeUserInput(2);
            int i2 = Integer.parseInt(String.valueOf(positionsSecondUser[i].charAt(0)))-1;
            int j2 = Integer.parseInt(String.valueOf(positionsSecondUser[i].charAt(2)))-1;
            placeElementHere(gameBoard,"o",i2,j2);
        }

        checkIfWon("x", gameBoard, n);

        //next steps: check if won "o"
        //errors 
    }
}