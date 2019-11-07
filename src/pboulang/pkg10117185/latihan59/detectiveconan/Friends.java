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
public class Friends extends Character{
    //Atribute
    String tipe;
    String teman;
    
    //Construction
    Friends(String parNama, String parPeran, String parSifat){
       super(parNama, parPeran, parSifat);
    }
    
    //Function
    public String getTipe() {
        return tipe;
    }

    public void setTipe(String parTipe) {
        tipe = parTipe;
    }

    public String getTeman() {
        return teman;
    }

    public void setTeman(String parTeman) {
        teman = parTeman;
    }
}
