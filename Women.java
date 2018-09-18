import java.util.Vector;
public class Women extends Person implements Mother,Wife,CityandCountry {

	class Cooking{
		String dish_name;
		int rating;
		
		Cooking()
		{
			dish_name=null;
			rating=0;
		}
		Cooking(String h,int r)
		{
			dish_name=h;
			rating=r;
		}
		
	}
	
	int num_of_children;
	Vector<Cooking> best_cookings;
	static int count_women;
	
	{
		count_women = count_women+1;
		best_cookings=new Vector<Cooking>();
		
	}
	
	Women(String n,int a)
	{
		super(n,a);
		num_of_children=0;
		
		
	}
	Women(String n,int a,int c)
	{
		super(n,a);
		num_of_children=c;
		
	}
	
	
	
	
	public void show_woman()
	{
		 try {

				System.out.println();
				System.out.println("--> Name of Woman is : " + name+ ", Her age is : "
				         +age+" and has childrens: "+num_of_children);
	        	
	        	
	        }catch(Exception e)
	        {
	        	System.out.println("Exception: "+e);
	        }	
		
	}
	
	public void show_add()
	{
		
        try {
        	System.out.println();
            System.out.println(name+" lives in:");
            City();
            Nationality();
        	
        	
        }catch(Exception e)
        {
        	System.out.println("Exception: "+e);
        }
        
	}
	
	
	public void add_cooking(String n,int r)
	{
		Cooking obj=new Cooking(n,r);
		best_cookings.add(obj);
	}
	
	
	public void show_all_cookings()
	{
	
		 try {
				int size=best_cookings.size();
				Cooking obj1=null;
				
				System.out.println();
				System.out.println("Best Cookings: ");
				for (int i=0; i<size; i++)
				{
				    obj1=best_cookings.get(i);
				    
					System.out.println("dish "+(i+1)+": "+obj1.dish_name+" ,rating: "+obj1.rating);
				}
	        	
	        	
	        }catch(Exception e)
	        {
	        	System.out.println("Exception: "+e);
	        }
		
	}
	
	public void responsibilities()
	{   
        try {
        	System.out.println();
            System.out.println(name+" has reponsibilities: ");
            
            if (num_of_children>0)
            {
    	        LookupChildren();
    	        FeedChildren();
            }
            
            CallHusband();
            LookupHusband();
        	
        	
        }catch(Exception e)
        {
        	System.out.println("Exception: "+e);
        }
        
	}
	
	public void FeedChildren()
	{
		
		try {
			
			System.out.println("she feeds her kids");
			
		}catch(Exception e) {
			System.out.println("Exception: "+e);
		}
		
	}
	
	
	public void CallHusband()
	{

		try {
			
			System.out.println("she calls her husband");
			
		}catch(Exception e) {
			System.out.println("Exception: "+e);
		}
		
		
	}
	
	@Override
	public void City() {
		// TODO Auto-generated method stub
	    try {
				
	    	System.out.println("city: "+city1);
				
		}catch(Exception e) {
		
			System.out.println("Exception: "+e);
		}
		
		
	}
	
	@Override
	public void Nationality() {
		// TODO Auto-generated method stub
        try {
			
        	System.out.println("country: "+ Country);
			
		}catch(Exception e) {
		
			System.out.println("Exception: "+e);
		}
		
	}
	
	
	@Override
	public void LookupChildren() {
		// TODO Auto-generated method stub
     try {
			
    	 System.out.println("she looks up her childrens");
			
		}catch(Exception e) {
			System.out.println("Exception: "+e);
		}
		
	}
	@Override
	public void LookupHusband() {
		// TODO Auto-generated method stub
      try {
			
    	  System.out.println("she looks up her Husband");
			
		}catch(Exception e) {
			System.out.println("Exception: "+e);
		}
		
		
	}
	
}
