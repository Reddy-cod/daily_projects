package com.ibm.Collections;

import java.util.HashSet;
import java.util.Iterator;

public class Application
{
	public static void main( String[] args )
	{
		HashSet<String>linkedList=new HashSet<String>();
		linkedList.add("AA");
		linkedList.add("BB");
		linkedList.add("CC");
		linkedList.add("AA");
		Iterator<String>iterator=linkedList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
	}
}