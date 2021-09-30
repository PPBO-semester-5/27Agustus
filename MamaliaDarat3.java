public class MamaliaDarat3{
//method main
	public static void main(String[] x){
		System.out.println("\nDemo Kelas Method dan Data\n");

		//cara membuat objek kucing
		Kucing kucing1=new Kucing();
		System.out.println("suara kucing1 = " + kucing1.mengeong());

		kucing1.setWarna("Putih");
		System.out.println("warna kucing1 = " + kucing1.getWarna());

		kucing1.setBuntut("Lurus Panjang");
		System.out.println("bentuk buntut kucing1 = " + kucing1.getBuntut());

		kucing1.setJumlahKaki(4);
		System.out.println("jumlah kaki kucing1 = " + kucing1.getJumlahKaki());
	
		Kucing kucing2=new Kucing();
		kucing2.setWarna("Hitam");
		System.out.println("\nwarna kucing2 = " + kucing2.getWarna());

		kucing2.setBuntut("Pendek Bengkok");
		System.out.println("bentuk buntut kucing2 = " + kucing2.getBuntut());

		kucing2.setJumlahKaki(4);
		System.out.println("jumlah kaki kucing2 = " + kucing2.getJumlahKaki());
	}
}

class Kucing{
//attribut
	String warna;
	String buntut;
	int jumlahKaki;
	
	//method fungsi
	public String mengeong(){
		return "ngeong";
	}
	
	public String getWarna(){
		return this.warna;
	}
	
	public String getBuntut(){
		return this.buntut;
	}

	public int getJumlahKaki(){
		return this.jumlahKaki;
	}
	
	//method prosedur
	public void setWarna(String w){
		this.warna = w;
	}
	
	public void setBuntut(String b){
		this.buntut = b;
	}

	public void setJumlahKaki(int jk){
		this.jumlahKaki = jk;
	}

}