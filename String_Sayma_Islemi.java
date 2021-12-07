package mentoring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mentoring02 {

	public static void main(String[] args) {		
		
	
		  
		 /* For Example:
		  Input :  String is "Ali came to school and Ayse came to school"
		  Output : Ali=1, came=2, to=2, school=2, and=1, Ayse=1
			 */
		
		
			String str="Ali came to school and Ayse came to school";
			
			String arr[]=str.split(" ");
			
			List<String> list=new ArrayList<>();
			
			for (int i = 0; i < arr.length; i++) {
				list.add(arr[i]);
			}
		
			
			int sayac=0;			
			
			for (int i = 0; i < list.size(); i++) {				
				
				sayac++;
					
				for (int j = i+1; j < list.size(); j++) {
					
					if (list.get(i).equals(list.get(j))) {
						sayac++;
						list.remove(j);
						
					
					
					}
					
				}
				
				System.out.println(list.get(i)+" kelimesi: "+sayac+" adet");
				sayac=0;
			}
			
			
			}
	}


