import kareltherobot.*; 
/**
 * @author :
 * teacher :
 * due date:
 */
public class Hurdler extends Robot
{
    public Hurdler(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void runRace() {
        checkAndJump();
        checkAndJump();
        checkAndJump();
        checkAndJump();
        checkAndJump();
        checkAndJump();
        checkAndJump();
        checkAndJump();
    }
    
    public void checkAndJump() {
        if (frontIsClear()) {
            move();
        }
        else {
            jumpHurdle();
        }
    }
    
    public void jumpHurdle() {
        jumpUp();
        move();
        glideDown();
    }
    
    public void jumpUp() {
        turnLeft();
        move();
        turnRight();
    }
    
    public void glideDown() {
        turnRight();
        move();
        turnLeft();
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    
}

