package Skillbuilders;
import java.util.Scanner;

public class GradeAvg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter grade 1: ");
        int grade1 = input.nextInt();

        System.out.println("Enter grade 2: ");
        int grade2 = input.nextInt();
       
        System.out.println("Enter grade 3: ");
        int grade3 = input.nextInt();
        
        System.out.println("Enter grade 4: ");
        int grade4 = input.nextInt();
        
        System.out.println("Enter grade 5: ");
        int grade5 = input.nextInt();
        
       double average = (grade1 + grade2 + grade3 + grade4 + grade5 ) /5;
       
       System.out.println("Your average is: " + average);
       
            }
        }
