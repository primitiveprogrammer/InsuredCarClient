/**
 * 
 */
package insuredcarclient;
import javax.swing.*;

/**
 * @author Patrick Copeland
 * @version 09/25/2020
 */
public class InsuredCarClient 
{

	public static void main(String[] args) 
	{
		InsuredCar myCar = new InsuredCar();
		JOptionPane.showMessageDialog(null, myCar.toString());
	}

}
