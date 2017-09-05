import kareltherobot.*; 
import java.awt.Color;
/**
 * @author :
 * teacher :
 * due date:
 */
public class HurdleRunner implements Directions
{
    public static void main(String [] args) {
        Hurdler karel = new Hurdler(1, 1, East, 0);
        
        karel.runRace();

        karel.turnOff();
    }
    
    static {

        World.reset();

        World.readWorld("fig5-2.kwld"); 
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(10);  
        World.setVisible(true);
    }
}

