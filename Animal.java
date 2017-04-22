/**
 * 
 */
package com.nttdata.csx.abstra.ex;

/**
 * @author user
 *
 */
public abstract class Animal {
	
	public void eat(String animalName){
		
		System.err.println("Animal Eating"+animalName);
	}
	
	public void sleep(int hours)
	   {
	        try
		{
			// 1000 milliseconds * 60 seconds * 60 minutes * hours
	        	System.err.println("SLEEP START");
			Thread.sleep ( 1000);
			System.err.println("SLEEP END");
		}
		catch (InterruptedException ie) { /* ignore */ } 
	   }
	
  public abstract void makeNoice();
}
