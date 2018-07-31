import java.util.Scanner;

import javax.swing.JOptionPane;

public class ThirdDayChallenge {
    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double taxTip = 0;
        double tax = 0;
        int totalCost = 0;        
        
        taxTip = meal_cost * (tip_percent / 100.00);
        tax = meal_cost * (double)(tax_percent / 100.00);
        
        totalCost = (int) Math.round(meal_cost + taxTip + tax);
        System.out.println("The total meal cost is " + totalCost + " dollars.");

    }

    

    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	String resp = JOptionPane.showInputDialog(null, "insert meal cost (double)");
        double meal_cost = Double.parseDouble(resp);
        
        resp = JOptionPane.showInputDialog(null, "insert a tip_percent (int)");
        int tip_percent = Integer.parseInt(resp);

        resp = JOptionPane.showInputDialog(null, "insert a tax_percent (int)");
        int tax_percent = Integer.parseInt(resp);
        
        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }


}
