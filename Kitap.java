package mentoringkutuphane;

public class Kitap {
	
	  String kitapAdi;
	  String yazarAdi;
	  int kitapNo;
	 double kitapFiyati;
	
	 public Kitap() {
		
	}
	 
	 public Kitap (int kitapNo, String kitapAdi, String yazarAdi, double kitapFiyati ){
	this.kitapNo=kitapNo;
	this.kitapAdi=kitapAdi.toUpperCase();
	this.yazarAdi=yazarAdi.toUpperCase();
	this.kitapFiyati=kitapFiyati;
	
}


}
