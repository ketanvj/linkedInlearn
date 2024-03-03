package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//Changed and will be staged before committing. 
//Adding comments demo of files modified after commit.
public class ArrayListExamples {

	// You as a programmer are telling the future colleagues that this method may
	// throw ArithmeticException

//This line was added in Main branch. 
	public static void main(String[] args) throws ArithmeticException, IOException {
		// TODO Auto-generated method stub
		List firstList = new ArrayList(); //raw list, Object, EVERY ENTRY IS OF Object
		//Object class is the parent of all the classes in Java. 
		int[] num = {1,2,3,4,5,6,7,8,9,10};
		int[] num1 = new int[5];
		
		//ArrayList is class which implements List interface in Java 
		for (int i = 0; i < 5; i++) {
			firstList.add(i);
		}
		//autoboxing - Java internally converts int to Integer, double to Double, 
		System.out.println(firstList);
		firstList.add("ICC World Cup");
		System.out.println(firstList);
		int i = (int)firstList.get(1); //array[0]
		String name = (String)firstList.get(5);
		//type mismatch cannot convery Object to int
		//In ArrayList you cannot store primitive data types. 
		
		//Java
		//primitive data types - int, char, boolean, float,double, byte, long, short
		//classes
		
		List<Integer> salaries = new ArrayList();
		List<Integer> salaries1 = new ArrayList<Integer>();
		List<String> names = new ArrayList<String>();
		List<Box> boxes = new ArrayList<Box>();
		//salaries.add("India vs Aus");//type safety in Java
		//Generics in Java
		System.out.println("Is Names list empty? " + names.isEmpty());
		names.add("Virat");
		names.add("Rohit");
		names.add("Ishan");
		names.add("Shami");
		names.add("Ishan");
		names.add("KL");
		names.add("Kuldeep");
		System.out.println(names.get(1));
		
		
		System.out.println("Index where Ishan is stored " + names.indexOf("Ishan"));
		System.out.println("Last Index where Ishan is stored " + names.lastIndexOf("Ishan"));
		
		List lastFourNames = names.subList(3, names.size());
		System.out.println("List containing Last four names" + lastFourNames);
		System.out.println("Names Before Sorting" + names);
		Collections.sort(names);
		System.out.println("Names After Sorting" + names);
		Collections.reverse(names);
		
		System.out.println("Is Names list empty?" + names.isEmpty());
		
		List newNames = new ArrayList(names);
		
		System.out.println("Is newNames and names are identical? " + names.equals(newNames));
		String[] namesInArray = (String[])names.toArray();
		
		boxes.add(new Box(4,6,3));
		Box b2 = new Box(8,4,2);
		boxes.add(b2);
		double lenghtOfSecondBox = boxes.get(1).getLength();
		double widthOfSecondBox =boxes.get(1).getWidth();
		double heightOfSecondBox =boxes.get(1).getHeight();
		
		System.out.println("Using traditional for loop");
		for (int j=0; j < boxes.size(); j++) {
			System.out.println(boxes.get(j).getLength());
			System.out.println(boxes.get(j).getWidth());
			System.out.println(boxes.get(j).getHeight());			
		}	
		
		System.out.println("Using enhanced for loop");
		
		for (Box myBox: boxes) {			
			System.out.println(myBox.getLength());
			System.out.println(myBox.getWidth());
			System.out.println(myBox.getHeight());
		}
		
		
	int[] runs = {150,200,120};
	for (int run: runs) {
		System.out.println(run);
	}
	
	//add, get, size
	
		
		
	}

}
