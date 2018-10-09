// WAP of Array ,List & Linked list
import java.util.*;
class Collection
{
	public static void main(String args[])
	{
		System.out.println(":::Array List:::");
		ArrayList <Integer> a1 = new ArrayList <Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		System.out.println("Array List Integer value : "+a1);;
		ArrayList <String> a2 = new ArrayList <String>();
		a2.add("Harry Potter");
		a2.add("Hermoine Granger");
		a2.add("Ron Weasliy");
		System.out.println("Array List Harry potter cast : "+a2);
		
		/*System.out.println(":::List:::");
		List <Integer> a3 = new List <Integer>();
		a3.add(10);
		a3.add(20);
		a3.add(30);
		System.out.println("List Integer value : "+a1);;
		List <String> a4 = new List <String>();
		a4.add("Harry Potter");
		a4.add("Hermoine Granger");
		a4.add("Ron Weasliy");
		System.out.println("List Harry potter cast : "+a2);*/
		
		System.out.println(":::Linked List:::");
		LinkedList <Integer> a5 = new LinkedList <Integer>();
		a5.add(10);
		a5.add(20);
		a5.add(30);
		System.out.println("Linked List Integer value : "+a1);;
		LinkedList <String> a6 = new LinkedList <String>();
		a6.add("Harry Potter");
		a6.add("Hermoine Granger");
		a6.add("Ron Weasliy");
		System.out.println("Linked List Harry potter cast : "+a2);
	}
}