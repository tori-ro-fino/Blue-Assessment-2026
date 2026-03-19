package blueAssessment.assessment;
/** @author Tori Fino
 * Elizabethtown Spring 2026 Coding Challenge
 * March 2026
 * Psychological assessment for college students
 */

import java.util.Scanner;

/**
 * TO-DO: initialize the assessment
 * - including creating objects (initialize objects)
 * - taking user input
 * - storing user input
 * - asking questions, 
 * - outputting results and information for user
 */
public class Assessment {



    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("""
        Welcome blue jay! We're super excited
        that you've decided to use this resource.
        Please answer a few questions so we know what to target!
        """);

        System.out.print("What's your name?");
       

        System.out.print("What's your student ID number?");
        

        System.out.print("Have you taken this assessment before? Y/N");
        char returningQuest = in.next().charAt(0);
        if(returningQuest == 'Y' || returningQuest == 'y') {
            
        } else { 
            
        }

        // returning user - later class update





    }

}
