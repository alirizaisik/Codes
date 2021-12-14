package mentoringkutuphane;



import java.util.Scanner;


public class Runner {
	
static int secim=0;	
	
	/*
	  * bir kitapci icin program yazalim kitap no 1000'den baslayacak sirali no olsun
	 * program baslayinca menu isminde bir method calissin
1-kitap ekle
2-numara ile kitap goruntule
3-bilgi ile kitap goruntule
4-numara ile kitap sil
5-tum kitaplari listele
6-cikis
************************************
1.olarak her kitaba ait kitap no olacak, sonra kitap adi olacak, buna ait yazar adi olacak
ve kitap fiyati olacak bu bilgilerin tutulacagi bir yer olmali yani bir
list'te tutmamiz gerek
2-kitap numarasi 1000'den baslamali,her kitap
eklendiginde bir artacagi icin sayac gibi dusunulebilinir count=1000; menu
isminde bir method olusturmaliyim,
3-kitap ekle diye bir method olusturmliyim,bu method farkli bir classda
4-kullanicidn kitap adi yazar adi ve fiyat bilgileri istenmeli
	 */
	
	
	
	
	 
	
	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);		
	
	
	Kitaplik islem=new Kitaplik();
		
		
		
		do {
			
			System.out.println("Yapmak istediginiz islemi girin:");
			System.out.println("===================================");
			System.out.println("1-Kitap ekle\n2-Numara ile kitap goruntule"
					+ "\n3-Bilgi ile kitap goruntule\n4-Numara ile kitap sil\n5-Tum kitaplari listele\n6-Cikis");
			
			secim=scan.nextInt();
			
			switch (secim) {
			
			case 1:
				
		islem.kitapKayit();
				
				break;
				
			case 2:
				
				islem.numaraIleKitapGoruntule();				
				
				break;
				
			case 3:
				System.out.println("Hangi bilgi ile arama yapmak istersin:\nKitap adi icin : 1\nYazar adi icin : 2");
				Integer flag=scan.nextInt();
				islem.bilgiKitapAra(flag);
	
				break;
				
			case 4:
				islem.numaraIleKitapSil();
				break;
				
			case 5:
				
			islem.kitapListele();
				
				break;	
				
			case 6:
				
				break;

			default:
				
				System.out.println("Yanlis deger girdiniz. Tekrar deneyin\n");
				break;
			}
			
		} while (secim!=6);
		
		System.out.println("Cikis yaptiniz.");
	

		
	
		
		
//Burdan sonra methodlar var		


}
}
