package mentoringkutuphane;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import Arraylist.arraylist1;



public class Kitaplik {
	
static int kitapNo=1000;
String arama;
	

	
ArrayList<Kitap> kitapList=new ArrayList<>();


 public void kitapKayit() {
	
	 Scanner scan=new Scanner(System.in);	
	
	 System.out.println("Kitap adini girin:");
	 
	 String kitapAdi;
	 
	 kitapAdi=scan.nextLine();
	 
	 System.out.println("Yazar adini girin:");
	 
	 String yazarAdi;
	 yazarAdi=scan.nextLine();
	 
	 System.out.println("Kitap fiyatini girin:");
	 
	 double fiyat=scan.nextDouble();
	
	 
	 Kitap kitap=new Kitap(++kitapNo ,kitapAdi, yazarAdi, fiyat);
	 
	 kitapList.add(kitap);
	
	 System.out.println("kitap eklendi");
	 
	 

}
 
 void kitapListele(){
	 
	 System.out.println("Kitap No\tKitap Adi\tYazar Adi\tFiyat :");
	 System.out.println("===========\t==============\t==============\t===========");
	 
	 for (int i = 0; i < kitapList.size(); i++) {
		 
		 
		 System.out.println(kitapList.get(i).kitapNo+"\t\t"+kitapList.get(i).kitapAdi+"\t\t"+kitapList.get(i).yazarAdi+
				 "\t\t"+kitapList.get(i).kitapFiyati);
		
	}
	 
 }
 
 public void numaraIleKitapGoruntule(){
	 Scanner scan=new Scanner(System.in);
	 System.out.println("Kitap no girin");
	 int kitapNo=scan.nextInt();
	 
	 for (int i = 0; i < kitapList.size(); i++) {
		 
		if (kitapList.get(i).kitapNo==kitapNo) {
			
			 System.out.println(kitapList.get(i).kitapNo+"\t"+kitapList.get(i).kitapAdi+"\t"+kitapList.get(i).yazarAdi+
					 "\t"+kitapList.get(i).kitapFiyati);
			
		}
	}
	
	 
	
	 
	 
 }
 
 public void bilgiKitapAra(int flag) {
	 
	 Scanner scan=new Scanner(System.in);	 
	
	 if (flag==1) {
		System.out.println("kitap adini girin:");
		arama=scan.nextLine().toUpperCase();
		
		for (int i = 0; i < kitapList.size(); i++) {
			
			if (kitapList.get(i).kitapAdi.contains(arama)) {				

				indexKitapBul(i);
			}
			
		}
		
	}
	 if (flag==2) {
		System.out.println("yazar adini girin:");
		
		arama=scan.nextLine().toUpperCase();
		
		for (int i = 0; i < kitapList.size(); i++) {
			
			if (kitapList.get(i).yazarAdi.contains(arama)) {				

				indexKitapBul(i);
			}
		}
	}
	
			
		}
 
 
    public void numaraIleKitapSil(){
    	
    	Scanner scan=new Scanner(System.in);    	
    	
    	System.out.println("Silmek istediginz kitabin numarasini girin:");
    	
    	int kitapNo=scan.nextInt();
    	
    	for (int i=0; i< kitapList.size(); i++) {
    		
    		if (kitapList.get(i).kitapNo==kitapNo) {
    			
				kitapList.remove(i);
				
				System.out.println("silme islemi tamamlandi");
			}
    		
    	}
    	
    	 
    	 
     }
    
    public void indexKitapBul(int i) {
    	
    	 System.out.println(kitapList.get(i).kitapNo+"\t"+kitapList.get(i).kitapAdi+"\t"+kitapList.get(i).yazarAdi+
				 "\t"+kitapList.get(i).kitapFiyati);
    	
    }
		
	
	
	 
 }
	



