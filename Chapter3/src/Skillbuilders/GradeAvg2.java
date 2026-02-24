package Skillbuilders;
import java.text.NumberFormat;
import java.util.Scanner;

public class GradeAvg2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        
        System.out.println("Enter grade 1: ");
        total += input.nextInt();

        System.out.println("Enter grade 2: ");
        total += input.nextInt();

        System.out.println("Enter grade 3: ");
        total += input.nextInt();

        System.out.println("Enter grade 4: ");
        total += input.nextInt();

        System.out.println("Enter grade 5: ");
        total += input.nextInt();

        double average = total / 5.0;
        
        NumberFormat percent = NumberFormat.getPercentInstance(); 
        
        percent.setMinimumFractionDigits(2); 
       
        String av = percent.format(average / 100);
        
        System.out.println("Your average is: " + av);
    }
}
