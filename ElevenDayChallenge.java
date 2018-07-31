import java.io.*;
import java.util.*;

public class ElevenDayChallenge {

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            int[][] arr = new int[6][6];
    
            for (int i = 0; i < 6; i++) {
                String[] arrRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    
                for (int j = 0; j < 6; j++) {
                    int arrItem = Integer.parseInt(arrRowItems[j]);
                    arr[i][j] = arrItem;
                }
            }

            int maxHour = countHour(arr);
            System.out.println(maxHour);
    
            scanner.close();
        }   
        
        private static int countHour(int[][] arr){
            int maxLine = arr.length - 2;
            int maxCol = arr[0].length - 2;
            int sumMaxHour = 0;
            int sumHour = 0;
            int sumTop = 0;
            int sumMiddle = 0;
            int sumBottom = 0;
            boolean firstResult = true;

            for (int line = 0; line < maxLine; line++){
                for (int col = 0; col < maxCol; col ++) {
                    sumTop += arr[line][col] + arr[line][col+1] + arr[line][col+2];
                    sumMiddle += arr[line+1][col+1];
                    sumBottom += arr[line+2][col] + arr[line+2][col+1] + arr[line+2][col+2];
                    sumHour = sumTop + sumMiddle + sumBottom;

                    System.out.println(" " + sumHour + " ");
                    if (firstResult || (sumHour > sumMaxHour)) {
                        sumMaxHour = sumHour;
                        firstResult = false;
                    } 

                    sumHour = 0;
                    sumTop = 0;
                    sumMiddle = 0;
                    sumBottom = 0;
                }
            }
            
            return sumMaxHour;
        }

}