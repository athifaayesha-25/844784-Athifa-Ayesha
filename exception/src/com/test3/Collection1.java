package com.test3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Collection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Object> hset=new HashSet<Object>();//random order
		//Set hset=new HashSet();//valid
		//unordered
		hset.add(244);
		hset.add(new Integer("2"));
		hset.add(new Integer("4"));
		hset.add(new Integer("2"));
		hset.add(new Float("43.654"));
		hset.add(new String("devi"));
		System.out.println("hashset Contains: "+hset);
		System.out.println("Size of HashSet: "+hset.size());
		System.out.println("Is HashSet empty ? "+hset.isEmpty());
		Iterator itr=hset.iterator();//Iterator Interface
		System.out.println("HashSet contains: ");
		while(itr.hasNext())//i++
			System.out.println(itr.next());//display the current element
		List<Object> arrayList=new ArrayList<Object>();//valid syntax
		arrayList.add("4");
		arrayList.add("25");
		arrayList.add("7");
		arrayList.add("4");
		arrayList.add("devi");
		arrayList.add(32.54f);
		System.out.println("ArrayList Contains: "+arrayList);
		for(Object a:arrayList)
			System.out.println(a);
		
		

	}

}
