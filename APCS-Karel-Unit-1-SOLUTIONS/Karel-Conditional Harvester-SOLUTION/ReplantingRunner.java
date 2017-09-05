import kareltherobot.*;
import java.awt.Color;

/**
 * @author 
 * teacher :
 * due date:
 */
public class ReplantingRunner implements Directions
{
    public static void main(String [] args) {
        Replanter karel = new Replanter(2, 2, East, infinity);
        
        karel.move();
        karel.harvestTwoRows();
        karel.harvestTwoRows();
        karel.harvestTwoRows();
        
        karel.turnOff();
    }
    
    static {

        World.reset();

        World.readWorld("fig5-3.kwld"); 
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(10);  
        World.setVisible(true);
    }
}
