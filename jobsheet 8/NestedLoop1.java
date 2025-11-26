import java.util.Scanner;

public class NestedLoop1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] temps = new double[5][7];

        
        for (int i = 0; i < temps.length; i++) {
            System.out.println("City " + i + ":");
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Day " + (j + 1) + ": ");
                temps[i][j] = scanner.nextDouble();
            }
            System.out.println();
        }

        
        int cityIndex = 0;
        for (double[] cityTemps : temps) {
            System.out.print("City " + cityIndex + ": ");
            
            double sum = 0;
            for (double temp : cityTemps) {
                System.out.print(temp + " ");
                sum += temp;
            }
            
            double average = sum / cityTemps.length;
            System.out.printf("→ Average: %.2f\n", average);
            
            cityIndex++;
        }

        scanner.close();
    }
}

/* 
1.Explain the program flow in Experiment 5! 
To collect and display temperature data for 5 cities over 7 days using a 2D array and nested loops
2.Modify the program to display an array using foreach! 
Done
3. Modify the program so that it can display the average value for each city!
Done
4. Commit and push the changes to GitHub
Done





*/