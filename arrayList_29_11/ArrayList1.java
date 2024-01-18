package arrayList_29_11;

import static org.hamcrest.CoreMatchers.equalToObject;

import java.util.*;

public class ArrayList1 {
	
	public static void main(String[] args) throws Throwable {
		ArrayList list=new ArrayList();
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		
		list.add("Hyderabad");
		list.add("Benglur");
		list.add("Mumbai");
		list.add("Kolkata");
	     list.addAll(list1);
	    List sublist= list.subList(2, 7);
		Iterator iterator=sublist.iterator();
		//System.out.println(list.size());
		System.out.println("-----------------------");
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		System.out.println("-----------------------");
		ArrayList list3=new ArrayList();
		Object obj=list.clone();
		System.out.println(obj);
		Collections.sort(list);
		System.out.println(list.isEmpty());
		System.out.println(list1.removeIf(n->(n%3==0)));
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		System.out.println("\n\n");
		list.retainAll(list1);
		
		Iterator iterator1=list1.iterator();
		while(iterator1.hasNext())
		{
			System.out.println(iterator1.next());
		}
	      
        
	}
}
