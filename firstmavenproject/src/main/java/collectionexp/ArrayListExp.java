package collectionexp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListExp {

	public static void main(String[] args) {
		ArrayList <String> fruits = new ArrayList <String>();
		fruits.add("Apple");
		fruits.add("Grape");
		fruits.add("Mango");
		System.out.println(fruits);
		ArrayList <String> veg = new ArrayList <String>();
		veg.add("Carrot");
		veg.add("Beetroot");
		veg.add("Bean");
		System.out.println(veg);
		//fruits.addAll(veg);
		fruits.addAll(1, veg);
		System.out.println(fruits);
		fruits.add(0, "PineApple");
		System.out.println(fruits);
		System.out.println("Returning element :"+fruits.get(1));
		fruits.set(1, "Orange");//replace
		System.out.println(fruits);
		System.out.println(fruits.remove("PineApple"));
		System.out.println(fruits);
		System.out.println(fruits.isEmpty());
		System.out.println(fruits.lastIndexOf("Grape"));
		for(String f: fruits) {
			System.out.println(f);
		}
		Collections.sort(fruits);
		System.out.println(fruits);
		Iterator itr = fruits.iterator();//getting the iterator
		while(itr.hasNext()) { // check if iterator has the element, returns boolean value
			//System.out.println(itr.hasNext());
			System.out.println(itr.next()); // returns object,printing the element and move to next
			
		}
		HashSet <Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(2);
		System.out.println(set); // duplicate elements will not print
		
		LinkedList <Double> ls = new LinkedList<Double>();

	}

}
