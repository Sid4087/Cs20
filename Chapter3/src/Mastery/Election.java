/*
Program: Election.java   Last Date of this Revision: February 17, 2026

Purpose: The purpose of the code is to get the total votes from three states, 
calculate each candidate’s overall percentage, and display the final election results.

Author: Saeid Abdalla 
School: CHHS
Course: Computer Science 20
*/

package Mastery;
import java.util.Scanner;
import java.text.NumberFormat;

public class Election {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        int NYAwbrey, NYMartinez;
        int NJAwbrey, NJMartinez;
        int CAwbrey, CMartinez;

        
        System.out.println("Election results for New York");
        
        System.out.println("Awbrey:");
        NYAwbrey = input.nextInt();
        
        System.out.println("Martinez:");
        NYMartinez = input.nextInt();
       
     
        System.out.println("\nElection results for New Jersey");
        
        System.out.println("Awbrey:");
        NJAwbrey = input.nextInt();
        
        System.out.println("Martinez:");
        NJMartinez = input.nextInt();

        System.out.println("\nElection results for Connecticut");
        
        System.out.println("Awbrey:");
        CAwbrey = input.nextInt();
        
        System.out.println("Martinez:");
        CMartinez = input.nextInt();

        
        System.out.println("\nElection Results for New Jersey:");
        System.out.println("Awbrey: " + NJAwbrey);
        System.out.println("Martinez: " + NJMartinez);

        System.out.println("\nElection Results for Connecticut:");
        System.out.println("Awbrey: " + CAwbrey);
        System.out.println("Martinez: " + CMartinez);

        System.out.println("\nElection Results for New York:");
        System.out.println("Awbrey: " + NYAwbrey);
        System.out.println("Martinez: " + NYMartinez);

        
        int totalAwbrey = NYAwbrey + NJAwbrey + CAwbrey;
        int totalMartinez = NYMartinez + NJMartinez + CMartinez;
        int totalvotes = totalAwbrey + totalMartinez;

        
        double AwbreyPercent = totalAwbrey * 100.0 / totalvotes;
        double MartinezPercent = totalMartinez * 100.0 / totalvotes;
        
        NumberFormat decimal = NumberFormat.getNumberInstance();
        decimal.setMaximumFractionDigits(2);
        
        

    

        System.out.println("\nCandidate\tVotes\tPercentage");
        System.out.println("Awbrey\t\t" + totalAwbrey + "\t" + decimal.format(AwbreyPercent) + " %");
        System.out.println("Martinez\t" + totalMartinez + "\t" + decimal.format(MartinezPercent) + " %");
        System.out.println("Total Votes\t" + totalvotes);



        
    }
}
/*ScreenDump
Election results for New York
Awbrey:
314159
Martinez:
271860

Election results for New Jersey
Awbrey:
89008
Martinez:
121032

Election results for Connecticut
Awbrey:
213451
Martinez:
231034

Election Results for New Jersey:
Awbrey: 89008
Martinez: 121032

Election Results for Connecticut:
Awbrey: 213451
Martinez: 231034

Election Results for New York:
Awbrey: 314159
Martinez: 271860

Candidate	Votes	Percentage
Awbrey		616618	49.71 %
Martinez	623926	50.29 %
Total Votes	1240544





 */