package mentoring;

import java.util.Arrays;
import java.util.Scanner;

import Arraylist.arraylist1;

public class Difference_ArrayIndex {

	public static void main(String[] args) {
		/*
		 Create a function that takes an array and returns the difference between
		 and the smallest numbers.
		 Ask user to enter array elements.

		kullanıcının girdigi bir array'in en buyuk elemani ile 
		en kucuk elemanının  farkını bulan bir method create ediniz.
		 */
		Scanner scan=new Scanner(System.in);
		
		int k=0;
		
		System.out.println("Kac elemanli array olusturmak istersin : ");
		
		int arr[]=new int[scan.nextInt()];
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println(i+1+". sayiyi girin: ");
			arr[i]=scan.nextInt();
			
		}
		
		for (int i = 0; i < arr.length; i++) {
			
			k=arr[i];
			
		for (int j = i+1; j < arr.length; j++) {
			
			if (arr[i]>arr[j]) {
				
				k=arr[i];
				arr[i]=arr[j];
				arr[j]=k;
				
			}
		}
			
			}
		
		System.out.println("girdiginiz sayi dizisindeki en buyuk sayi ile en kucuk sayinin farki : "+(arr[arr.length-1]-arr[0]));
		}
				

	}


