
public class Programe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 
         Women w1 = new Women("Rameen",32,2);
         w1.add_cooking("allo wala paratha", 5);
         w1.add_cooking("mattar qemma", 4);
         w1.add_cooking("allo palak",3);
         w1.add_cooking("baryani", 5);
        
         w1.show_woman();
         w1.show_add();
         w1.responsibilities();
         w1.show_all_cookings();
         
         //
       
         Women w2=new Women("Amna",22);
         
         w2.add_cooking("kari pakora", 3);
         w2.add_cooking("mattan", 4);
         w2.add_cooking("baryani",5);
         
         w2.show_woman();
         w2.show_add();
         w2.responsibilities();
         w2.show_all_cookings();

	}

}
