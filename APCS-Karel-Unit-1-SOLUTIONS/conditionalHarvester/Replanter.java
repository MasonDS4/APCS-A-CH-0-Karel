import kareltherobot.*; 
/**
 * @author :
 * teacher :
 * due date:
 */
public class Replanter extends Harvester
{
    public Replanter(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
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
    }
    
    public void harvestCorner() {
        //Example of nested conditional that overrides the parent method "harvestCorner"
        if (! nextToABeeper()) {
            putBeeper();
        }
        else {
            pickBeeper();
            if (!nextToABeeper()) {
                putBeeper();
            }
        }
    }
}

