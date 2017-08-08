package exceptions.customexception;

public class customexception {
static void authenticate(double height)throws heightexception{
	if (height<5)
		throw new heightexception("less than minimum height");
		else
			System.out.println("can enter the pool");
}
public static void main(String args[])
{
try{
	authenticate(4.8);
}
catch(Exception e){
	System.out.println("height not valid");
	System.out.println(e);
}
}
}
