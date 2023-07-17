package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListPractice {

	public static void main(String[] args) {
			Collection<Integer> collection = new ArrayList<>();
			Collection<Integer> collection2 =new ArrayList<>();
			
			List<Student> students = new ArrayList<>();
			
			students.add(new Student(10, 7, 'A'));
			students.add(new Student(20, 7, 'A'));
			students.add(new Student(30, 7, 'A'));
			System.out.println(students);
			
			collection2.add(100);
			collection2.add(200);
			collection2.add(300);
			
			collection.add(20);
			collection.add(30);
			collection.add(40);
			collection.add(50);
			collection.add(50);
			System.out.println(collection.size());
			collection.clear();
			System.out.println(collection.isEmpty());
			
			collection.clear();
			System.out.println(collection);
			
			collection.addAll(collection2);
			System.out.println(collection);
			
			System.out.println(collection.contains(200));
			
			System.out.println(collection.containsAll(collection2));
			
//			System.out.println(collection.equals(100));
			
			collection.removeAll(collection);
			System.out.println(collection);
			System.err.println(collection.equals(collection2));
			System.out.println(collection.hashCode());
			int hash = collection2.hashCode();
			System.out.println(hash);
			
			
	}

}
