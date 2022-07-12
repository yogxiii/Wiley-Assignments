package com.yogesh.treehashset;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TresSetCompareDemo {

	public static void main(String[] args) {

		Set<CD> dataCollection=new TreeSet<CD>();
		
		System.out.println("Size of dataCollection : "+dataCollection.size());
		dataCollection.add(new CD(101, "CD1", "Author A", 750));
		dataCollection.add(new CD(102, "CD2", "Author X", 1750));
		dataCollection.add(new CD(103, "CD3", "Author A", 890));
		dataCollection.add(new CD(104, "CD4", "Author Y", 2150));
		dataCollection.add(new CD(101, "CD1", "Author A", 750));
		dataCollection.add(new CD(105, "CD5", "Author Z", 1500));
		System.out.println("Size of dataCollection : "+dataCollection.size());

		Iterator<CD> iterator=dataCollection.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
