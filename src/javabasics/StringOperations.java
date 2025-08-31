package javabasics;

import java.util.Arrays;
import java.util.List;

public class StringOperations {

	public static void main(String[] args) {
		
		String myStr = "Siva Sankar";
		String myStr1 = "Siva Sankar";
		
		String myStr2 = new String("Pavani");
		String myStr3 = new String("Dhamini");
		
		System.out.println(myStr +" : My string one");
		System.out.println(myStr1 +" : My String two");
	
		System.out.println(myStr2+" : My String three");
		System.out.println(myStr3+" : My String four");
		
		String myString = "abc 9 bcd 10 cde 11";
		System.out.println(myString.split(" ")[1]);
		
		String[] myArray = myString.split(" ");
		
		List<String> aL = Arrays.asList(myArray);
		for(int i = 0;i<aL.size();i++)
		{
			System.out.println(aL.get(i).trim());
			if(aL.contains("Siva"))
			{
				System.out.println("False Validation");
				break;
			}
		}
		
		System.out.println("----------Printing char by char------------");
		for(int j=0;j<myString.length();j++)
		{
			System.out.println(myString.charAt(j));
		}
		
		
		System.out.println("------------Reverse of String------------");
		for(int k = myString.length()-1;k>=0;k--)
		{
			System.out.println(myString.charAt(k));
		}
	}

}
