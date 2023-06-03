package com.fusion.institute.core.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class HelloWorld {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hello world");
//		HelloWorld hello =  new HelloWorld();
//		System.out.println(hello.hashCode());
//		System.out.println(hello.toString());
//		System.out.println(hello.equals("abhay"));
//		System.out.println(hello.getClass());
		
//		Employee emp = new Employee(101, "Akash", "Sharma", "9876543210");
//		System.out.println(emp.toString());
		
		Employee emp1 = new Employee(111, "Ankit", "Sharma", "98764311", 1996);
		Employee emp2 = new Employee(112, "Amol", "Sharma", "98764312", 1994);
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);
//		System.out.println("Before sorting");
		for (Employee employee : empList) {
//			System.out.println(employee.toString());
		}
		
		Collections.sort(empList);
		
//		System.out.println("After sorting");
		for (Employee employee : empList) {
//			System.out.println(employee.toString());
		}
		
		//Single dimentional array
		int[] intArr;
		int []intArr1= {1,2,3};
		int intArr2[] = new int[10];
		
		for(int i=0; i< intArr1.length; i++) {
			//System.out.println(intArr1[i]);
		}
		
		//ArrayList example
		
		List<Integer> intList = new ArrayList<>();
		intList.add(99);
		intList.add(34);
		intList.add(54);
		
		List<Object> intList1 = new ArrayList<>(Arrays.asList(45,23,76,45,67));
		intList1.add(89);
		intList1.add("Abhay");
		intList1.add(new Employee());
		
		//Iterator
		
		
		
		/*
		 * while(listItr.hasNext()) { System.out.println(listItr.next()); }
		 */
		
		Collections.reverse(intList1);
		Iterator listItr = intList1.iterator();
		
		/*
		 * while(listItr.hasNext()) { System.out.println(listItr.next()); }
		 */
		Queue q = new LinkedList<Integer>(Arrays.asList(8,2,5,1,6));
//		System.out.println(q.peek());
//		System.out.println(q.poll());
//		System.out.println(q.peek());
		
		PriorityQueue<Integer> pqueue = new PriorityQueue<>(Arrays.asList(8,2,5,1,6));
		//set examples
	    Set<Integer> intSet = new HashSet<>();
	    intSet.add(8);
	    intSet.add(1);
	    intSet.add(9);
	    intSet.add(8);
	    intSet.add(7);
	    intSet.add(7);
	    intSet.add(10);
	    
//	   System.out.println(intSet);
	   
	   TreeSet<String> strSet =  new TreeSet<>(Arrays.asList("Amit","Shilpa","Amar","Sazid","Amar"));
		
//	   System.out.println(strSet);
	   
	   //Map examples
	   HashMap<Integer,String> map = new HashMap<>();
	   map.put(99, "abc");
	   map.put(22, "pqr");
	   map.put(33, "xyz");
	   
//	  System.out.println(map);
	   Map<Integer,String> strMap = new TreeMap<>();
	   strMap.put(99, "abc");
	   strMap.put(22, "pqr");
	   strMap.put(33, "xyz");
	   System.out.println(strMap);
	}
	

 
   
	
	

}
