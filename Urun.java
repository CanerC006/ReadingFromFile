package Hafta_16;

public class Urun {
	
	private String markaModel;
	private String satici;
	private int fiyat;
	
	public Urun(String markaModel,String satici,int fiyat) {
		
		this.markaModel=markaModel;
		this.satici=satici;
		this.fiyat=fiyat;
		
	}
	public int getFiyat() {
		return fiyat;
	}
	public String toString() {
		return "Telefonun markaModeli :" + markaModel + " Satici : " + satici + " Fiyati : " + fiyat;
		
	}
}
