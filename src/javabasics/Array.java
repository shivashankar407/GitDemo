package javabasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array {

	public static void main(String[] args) {
		// int myNum = 10;
		int[] myNum = new int[5];
		myNum[0] = 1;
		myNum[1] = 2;
		myNum[2] = 3;
		myNum[3] = 4;
		myNum[4] = 5;

		System.out.println("Print Single variable of Array : " + myNum[3]);

		for (int i = 0; i < myNum.length; i++) {
			System.out.println("Multiple variables of Array : " + myNum[i]);
		}
		System.out.println("-------------------------------");
		int[] myNum2 = { 1, 3, 5, 2, 4, 7, 9, 6, 8, 10 };
		for (int j = 0; j < myNum2.length; j++) {
			if ((myNum2[j] % 2) == 0) {
				System.out.println("First occurence Multiple of 2 : " + myNum2[j]);
				break;
			} else {
				System.out.println("Multiple of not 2 : " + myNum2[j]);
			}
		}

		System.out.println("----------------------------------");
		String[] myName = { "Siva", "Sankar", "Battula", "Dhamini", "Pavani" };
		for (int k = 0; k < myName.length; k++) {
			System.out.println("Staring array : " + myName[k]);
		}

		System.out.println("-------------------------------------");
		String[] myCourse = { "rahul", "Shetty", "academy" };
		for (String s : myCourse) {
			System.out.println("String enhanced For loop : " + s);
		}

		System.out.println("----------------------------------------");
		int[] myNum3 = { 4, 2, 0, 7, 9 };
		for (int n : myNum3) {
			System.out.println("Int enhanced for loop : " + n);
		}

		
		System.out.println("--------------ArrayList-----------");
		ArrayList myNum4 = new ArrayList();
		myNum4.add(3);
		myNum4.add(5);
		myNum4.add(7);
		System.out.println(myNum4.get(2));
		for(int k = 0;k<myNum4.size();k++)
		{
			System.out .println(myNum4.get(k));
		}
//		Array<String> al = new ArrayList<String>();
		
//		ArrayList<String> mystr = new ArrayList<String>();
ArrayList<String> myStr = new ArrayList<String>();
	myStr.add("shiva");
	myStr.add("shankar");
		myStr.add("pavani");
		myStr.add("Dhamini");
		System.out.println(myStr.get(2));
		for(int m=0;m<myStr.size();m++) {
			System.out.println(myStr.get(m));
		}
		
		for(String ster : myStr)
		{
			System.out.println(ster);
		}
		//Conversion of Array to Arraylist
		System.out.println("----------INT--------------");
		int[] myArray = {22,34,35,45,56,78,89,90};
		List myAL = Arrays.asList(myArray);
//		System.out.println(myAL.get(4));
		for(int y=0;y<myAL.size();y++)
		{
			System.out.println(myAL.get(y));
		}
		
		System.out.println("----------STR--------------");
		String[] mySTR = {"shiva","shankar","pavani","Dhamini"};
		List <String> rty = Arrays.asList(mySTR);
		System.out.println(rty.get(2));
		for(int z=0;z<rty.size();z++)
		{
			System.out.println(rty.get(z));
			if(rty.get(z).contains("Dhamini"))
			{
				System.out.println("Text is present");
				break;
			}
		}
	}
}
