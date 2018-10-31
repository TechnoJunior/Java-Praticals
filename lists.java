import java.util.*;    
class lists
{    
	public static void main(String args[])
	{    
		List<String> al=new ArrayList<String>();

		al.add("vikas");  
		al.add("kharat");    
		al.add("ganesh ");    
		al.add("funde");    

		List<Integer> I=new ArrayList<Integer>();
		I.add(88);  
		I.add(88);    
		I.add(11);    
		I.add(04);
		I.add(16);	
		List<String> a2=new LinkedList<String>();
		a2.add("imcost");  
		a2.add("thane");    
		a2.add("mumbai");    
		a2.add("40000");    
		List<Integer> I1=new LinkedList<Integer>();
		I1.add(88);  
		I1.add(88);    
		I1.add(11);    
		I1.add(04);
		I1.add(16);   
		System.out.println("                      ");  
		System.out.println("arraylist String: "+al);  
		System.out.println("                      ");
		System.out.println("arraylist Integer: "+I);
		System.out.println("                      ");
		System.out.println("linkedlist String: "+a2);
		System.out.println("                      ");  
		System.out.println("linkedlist Integer: "+I1);
	}    
}    
