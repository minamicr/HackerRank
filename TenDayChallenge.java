import java.io.*;
import java.util.*;

public class TenDayChallenge {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        String binaryNumber = convertToBinary(inputNumber);
        System.out.println(binaryNumber);
        int consecutiveOnes = countConsecutiveOnes(binaryNumber);
        System.out.println(consecutiveOnes);
        scanner.close();
    }

    private static String convertToBinary(int inputNumber) {
        StringBuilder resultBinary = new StringBuilder();
        int result = inputNumber;
        int restDivision = 0;

        while(result >= 2){
            restDivision = result % 2;
            result = result / 2;
            resultBinary.append(restDivision);
        }

        resultBinary.append(result);
        return resultBinary.reverse().toString();
    }

    private static int countConsecutiveOnes(String binaryNumber){
        int mayorQtd = 0;
        int actualQtd = 0;

        for(int i = 0; i < binaryNumber.length(); i++) {
            if(binaryNumber.substring(i, i+1).equals("1")){
                actualQtd++;
            } else {
                if (actualQtd > mayorQtd){
                    mayorQtd = actualQtd;
                }
                actualQtd = 0;
            }
        }

        if ((mayorQtd == 0) || (actualQtd > mayorQtd)){
            mayorQtd = actualQtd;
        }

        return mayorQtd;
    }
}