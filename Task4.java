import java.util.Scanner;

public class Task4{
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
      

      switch(input) {
        case 1:
        if(input == 1){
          System.out.println("Mau cari keliling atau luas persegi ? ");
          System.out.println("1. Keliling");
          System.out.println("2. Luas");
          int bil = in.nextInt();
          if (bil == 1) {
              Persegi persegi = new Persegi();
              persegi.carikelilingpersegi();
          }else if (bil == 2) {
              Persegi2 persegi2 = new Persegi2();
              persegi2.cariluaspersegi();}
          break;
      }
      case 2:
      if(input == 2){
        System.out.println("Mau cari keliling atau luas persegi panjang ? ");
        System.out.println("1. Keliling");
        System.out.println("2. Luas");
        int bil = in.nextInt();
        if (bil == 1) {
            PersegiPanjang persegipanjang = new PersegiPanjang();
            persegipanjang.carikelilingpersegipanjang();
        }else if (bil == 2) {
            PersegiPanjang2 persegipanjang2 = new PersegiPanjang2();
            persegipanjang2.cariluaspersegipanjang();}
        break;
      
      }
      case 3: 
      if(input == 3){
        System.out.println("Mau cari keliling atau luas segitiga ? ");
        System.out.println("1. Keliling");
        System.out.println("2. Luas");
        int bil = in.nextInt();
        if (bil == 1) {
            Segitiga segitiga = new Segitiga();
            segitiga.carikelilingsegitiga();
        }else if (bil == 2) {
            Segitiga2 segitiga2 = new Segitiga2();
            segitiga2.cariluassegitiga();}
        break;
      }
      case 4:
      if(input == 4){
        System.out.println("Mau cari keliling atau luas Lingkaran ? ");
        System.out.println("1. Keliling");
        System.out.println("2. Luas");
        int bil = in.nextInt();
        if (bil == 1) {
            Lingkaran lingkaran = new Lingkaran();
            lingkaran.carikelilinglingkaran();
        }else if (bil == 2) {
            Lingkaran2 lingkaran2 = new Lingkaran2();
            lingkaran2.cariluaslingkaran();
        }
        break;
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

  void carikelilingpersegi(){  
    System.out.print("Masukan sisi : ");
    int sisi = in.nextInt();
    System.out.println("Karena Keliling persegi 4 x S, jadi keliling persegi adalah " + (4 * sisi));
  }
}

class Persegi2 {
    Scanner in = new Scanner(System.in);
    void cariluaspersegi(){  
        System.out.print("Masukan sisi : ");
        int sisi = in.nextInt();
        System.out.println("Karena Luas persegi S x S, jadi luas persegi adalah " + (sisi * sisi));
      }
}

class PersegiPanjang{
  Scanner in = new Scanner(System.in);

  void carikelilingpersegipanjang(){
    System.out.print("Masukan panjang : ");
    int panjang = in.nextInt();
    System.out.print("Masukan lebar: ");
    int lebar = in.nextInt();
    System.out.println("Karena Keliling persegi panjang adalah 2 x (P + L), Jadi keliling persegi panjang adalah " + (2 * (panjang + lebar)));
  }
  
}
class PersegiPanjang2{
  Scanner in = new Scanner(System.in);

  void cariluaspersegipanjang(){
    System.out.print("Masukan panjang : ");
    int panjang = in.nextInt();
    System.out.print("Masukan lebar: ");
    int lebar = in.nextInt();
    System.out.println("Karena Luas persegi panjang P x L, Jadi luas persegi panjang adalah " + (panjang * lebar));
  }
}


class Segitiga{
  Scanner in = new Scanner(System.in);
  
  void carikelilingsegitiga(){
    System.out.print("Masukan Sisi ke 1 : ");
    int sisi1 = in.nextInt();
    System.out.print("Masukan Sisi ke 2 : ");
    int sisi2 = in.nextInt();
    System.out.print("Masukan sisi ke 3 : ");
    int sisi3 = in.nextInt();
    System.out.println("Keliling segitiga adalah " + (sisi1 + sisi2 + sisi3));
  }
}
class Segitiga2{
  Scanner in = new Scanner(System.in);
  
  void cariluassegitiga(){
    System.out.println("Masukan alas :");
    int alas = in.nextInt();
    System.out.print("Masukkan tinggi: ");
    int tinggi = in.nextInt();
    System.out.println("Jadi Luas segitiga adalah " + ((alas * tinggi) / 2));
  }
}

class Lingkaran {
  Scanner in = new Scanner(System.in);
  double phi = Math.PI;

  void carikelilinglingkaran(){
    System.out.println("Jika diketahuinya jari-jari, maka masukan jari-jari : ");
    double jarijarir = in.nextInt();
    double diam = in.nextInt();
    System.out.println("Keliling lingkaran adalah " + (phi * jarijarir * 2));
    System.out.println("Luas lingkaran adalah " + (phi * jarijarir * jarijarir));
    System.out.println("Jika diketahuinya Diameter, maka masukan diameter : ");
    System.out.println("Keliling lingkaran adalah " + (phi * diam));
    System.out.println("Luas lingkaran adalah sama seperti yang diatas");
  }
}

class Lingkaran2 {
  Scanner in = new Scanner(System.in);
  double phi = Math.PI;

  void cariluaslingkaran(){
    System.out.println("Jika diketahuinya jari-jari, maka masukan jari-jari : ");
    double jarijarir = in.nextInt();
    double diam = in.nextInt();
    System.out.println("Keliling lingkaran adalah " + (phi * jarijarir * 2));
    System.out.println("Luas lingkaran adalah " + (phi * jarijarir * jarijarir));
    System.out.println("Jika diketahuinya Diameter, maka masukan diameter : ");
    System.out.println("Keliling lingkaran adalah " + (phi * diam));
    System.out.println("Luas lingkaran adalah sama seperti yang diatas");
  }
}
}


