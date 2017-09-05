package lab_3.pair_programming;

import kareltherobot.*;
import java.awt.Color;

public class Problem1 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem1(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void checkSurrounded(){
        //Initially facing North
        if(frontIsClear()) {
            turnLeft();
            //Facing West
            if(frontIsClear()) {
                turnLeft();
                //Facing south
                if(frontIsClear()) {
                  turnLeft();   
                  //Facing East
                  if(frontIsClear()) {
                      turnLeft();
                      
                    }
                    
                }
            }
        }
        
    }
}

