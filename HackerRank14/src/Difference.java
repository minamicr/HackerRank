import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

	// Add your code here
    Difference(int[] arr){
        this.elements = arr;
    }

    public void computeDifference(){
        int arrLength = this.elements.length;
        int diff;
        
        for (int i = 0; i < arrLength; i++){
            for (int x = i + 1; x < arrLength; x++){
                diff = elements[i] - elements[x];
                diff = (diff < 0 ? diff * -1 : diff);
                if (diff > this.maximumDifference) {
                    this.maximumDifference = diff;
                }
            }
        }
    }
}
