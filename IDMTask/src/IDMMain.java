
public class IDMMain
{
	public static void main(String args[])
	{
		try
		{	
			String theNum = args[0];			
			System.out.println("Factorial V1 of the number "+ theNum+" is " +Factorial.factorialIterative(theNum));		
			System.out.println("~~~~~~~~~");
			System.out.println("Factorial V2 of the number "+ theNum+" is " +Factorial.factorialRecursive(new java.math.BigInteger(theNum)));	
		}
		catch (ArrayIndexOutOfBoundsException aioobe)
		{
			System.out.println("Usage :  Java IDMain <Number>");
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
			e.printStackTrace();
		}
	}

}
