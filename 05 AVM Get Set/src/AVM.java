
public class AVM {

	private int calisanSayisi;
	private int dukkanSayisi;
	private int musteriSayisi;
	
	// setter metodlar� atama yapar
	public void setCalisanSayisi(int _calisansay)
	{
		this.calisanSayisi=_calisansay;	
	}
	
	public void setDukkanSayisi(int _dukkansay)
	{
		this.dukkanSayisi=_dukkansay;
	}
	
	public void setMusteriSayisi(int _musterisay) {
		this.musteriSayisi=_musterisay;
	}
	//getter metodlar okuma yapar
	public int getCalisanSayisi() {
		return(this.calisanSayisi);
	}
	
	public int getDukkanSayisi() {
		return (this.dukkanSayisi);
	}
	
	public int getMusteriSayisi() {
		return (this.musteriSayisi);
	}
	
	public void yaz() {
		System.out.println("M��teri Say�s�:"+this.getMusteriSayisi());
		System.out.println("D�kkan Say�s�:"+this.getDukkanSayisi());
		System.out.println("�al��an Say�s�:"+this.getCalisanSayisi());
		
	}
	
}
