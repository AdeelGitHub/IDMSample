import java.math.BigInteger;

public class Factorial 
{
	public static final BigInteger ONE  = new BigInteger("1");
	public static final BigInteger ZERO = new BigInteger("0");

	public static BigInteger factorialIterative(String sNum)
	{
		BigInteger n = new BigInteger(sNum);
	      if (n.equals(ZERO))
	         return ONE;

	      BigInteger i = n.subtract(ONE);
	      while (i.compareTo(ZERO) > 0)
	      {
	         n = n.multiply(i);
	         i = i.subtract(ONE);
	      }
	      return n;
	 }
	
	public static BigInteger factorialRecursive(BigInteger n)
	{
		
		if (n.equals(ZERO))
	    	return ONE;
	    else
	    	return n.multiply(factorialRecursive(n.subtract(ONE)));
	  }
	  

}
