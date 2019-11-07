/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10117185.latihan59.detectiveconan;

/**
 *
 * @author user
 * Nama     : Andhyka Widariyanto
 * Kelas    : PBO Ulang
 * NIM      : 10117185
 * Tugas    : Latihan 59 - Detective Conan
 */
public class PBOUlang10117185Latihan59DetectiveConan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("======Detective Conan Characters=====");
        
        Family ay = new Family("Yusaku Kudo", "Ayah", "Pintar");
        Family is = new Family("Yukiko Kudo", "Ibu", "Pintar Akting");
        Family an = new Family("Shinichi Kudo", "Ia lah", "Sangat Cerdas");
        System.out.println("");
        ay.setTipe("1. Tokoh Keluarga");
        ay.setSebutan("Keluarga Detective");
        System.out.println(ay.getTipe());
        System.out.println("");
        ay.displayCharacter();
        System.out.println("");
        is.displayCharacter();
        System.out.println("");
        an.displayCharacter();
        System.out.println("Sebutan : "+ay.getSebutan());
        System.out.println("");
        
        Friends eh = new Friends("Eisuke Hondo", "Teman Kelas", "Ceroboh");
        Friends rm = new Friends("Ran Mouri", "Sahabat", "Senang Membantu");
        System.out.println("");
        eh.setTeman("2. Tokoh Teman");
        eh.setTipe("Tokoh Pendukung");
        System.out.println(eh.getTeman());
        System.out.println("");
        eh.displayCharacter();
        System.out.println("Sebutan : "+eh.getTipe());
        System.out.println("");
        rm.displayCharacter();
        System.out.println("Sebutan : "+eh.getTipe());
        System.out.println("");
        
        
        Enemies hh = new Enemies("Heiji Hattori", "Rival", "Petarung");
        Enemies kp = new Enemies("Kaitō Kiddo", "Penjahat", "Mencuri");
        System.out.println("");
        hh.setDari("3. Tokoh Musuh");
        hh.setTipe("Osaka");
        kp.setTipe("Si Pencuri");
        System.out.println(hh.getDari());
        System.out.println("");
        hh.displayCharacter();
        System.out.println("Dari    : "+hh.getTipe());
        System.out.println("");
        kp.displayCharacter();
        System.out.println("Julukan : "+kp.getTipe());
        System.out.println("");
        
        
    }
    
}
