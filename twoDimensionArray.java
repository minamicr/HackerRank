import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class twoDimensionArray {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int rowMax = arr.length;
        int colMax = arr[0].length;
        int sumTop = 0;
        int sumMiddle = 0;
        int sumBottom = 0;
        int result = 0;
        int mayorResult = 0;
        int rowBottom = 0;
        
        for (int col = 0; col + 2 < colMax; col ++){
            for (int row = 0; row < rowMax-2; row ++) {
                rowBottom = row + 2;
                sumTop = arr[col][row] + arr[col+1][row] + arr[col+2][row];
                sumMiddle = arr[col+1][row+1];
                sumBottom = arr[col][rowBottom] + arr[col+1][rowBottom] + arr[col+2][rowBottom];
                result = sumTop + sumMiddle + sumBottom;
                if (result > mayorResult){
                    mayorResult = result;   
                }
            }
            
        }
        return mayorResult; 

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception{
        System.out.println("entro");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
