import java.util.Scanner;

public class Task3{
  public static void main(String[] args){
    while(true){
      Scanner in = new Scanner(System.in);
      String namaanda;
      System.out.print("Yo kenalin diri anda dulu ");
      namaanda = in.nextLine();
      System.out.println("Halo " + namaanda);

      System.out.println("******* WELCOME " +  namaanda + " DISINI " + namaanda +" AKAN MENGHITUNG KELILING LUAS BANGUN DATAR *******");
      System.out.println("1. Persegi");
      System.out.println("2. Persegi Panjang");
      System.out.println("3. Segitiga");
      System.out.println("4. Lingkaran");
      System.out.println("5. Sudahi?");
      System.out.println("Berikut list bangun datar yang dapat " + namaanda + " pilih");
      System.out.println("Pilih nomor bangun datar : ");

      int input = in.nextInt();

      
      if(input == 1){
        Persegi persegi = new Persegi();
        persegi.cariklpsg();
      }else if(input == 2){
        PersegiPanjang persegipanjang = new PersegiPanjang();
        persegipanjang.cariklpsgpanjang();
      }else if(input == 3){
        Segitiga segitiga = new Segitiga();
        segitiga.cariklsegitiga();
      }else if(input == 4){
        Lingkaran lingkar = new Lingkaran();
        lingkar.carikllingkaran();
      }else if(input == 5 ){
        System.out.println("SANGKYU");
        break;
      }else{
        System.out.println("Undefined");
      }
    }
  }
}

class Persegi{
  Scanner in = new Scanner(System.in);

  void cariklpsg(){  
    System.out.print("Masukkan sisi : ");
    int sisi = in.nextInt();
    System.out.println("Karena Keliling persegi 4 x S, jadi keliling persegi adalah " + (4 * sisi));
    System.out.println("Karena Luas persegi S x S, jadi luas persegi adalah " + (sisi * sisi));
  }
}

class PersegiPanjang{
  Scanner in = new Scanner(System.in);

  void cariklpsgpanjang(){
    System.out.print("Masukkan panjang : ");
    int panjang = in.nextInt();
    System.out.print("Masukkan lebar: ");
    int lebar = in.nextInt();
    System.out.println("Karena Luas persegi panjang P x L, Jadi luas persegi panjang adalah " + (panjang * lebar));
    System.out.println("Karena Keliling persegi panjang adalah 2 x (P + L), Jadi keliling persegi panjang adalah " + (2 * (panjang + lebar)));
  }
}


class Segitiga{
  Scanner in = new Scanner(System.in);
  
  void cariklsegitiga(){
    System.out.print("Sisi ke 1 : ");
    int sisi1 = in.nextInt();
    System.out.print("Sisi ke 2 : ");
    int sisi2 = in.nextInt();
    System.out.print("sisi ke 3 : ");
    int sisi3 = in.nextInt();
    System.out.println("Keliling segitiga adalah " + (sisi1 + sisi2 + sisi3));
    System.out.println("");
    System.out.println("Untuk luasnya, masukan alas :");
    int alas = in.nextInt();
    System.out.print("Masukkan tinggi: ");
    int tinggi = in.nextInt();
    System.out.println("Luas segitiga adalah " + ((alas * tinggi) / 2));
  }
}

class Lingkaran {
  Scanner in = new Scanner(System.in);
  double phi = Math.PI;

  void carikllingkaran(){
    System.out.println("Jika diketahuinya jari-jari, maka masukan jari-jari : ");
    double jarijarir = in.nextInt();
    double diam = in.nextInt();
    System.out.println("Keliling lingkaran adalah " + (phi * jarijarir * 2));
    System.out.println("Luas lingkaran adalah " + (phi * jarijarir * jarijarir));
    System.out.println("Jika diketahuinya Diameter, maka masukan diameter : ");
    System.out.println("Keliling lingkaran adalah " + (phi * diam));
    System.out.println("Luas lingkaran adalah sama seperti yang diastas ");
  }
}


