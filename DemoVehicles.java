/**
 * 
 */
package insuredcarclient;
import javax.swing.*;

/**
 * @author Patrick Copeland
 * @version 09/25/2020
 */
public class DemoVehicles 
{

	public static void main(String[] args) 
	{
		Sailboat aBoat = new Sailboat();
		Bicycle aBike = new Bicycle();
		
		JOptionPane.showMessageDialog(null, "\nVehicle description:\n" + aBoat.toString() + "\n" + aBike.toString());
	}

}
