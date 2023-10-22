//Question 2 refer to Die.Java

import java.util.Scanner; 

public class Question_2 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want a custom die? Please type Y or N.");
        String yrn = scan.nextLine();
        Die theDie1 = new Die();
        if(yrn.equals("Y")){
            System.out.println("Please enter the number of sides your dice has");
            int numSides = scan.nextInt();
            theDie1.reAssignSide(numSides);
        }
        System.out.println("How many times do you want to roll the dice");
        int rolls = scan.nextInt();
        System.out.println("Rolling " + rolls + " times.");
        theDie1.manyRolls(rolls);
        System.out.println(theDie1.printListCount());
        System.out.println("Creating another die, how many sides do you want it to have.");
        int numSides1 = scan.nextInt();
        Die theDie2 = new Die(numSides1); 
        System.out.println("Printing out both die results");
        int roll1 = theDie1.roll();
        int roll2 = theDie2.roll();
        System.out.println(roll1 + " + " + roll2 + " = " + (roll1+ roll2));
       }

    
}

