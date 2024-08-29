package com.prac.array;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Traversal{
	
	public static void main(String[] args) {
        
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		nums.add(6);
		
		System.out.println(nums);
		
		System.out.println(nums.get(1));
		
//		for(int i = 0; i < nums.size(); i++) {
//			Integer j = nums.get(i);
//			System.out.println(j);
//		}
		
//		for(Integer i : nums) {
//			System.out.println(i);
//		}
		
		Iterator<Integer> iteos = nums.iterator();
		while (iteos.hasNext()) {
			Integer i = iteos.next();
			System.out.print(i);
		}
			
			
		
	}
		
}