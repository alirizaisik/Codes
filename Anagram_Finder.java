package anagramProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;


public class Anagram_Finder {
	
	static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {
		/*
		Ask user to enter  2 Srtrings.
		If the characters and the numbers of characters of the Strings are same then print "Anagram"
		otherwise, print "Not Anagram" on the console.
		Ignore cases
		For example : "Mary" and "army" and "RAMY" are Anagrams

		Kullanıcıdan 2 String girmesini isteyin. String'lerin buyuk-kucuk harf duyarliligi olmadan
		karakterleri ve karakter sayıları aynıysa "Anagram" yazdırın,   aksi takdirde konsolda "Anagram Değil" yazdırın.
		Ornek : "Pide" ve"EDİP" anagram ifadelerdir..

		 */
		
		ArrayList<String> strLst1=new ArrayList<>();
		ArrayList<String> strLst2=new ArrayList<>();
		System.out.println("karsilastirmak istediginiz ilk stringi girin: ");
		String strOrj1=scan.next();
		System.out.println("karsilastirmak istediginiz ikinci sitringi girin: ");
		String strOrj2=scan.next();
		
		String arr1[]=(strOrj1.split(""));
		String arr2[]=(strOrj2.split(""));	
		
		for (int i = 0; i < arr1.length; i++) {
			
			strLst1.add(arr1[i]);
			strLst2.add(arr2[i]);
			
			
		}
		
		int sayac=0;
		
		for (int i = 0; i < strLst1.size(); i++) {			
			
			for (int j = 0; j < strLst2.size(); j++) {
				
				
				if (strLst1.get(i).equalsIgnoreCase(strLst2.get(j))) {
					
					sayac++;
					strLst2.remove(j);					
					break;
					
				}
				
			}
			
		}
		
		if (sayac==strLst1.size()) {
			
			System.out.println("girilen stringler anagramdir");
			
		}else {
			System.out.println("girilen stringler anagram degil");
		}
		
	}

}
