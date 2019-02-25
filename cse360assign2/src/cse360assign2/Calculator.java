package cse360assign2;

/** 
 * @author Oscar Magaña
 * Class ID: 465
 * Assignment #: 2
 * Description: The calculator class contains several methods that perform
 * the functions of a basic calculator.
 */

public class Calculator 
{

	private int total;
	private String history;
	
	/**
	 * Default class constructor
	 */
	public Calculator () 
	{
		total = 0;
		history = "0 ";
	}
	
	/**
	 * Returns the current, running total
	 * 
	 * @return the value of total
	 */
	public int getTotal () 
	{
		return total;
	}
	
	/**
	 *  Adds 'value' to 'total' and updates the history string
	 *  with an addition sign and 'value'
	 *  
	 *  @param value to be added to total
	 */
	public void add (int value) 
	{
		total += value;
		history += "+ " + value + " ";
	}
	
	/**
	 * Subtracts 'value' from 'total' and updates the 
	 * history string with a subtraction sign and 'value'
	 * 
	 * @param value to be subtracted from total
	 */
	public void subtract (int value) 
	{
		total -= value;
		history += "- " + value + " ";
	}
	
	/**
	 * Multiplies 'total' by 'value' and updates the
	 * history string with a multiplication sign and 'value'
	 * 
	 * @param value which total is to be multiplied by
	 */
	public void multiply (int value) 
	{
		total *= value;
		history += "* " + value + " ";
	}
	
	/**
	 * Divides 'total' by 'value' using integer division, setting the total
	 * to 0 if 'value' is 0, and updates the history string with a division
	 * sign and 'value'
	 * 
	 * @param value which total is to be divided by
	*/
	public void divide (int value) 
	{
		if (value == 0)
			total = 0;
		else 
			total /= value;
		
		history += "/ " + value + " ";
	}
	
	/**
	 * The getHistory method returns a history of all actions as a string.
	 * @return the history string
	 */
	public String getHistory () 
	{
		return history;
	}
}