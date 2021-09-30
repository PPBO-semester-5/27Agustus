public class MamaliaDarat{
//method main
public static void main(String[] args){
// Mendeklarasikan dan menginisialisasi data
 String suaraHewan = "";
 System.out.println("\nDEMO KELAS, METHOD DAN DATA");
 System.out.println("---------------------------\n");
// Instansiasi objek pussy
 Kucing pussy = new Kucing();
//memanggil method mengeong()
 suaraHewan = pussy.mengeong();
 System.out.println("Pussy : " + suaraHewan);
// Instansiasi objek doggy
 Anjing doggy = new Anjing();
//memanggil method menggonggong ()
 suaraHewan = doggy.menggonggong();
 System.out.println("Doggy : " + suaraHewan);
// Instansiasi objek siKumbang
 Macan siKumbang = new Macan();
//memanggil method mengaum ()
 suaraHewan = siKumbang.mengaum();
 System.out.println("Si Kumbang : " + suaraHewan);
 }
}
class Kucing {
 // Method yang mengembalikan suara kucing
 public String mengeong() {
 String suara = new String("Meoong...");
 return suara;
 }
}
class Anjing{
 // Method yang mengembalikan suara anjing
 public String menggonggong() {
 String suara = new String("Guk..Guk...");
 return suara;
 }
}
class Macan {
 // Method yang mengembalikan suara macan
 public String mengaum() {
 String suara = new String("Auummm...");
 return suara;
 }
}
