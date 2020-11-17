/**
 * 
 */
package insuredcarclient;
import javax.swing.*;

/**
 * @author Patrick Copeland
 * @version 09/25/2020
 */
public class Sailboat extends Vehicle
{
	public int length;

	public Sailboat() 
	{
		super("wind", 0);
		setLength();
	}
	
	public void setLength()
	{
		String entry;
		entry = JOptionPane.showInputDialog(null, "Enter sailboat length in feet: ");
		length = Integer.parseInt(entry);
	}
	
	public int getLength()
	{
		return length;
	}
	
	@Override
	public void setPrice()
	{
		String entry;
		final int MAX = 100000;
		entry = JOptionPane.showInputDialog(null, "Enter sailboat price ");
		price = Integer.parseInt(entry);
		if(price > MAX)
		{
			price = MAX;
		}
	}
	
	@Override
	public String toString()
	{
		return("The " + getLength() + " foot sailboat is powered by " + getPowerSource() + "; it has " + getWheels() + " wheels and costs $" + getPrice());
	}

}
