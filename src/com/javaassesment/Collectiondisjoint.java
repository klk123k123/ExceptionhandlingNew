package com.javaassesment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collectiondisjoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1=new ArrayList<>();
		
Collections.addAll(list1, 1,2,3,4,5);

List<Integer> list2=new ArrayList<>();

Collections.addAll(list2, 3,4,5,6,7);

boolean isSimilar=Collections.disjoint(list1, list2);
if(isSimilar)
	System.out.println("No Similar Elements");
else
	System.out.println("Similar Elemts");

	}

}
