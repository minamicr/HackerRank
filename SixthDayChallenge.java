import java.io.*;
import java.util.*;

public class SixthDayChallenge {

    public static void main(String[] args) {
        String myString = "";
        String oddString;
        String evenString;
        String letter;

        Scanner scanner = new Scanner(System.in);
        int qtdStrings = scanner.nextInt();

        for (int i = 0; i < qtdStrings; i++){
            myString = scanner.nextLine();
            oddString = "";
            evenString = "";

            for (int j = 0; j < myString.length(); j++){
				letter = myString.substring(j, j+1);
                if (j == 0 || (j % 2 == 0)){
                    evenString = evenString + letter;
                } else {
                    oddString = oddString + letter;
                }
            }
            System.out.println(evenString + "  " + oddString);
        }
        
        scanner.close();
    }
}