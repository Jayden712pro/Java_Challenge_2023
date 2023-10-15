//Question 1

import java.lang.Math;

class Q1 {
    public static void main(String args[]){
        int rollNum = 0;
        int diceRange = 6;

        for(int i = 1; i<=20; i++){
            rollNum = (int)((Math.random() * (diceRange))+1);
            System.out.print("Roll "+ i + " = " + rollNum + "\n");
        }

    }
}
