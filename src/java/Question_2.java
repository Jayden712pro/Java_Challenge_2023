//Question 2 refer to Die.Java

import java.util.ArrayList;
import java.util.Scanner; 

public class Question_2 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want a custom die? Please type Y or N.");
        String yrn = scan.nextLine();
        if(yrn.equals("Y")){
            System.out.println("Please enter the number of sides your dice has");
            int numSides = scan.nextInt();
            Die theDie = new Die(numSides);
        }
        else {
            Die theDie = new Die();
        }
        System.out.println("How many times do you want to roll the dice");
        int rolls = scan.nextInt();
        System.out.println("Rolling " + rolls + " times.");
        theDie.manyRolls(rolls);
        System.out.println(theDie.printListCount());
        
    }

    
}

