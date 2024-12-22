/*class NumberRangeException extends Exception
{
	String msg;
	NumberRangeException( )
	{
		msg = new String("Enter a number between 20 and 100");
	}
}
public class MyException
{
public static void main (String args [ ])
	{
		try
	{
		int x = 10;
	if (x < 20 || x >100) throw new NumberRangeException( );
	}
	catch (NumberRangeException e)
	{
	System.out.println (e);
	}
	}
}
*/


class NumberException extends Exception{
	String msg;
	NumberException(){
		msg=new String("THE NUMBER BETWEEN 20 AND 100");
	}
}
class MyException{
	public static void main(String[] args){
		try{
			int x=10;
			if(x<20 || x>100) throw new NumberException();
		}
		catch(NumberException e){
			System.out.println(e);
		}
	}
}