
abstract public class Person {

	String name;
	int age;
	
	Person(String n, int a)
	{
		name=n;
		age=a;
	}
	
	@SuppressWarnings("finally")
	String ageBelongs()
	{
		String agebelong=null;
		try {
		
			if (age<13)
			{
				agebelong="Child";
			}
			else
			{
				agebelong="Mature";
			}
		}catch(Exception e)
		{
			System.out.println("Exception: "+e);
		}
		finally
		{
			return agebelong;
		}
		
	}
	
	
	public abstract void City();
	public abstract void Nationality();
	
	
}
