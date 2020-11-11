/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan41.massajenis;

/**
 * @author Alfi Nurizkya
 * Nama     : Alfi Nurizkya
 * NIM      : 10119036
 * Kelas    : IF-1
 * Deskripsi Program : Program Menghitung Massa Jenis
 */
public class MassaJenis {
    private int sisi;
    private int massa;
    
    public int getSisi(){
        return sisi;
    }

    public void setSisi(int sisi){
        this.sisi = sisi;
    }

    public int getMassa(){
        return massa;
    }

    public void setMassa(int massa){
        this.massa = massa;
    }

    public int hitungVolume(int parSisi){
        return (int) Math.pow(parSisi, 3);
    }

    public int hitungMassaJenis(int parMassa, int volume){
        return parMassa / volume;
    }
}
