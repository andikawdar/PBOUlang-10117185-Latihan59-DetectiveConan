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
public class Character {
    //Atribute
    String nama;
    String status;
    String sifat;
    
    //Construction
    Character (String parNama, String parStatus, String parSifat){
        nama = parNama;
        status = parStatus;
        sifat = parSifat;
    }
    
    //Function
    void displayCharacter(){
        System.out.println("Nama    : "+nama);
        System.out.println("Status  : "+status+" Shinichi Kudo");
        System.out.println("Sifat   : "+sifat);
    }
}
