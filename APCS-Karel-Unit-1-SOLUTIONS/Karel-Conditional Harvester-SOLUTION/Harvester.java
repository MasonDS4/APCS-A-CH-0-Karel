import kareltherobot.*; 
/**
 * @author :
 * teacher :
 * due date:
 */
public class Harvester extends Robot
{
    //Constructor method that utilizes the constructor method of the super class (UrRobot)
    public Harvester(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);

    }
    
    public void harvestTwoRows() {
        //Before executing this, the robot needs to be facing east
        //Also, the robot must be on the first beeper of the current row
        harvestOneRow();
        goToNextRow();
        harvestOneRow();
        positionForNextHarvest();
        
        //Your code goes here.
    }
    
    private void positionForNextHarvest() {
        //Before executing this, the robot should be facing west, on the last 
        // corner of the current row.  After executing this, the robot should be facing east
        // on a corner of a row that is ready to harvest.
        turnRight();
        move();
        turnRight();
        //Your code goes here
    }
    
    private void turnRight() {
        //Your code goes here
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void harvestOneRow() {
        //The robot should pick all beepers in the given row
        harvestCorner();
        move();
        harvestCorner();
        move();
        harvestCorner();
        move();
        harvestCorner();
        move();
        harvestCorner();
        move();
        harvestCorner();
       
    }
    
    public void harvestCorner() {
        //Picks up a beeper on a given corner
        pickBeeper();
    }
    
    private void goToNextRow() {
        //Before executing this, the robot should be facing East on the last corner
        // of the current row.  After executing this, the robot should be facing west
        turnLeft();
        move();
        turnLeft();
        //your code goes here
    }
}

