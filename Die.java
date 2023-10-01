import java.lang.Math;

//Question 2's class
class Die {

    int sideNum = 0;
    int rolls;
    int lastRoll = -1;

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

    public String manyRolls(int num){
        String finalString = "";
        if(num > 0){
            for(int i = num; i > 0; i--){
                roll();
                finalString = toString() + "\n";
            }
            return finalString;
        }
        else {
        return "Number of rolls are invalid";
        }
    }

}
