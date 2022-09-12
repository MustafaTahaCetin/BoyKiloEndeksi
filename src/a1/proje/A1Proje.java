
package a1.proje;

import com.sun.org.apache.xpath.internal.operations.And;
import java.util.Scanner;

public class A1Proje {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
//------------------scanner oluşturuldu--------------------

        System.out.println("Lütfen adınızı giriniz: ");
        String Isim = scanner.nextLine();
        System.out.println("                        ");
        
        System.out.println("Lütfen soyadınızı giriniz: ");
        String SoyAd = scanner.nextLine();
        System.out.println("                                               ");
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        
        System.out.println("Sayın " + Isim + " " + SoyAd + " hoş geldiniz");
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        System.out.println("                                               ");
        
//---------------------kullanıcıdan ad ve soyad bilgilerini aldık ve ekrana yazdırmış olduk----------------
        
        System.out.println("Lütfen boyunuzu yazınız: ");
        double Boy = scanner.nextDouble(); 
        System.out.println("                         ");
        
//-------------------boy bilgisi alındı-------------------------------
        
        if (Boy > 10) {
            
            Boy = (Boy / 100);
            
        }
        
//-------------------------------if ile boyunu istediği şekilde yazabilir bizim işlemimize bir sorun yaratmayacak------------------------------------------          
        
        System.out.println("Lütfen kilonuzu yazınız: ");
        double Kilo = scanner.nextDouble();
        System.out.println("                          ");
        
//--------------------------kilo bilgisi alındı--------------------------------

        double BoyKiloEndeksi = ( Kilo / (Boy * Boy) );

//-----------------------boy kilo endeksi hesaplandı------------------------------

        String KullanıcınBulunduğuKilolulukDerecesi ;

        if (BoyKiloEndeksi <= 18.5) {
            
            KullanıcınBulunduğuKilolulukDerecesi = "ZAYIF" ;
                
        }
        
        else if (BoyKiloEndeksi <= 24.9 ) {
            
            KullanıcınBulunduğuKilolulukDerecesi = "NORMAL" ;
            
        }

        else if (BoyKiloEndeksi <= 29.9) {
            
            KullanıcınBulunduğuKilolulukDerecesi = "KİLOLU" ;
            
        }
        
        else if (BoyKiloEndeksi <= 34.9) {
            
            KullanıcınBulunduğuKilolulukDerecesi = "OBEZ" ;
            
        }
        
        else {
            
            KullanıcınBulunduğuKilolulukDerecesi = "MORBİD OBEZ" ;
            
        }
        
//------------------else ve if kullanarak kullanıcın bulunduğu kiloluk derecesini bulduk-------------------------------
        
        System.out.println("Sayın " + Isim + " " + SoyAd);
        Boy = Boy * 100;
        System.out.println("şu anda " + Boy + " santimetre boyunda ve " + Kilo + " kilodasınız");
        Boy = Boy / 100;
        System.out.println("Bu verilere göre");
        System.out.println("vücut kitle endeksiniz: ");
        System.out.println(BoyKiloEndeksi + " olarak hesaplanmaktadır . Yani,");
        System.out.println(KullanıcınBulunduğuKilolulukDerecesi + " " + "Kategorisine girmektesiniz");
        System.out.println("                                                                       ");
        
//---------------------------------Bilgiler yazıldı--------------------------------
        
        System.out.println("------------------------------------");
        System.out.println("18.5 veya daha düşükse = ZAYIF");
        System.out.println("18.5 ile 24.9 arsında ise = NORMAL");
        System.out.println("25 ile 29.9 arasında ise = KİLOLU");
        System.out.println("30 ile 34.9 arasında ise = OBEZ");
        System.out.println("35 veya daha fazla ise = MORBİD OBEZ");
        System.out.println("-------------------------------------");
        System.out.println("                                      ");
        
//-------------------boy kilo endeksi ile ilgili kullanıcıya bilgiler verildi-----------------------------
        
        System.out.println("Lütfen istediğiniz vücut kitle endeksi değerini giriniz: ");
        double IstenilenBoyKiloEndeksiSayi = scanner.nextDouble();
        String IstenilenBoyKiloEndeksiKelime ;
        System.out.println("                                                          ");
        
        if (IstenilenBoyKiloEndeksiSayi <= 18.5) {
            
            IstenilenBoyKiloEndeksiKelime = "ZAYIF" ;
                
        }
        
        else if (IstenilenBoyKiloEndeksiSayi <= 24.9 ) {
            
            IstenilenBoyKiloEndeksiKelime = "NORMAL" ;
            
        }

        else if (IstenilenBoyKiloEndeksiSayi <= 29.9) {
            
            IstenilenBoyKiloEndeksiKelime = "KİLOLU" ;
            
        }
        
        else if (IstenilenBoyKiloEndeksiSayi <= 34.9) {
            
            IstenilenBoyKiloEndeksiKelime = "OBEZ" ;
            
        }
        
        else {
            
            IstenilenBoyKiloEndeksiKelime = "MORBİD OBEZ" ;
            
        }
        
//---------------kullanıcın istediği boy kilo edneksini aldık ve değerlerini bulduk-------------------
        
        double OlmasıGerekenKilo = ((Boy * Boy) * IstenilenBoyKiloEndeksiSayi);
        double VermesiGerekenKilo = (OlmasıGerekenKilo - Kilo);
        String Yazdirilacak = null;
        
        if (VermesiGerekenKilo < 0) {
            VermesiGerekenKilo = (VermesiGerekenKilo * -1);
            Yazdirilacak = " kilo vermeniz lazım";
        }
        
        else if (VermesiGerekenKilo > 0){
            Yazdirilacak = " kilo almanız lazım";
        }
        
        else if (VermesiGerekenKilo == 0){
            Yazdirilacak = " kilo almanıza veya vermenize gerek yok";
        }
        
//----------------istenilen endekse göre vermesi gereken kiloyu ve olması gereken kiloyu bulduk----------------
        
        System.out.println("Sayın " + Isim + " " + SoyAd);
        System.out.println(IstenilenBoyKiloEndeksiSayi + " Vücut kitle endeksine ulaşabilmeniz ve");
        System.out.println(IstenilenBoyKiloEndeksiKelime);
        System.out.println("olabilmeniz için ");
        System.out.print(VermesiGerekenKilo );
        System.out.println(Yazdirilacak);
        System.out.println("                           ");
        
        
    }

    private static void And() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
