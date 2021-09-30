class Matematika{
 // Mendeklarasikan variabel kelas
 private double hasil; 
// Method penjumlahan 
public double jumlah(double a, double b){
hasil = a + b;
return hasil;
} 
 // Method pengurangan
 public double kurang(double a, double b){
hasil = a - b;
return hasil; 
 } 
 // Method perkalian
 public double kali(double a, double b){
 hasil = a * b; 
 return hasil; 
 } 
 // Method pembagian
 public double bagi(double a, double b){
 hasil = a / b; 
 return hasil; 
 }
} 
public class MatematikaTest{ 
/**Main Method*/
public static void main(String [] args){
// Mendeklarasikan data
double a = 100.0; double b = 3.0;
double hasilJumlah, hasilKurang, hasilKali, hasilBagi;
// Membuat objek "hitung" dari kelas Matematika
Matematika hitung = new Matematika();
hasilJumlah = hitung.jumlah( a, b );
hasilKurang = hitung.kurang( a, b );
hasilKali = hitung.kali( a, b );
hasilBagi = hitung.bagi( a, b );
// Mencetak hasil di console
System.out.println("\nPROGRAM DEMO OPERASI MATEMATIKA");
System.out.println("-------------------------------\n");
System.out.println("Penjumlahan " + a + " + " + b + " = " + hasilJumlah);
System.out.println("\nPengurangan " + a + " - " + b + " = " + hasilKurang);
System.out.println("\nPerkalian " + a + " x " + b + " = " + hasilKali);
System.out.println("\nPembagian " + a + " / " + b + " = " + hasilBagi);
}
}
