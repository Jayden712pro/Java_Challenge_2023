

import java.lang.Math;
import java.util.ArrayList;

//Question 2's class
public class Die {

    public int sideNum = 0;
    public int rolls;
    public int lastRoll = -1;
    ArrayList<Integer> list_rolls = new ArrayList<Integer>();

    public Die(){
        sideNum = 6;
        rolls = 0;
        lastRoll = -1;
    }

    public Die(int N){
        sideNum = N;
        rolls = 0;
        lastRoll = -1;
        
    }

    int numSides(){
        return sideNum;
    }

    int roll(){
        lastRoll = (int)((Math.random() * (sideNum))+1);
        rolls++;
        return lastRoll;
    }

    int readLastRoll(){
        return lastRoll;
    }

    public String toString(){
        return "Roll " + rolls + " = " + lastRoll;
    }

    public void manyRolls(int num){
        ArrayList<Integer> temprolls = new ArrayList<Integer>();
        if(num > 0){
            for(int i = num; i > 0; i--){
                roll();
                temprolls.add(readLastRoll());
            }
            temprolls = list_rolls;

        }
        else {
        System.out.println("Number of rolls are invalid");

        }
    }

    public String printListCount(){
        String returner = "The numbers of rolls that landed on that number";
        for(int i = 1; i < sideNum+1; i++){
            int numofnum = 0;
            for(int i2 = 0; i < list_rolls.size(); i2++){
                int currentroll = list_rolls.get(i2);
                if(currentroll == i){
                    numofnum++;
                }
            }
            returner = "Rolls on " + i + ": " + numofnum + "\n";
        }
        return returner;
    }

}
